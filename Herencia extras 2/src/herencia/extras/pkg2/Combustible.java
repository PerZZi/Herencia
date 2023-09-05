
package herencia.extras.pkg2;


public class Combustible {
    
    private String tipoDeCombustible;
    private double precio;

    public Combustible() {
    }

    public Combustible(String tipoDeCombustible, double precio) {
        this.tipoDeCombustible = tipoDeCombustible;
        this.precio = precio;
    }

    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public void setTipoDeCombustible(String tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

 
    
    
}
