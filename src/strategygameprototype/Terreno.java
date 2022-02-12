/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategygameprototype;

/**
 *
 * @author javierzapata
 */
public class Terreno {
    
    private boolean gameOver = false;
    // 1vs1
    // Mecanica de ataque y reduccion de vida
    public void combate(Guerrero g1, Guerrero e1) {
        Runnable runnable = () -> {
            // Esto se ejecuta en segundo plano una única vez
            System.out.println("***** Inicio de la batalla *****");
            System.out.println("");
            System.out.println("");
            int tiempo = 0;
            while (true) {
                // Pero usamos un truco y hacemos un ciclo infinito
                try {
                    // En él, hacemos que el hilo duerma
                    Thread.sleep(1000);
                    tiempo++;
                    if (g1.estaVivo() && e1.estaVivo()){
                        g1.atacar(e1, tiempo);
                        e1.atacar(g1, tiempo);
                        mostrarEstadisticas(g1, e1, tiempo);
                    }
                    else{
                        gameOver = true;
                        mostrarGanador(g1, e1);
                        break;
                    }

                    
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        // Creamos un hilo y le pasamos el runnable
        Thread hilo = new Thread(runnable);
        hilo.start();
    }

    private void mostrarEstadisticas(Guerrero g1, Guerrero e1, int tiempo) {
        System.out.println("Tiempo  "+g1.getNombre()+"-vida      "+    g1.getNombre()+ "-escudo     |"  +e1.getNombre()+ "-vida       "+   e1.getNombre()+ "escudo       ");
        if (tiempo >= 10){
            System.out.print("T"+tiempo + ":        ");
        }
        else{
            System.out.print("T"+tiempo + ":          ");
        }
        System.out.println(g1.getVida() + "           " + g1.getEscudo() + "         |       " + e1.getVida() + "               " + e1.getEscudo());
        System.out.println("");
        System.out.println("");
    }

    public void mostrarGanador(Guerrero guerrero1, Guerrero enemigo1) {
        System.out.println("");
        System.out.println("");
        if(!guerrero1.estaVivo()){
            System.out.println("***** Murio el guerrero! *****");
        }
        else{
            System.out.println("***** Murio el monstruo! *****");
        }
    }

    
    
}
