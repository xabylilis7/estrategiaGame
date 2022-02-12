/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategygameprototype;

import java.text.DecimalFormat;

/**
 *
 * @author javierzapata
 */
public class Guerrero {
    private double ataque;
    private double vida;
    private double escudo;
    private String nombre;
    private String nombreHabilidad;
    private double ataqueHabilidad;
    public Estrategia estrategia;
    
    public Guerrero(String nombre, int vida, int ataque, int escudo, Estrategia estrategia){
        this.vida = vida;
        this.ataque = ataque;
        this.escudo = escudo;
        this.nombre = nombre;
        this.estrategia = estrategia;
    }

    public double getAtaque() {
        return ataque;
    }

    public double getVida() {
        return vida;
    }

    public double getEscudo() {
        return escudo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }
    
    public boolean estaVivo(){
        return this.vida > 0;
    }
    
    
    public void atacar(Guerrero enemigo, int tiempo ){
        System.out.println("-------------------------");
        System.out.println(this.nombre);
        double ataque = this.estrategia.activar(this, tiempo);
        System.out.println("ataque: " +ataque);
        DecimalFormat df = new DecimalFormat("###.##");
        double danio = ataque * 4 - enemigo.escudo * 2;
        danio = Math.abs(danio);
        danio = (danio * 20)/100;
        System.out.println(this.nombre +" reduce la vida de "+enemigo.nombre + " en: "+danio);
        System.out.println("-------------------------");
        if (enemigo.vida > 0){
            enemigo.vida = Double.parseDouble(df.format(enemigo.vida - danio));
        }
        else{
            enemigo.vida = 0;
        }
        
        //10 a 10 daño=4
        //10 a 1 daño=6
        //5 a 5 daño= 2
        //1 a 10 daño=crece, entonces ataque siempre mayor a 5
        //5 a 10 daño=0
        //6 a 10 daño=0,8
        //6 a 1 daño= 4,4
    }
    
    
}
