
package herencia.ejercicio.pkg2;


public class Televisor extends Electrodomestico {
    
    protected double resolucion;
    protected boolean sintonizador;

//    public Televisor(double resolucion, boolean sintonizador) {
//        this.resolucion = resolucion;
//        this.sintonizador = sintonizador;
//    }

    public Televisor() {
    }
    

    public Televisor(double resolucion, boolean sintonizador, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    @Override
    public double precioFinal(){
        if(resolucion>40){
            precio+=Televisor.super.precioFinal()*0.30;
        }if(sintonizador==true){
            precio+=Televisor.super.precioFinal()+500;
        }return precio;
    }
    
    
}
