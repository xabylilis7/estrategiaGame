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
        Estrategia rafaga = new EstrategiaRafa(15); 
        
        //Guerreros
        Guerrero lucho = new Guerrero("Lucho", 30, 6, 10, dobleDanio);
        Guerrero beto = new Guerrero("Beto", 50, 8, 10, dobleDanio);
        Guerrero coco = new Guerrero("Coco", 3, 6, 5, rafaga);
        
        //Monstruos
        Estrategia dobleDanio2 = new EstrategiaDobleDanio(3);
        Guerrero monstruo1 = new Guerrero("Monstruo1", 1, 10, 5, rafaga);
        Guerrero monstruo2 = new Guerrero("Monstruo2", 50, 8, 4, dobleDanio);
        Guerrero monstruo3 = new Guerrero("Monstruo3", 35, 10, 6, rafaga);
        
        
        
        Terreno terreno = new Terreno();
        terreno.combate(lucho, monstruo2);
    }
    
}
