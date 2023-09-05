
package herencia.ejercicio.pkg2;

public class Lavadora extends Electrodomestico {
    
    protected double carga;

    public Lavadora() {
    }

    public Lavadora(double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.carga=carga;
        
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public double precioFinal(){
        if(carga>=30){
            precio=Lavadora.super.precioFinal()+500;
        }return precio;
    }
    
    
}
