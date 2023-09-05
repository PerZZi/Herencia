
package herencia.extras.pkg1;


public class BarcoAMotor extends Barco {
    
    private double potencia;

    public BarcoAMotor() {
    }

    public BarcoAMotor(double potencia) {
        this.potencia = potencia;
    }

    public BarcoAMotor(double potencia, String matricula, double eslora, int año) {
        super(matricula, eslora, año);
        this.potencia = potencia;
    }

 
    
    
}
