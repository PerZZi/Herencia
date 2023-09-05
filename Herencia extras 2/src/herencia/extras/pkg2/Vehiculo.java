
package herencia.extras.pkg2;


public class  Vehiculo {
    
    protected Combustible combustible;
    protected String Marca;
    protected String patente;

    public Vehiculo(Combustible combustible, String Marca, String patente) {
        this.combustible = combustible;
        this.Marca = Marca;
        this.patente = patente;
    }
    
    
}
