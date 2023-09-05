
package herencia.extras.pkg2;


public class Camioneta extends Vehiculo {

    public Camioneta(Combustible combustible, String Marca, String patente) {
        super(combustible, Marca, patente);
    }

    public double calcularCombustible(){
        return 0.10*100;
    }
    
}
