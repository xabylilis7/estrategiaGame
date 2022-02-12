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
public class EstrategiaRafa implements Estrategia {

    private int rafaga;
    private double vidaRestante;
    public EstrategiaRafa(int i) {
        this.rafaga = i;
        this.vidaRestante = 25.0;
        
    }
    
    //se activa cuando la vida esta en menos de 10 y la rafaga aumenta el poder 
    //de tu ataque en 15 (dependiendo la organizacion de las estrategias) y debido
    //a este ataque de rafaga su escudo se vuelve 0.
    //O sea es como si fuera a DARLE CON TODO Y MORIR.
    @Override
    public double activar(Guerrero guerrero, int tiempo) {
        if(guerrero.getVida() <= this.vidaRestante){
            guerrero.setEscudo(5);
            return guerrero.getAtaque() + this.rafaga;
        }
        else{
            return guerrero.getAtaque();
        }
    }
    
}
