
package herencia.ejercicio.pkg3;


public class Circulo implements calculosFormas {
    
    private double radio;
    

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    @Override
    public void calcularArea(){
        System.out.println("El area del circulo es: " );
    }
    
    @Override
    public void calcularPerimetro(){
        System.out.println("El perimetro del circulo es:");
    }
}
