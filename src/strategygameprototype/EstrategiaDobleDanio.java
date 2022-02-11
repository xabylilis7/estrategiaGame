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
public class EstrategiaDobleDanio implements Estrategia{
    
    private double tiempoRecarga;

    public EstrategiaDobleDanio(double tiempoRecarga) {
        this.tiempoRecarga = tiempoRecarga;
    }

    @Override
    public double activar(Guerrero guerrero, int tiempo ){
        if (tiempo % this.tiempoRecarga == 0) {
            return guerrero.getAtaque() * 2;
        } else {
            return guerrero.getAtaque();
        }
    }
    

    
    
}
