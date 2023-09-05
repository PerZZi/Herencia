
package herencia.extras.pkg2;


public class Camion extends Vehiculo {

    public Camion(Combustible combustible, String Marca, String patente) {
        super(combustible, Marca, patente);
    }

    public double calcularCombustible(){
        return 0.12*100;
    }
    
}
