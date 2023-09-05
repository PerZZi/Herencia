/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.ejercicio.pkg2;

/**
 *
 * @author Usuario
 */
public class Electrodomestico {
    
    protected double precio;
    protected String color;
    protected char consumo;
    protected double peso;

    public Electrodomestico() {
    }
    

    public Electrodomestico(double precio, String color, char consumo, double peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.consumo = comprobarConsumo(consumo);
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    private char comprobarConsumo(char letra){
        letra=Character.toLowerCase(letra);
        switch (letra){
            case 'a':return 'a';
            case 'b':return 'b';
            case 'c':return 'c';
            case 'd':return 'd';
            case 'e':return 'e';
            default :return 'f';
        }
            
        
    }
    
    private String comprobarColor(String color){
        color.toLowerCase();
        switch (color){
            case "rojo":return "rojo";
            case "azul":return "azul";
            case "negro":return "negro";
            case "gris":return "gris";
            default :return"blanco";
        }
        
    }
    
//    private String comprobarColor(String color) {
    
//        if(color.equalsIgnoreCase("BLANCO")){
//           return color;
//        }else if(color.equalsIgnoreCase("NEGRO")){
//           return color;
//        }else if(color.equalsIgnoreCase("ROJO")){
//           return color;
//        }else if(color.equalsIgnoreCase("AZUL")){
//           return color;
//        }else if(color.equalsIgnoreCase("GRIS")){
//           return color;
//        }else{
//            return "BLANCO";
//        }
    
    public double precioFinal(){
       double preciofinal = 0;
       
       switch (consumo){
           case 'a':preciofinal=1000;
           break;
           case 'b':preciofinal=800;
           break;
           case 'c':preciofinal=600;
           break;
           case 'd':preciofinal=500;
           break;
           case 'e':preciofinal=300;
           break;
           case 'f':preciofinal=100;
           break;
       }
       if(peso<=19 && peso>=1){
           preciofinal+=precio+100;
       }else if(peso<=49 && peso>=20){
           preciofinal+=precio+500;
       }else if(peso<=79 && peso>=50){
           preciofinal+=precio+800;
       }else{
           preciofinal+=precio+1000;
       }
        return preciofinal;
        
    }
}
