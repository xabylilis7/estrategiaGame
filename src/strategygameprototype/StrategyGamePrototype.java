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
        //vida 0-50
        
        //insertar el tiempo de intervalo de ataque
        Estrategia dobleDanio = new EstrategiaDobleDanio(2);
        
        //insertar el incremento de ataque.
        Estrategia rafaga = new EstrategiaRafa(15); 
        
                                     //Nombre, Vida, Ataque, Escudo, Estrategia
        //Guerreros
        Guerrero lucho = new Guerrero("Lucho", 50, 6, 10, dobleDanio);
        Guerrero beto = new Guerrero("Beto", 50, 5, 10, dobleDanio); //tiene movimiento rapido
        Guerrero coco = new Guerrero("Coco", 50, 6, 5, rafaga);
        
        //Monstruos
        Estrategia dobleDanio2 = new EstrategiaDobleDanio(3);
        Guerrero monstruo1 = new Guerrero("MonstruoI", 50, 10, 5, rafaga);
        Guerrero monstruo2 = new Guerrero("MonstruoII", 50, 8, 4, dobleDanio);
        Guerrero monstruo3 = new Guerrero("MonstruoIII", 50, 5, 6, rafaga); //tiene movimiento rapido
        
               
        Terreno terreno = new Terreno();
        terreno.combate(lucho, monstruo3);
    }
    
}
