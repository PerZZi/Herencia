/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.ejercicio.pkg3;

/**
 *
 * @author Usuario
 */
public class HerenciaEjercicio3 {

    
    public static void main(String[] args) {
       
        Circulo circu=new Circulo(3.5);
        
        Rectangulo recta=new Rectangulo(15.0,30.0);
        
        circu.calcularArea();
        circu.calcularPerimetro();
        
        recta.calcularArea();
        recta.calcularPerimetro();
        


    }
    
}
