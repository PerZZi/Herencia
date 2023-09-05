
package herencia.extras.pkg2;


public class Auto extends Vehiculo {

    public Auto(Combustible combustible, String Marca, String patente) {
        super(combustible, Marca, patente);
    }

    public double calcularCombustible(){
        return 0.7*100;
    }
    
}
