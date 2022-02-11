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
public class StrategyGamePrototype {

    public static void main(String[] args) {
        
        //ataque 1-10 
        //escudo 1-10 
        //vida 0-100
        Estrategia dobleDanio = new EstrategiaDobleDanio(2);
        Guerrero guerrero1 = new Guerrero("G", 50, 7, 10, dobleDanio);
        
        Estrategia rafaga = new EstrategiaRafa(15); 
        //Estrategia dobleDanio2 = new EstrategiaDobleDanio(3);
        Guerrero enemigo1 = new Guerrero("E", 50, 6, 1, rafaga);
        
        Terreno terreno = new Terreno();
        terreno.combate(guerrero1, enemigo1);
    }
    
}
