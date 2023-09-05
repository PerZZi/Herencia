
package herencia.extras.pkg2;


public class Viaje {
    
    private String origen;
    private String destino;
    private double kmO;
    private double kmD;
    private double distancia;
    private Combustible Combustible;
    private int peajes;
    private Vehiculo vehiculo;
    private boolean ruta;

    public Viaje() {
    }

    public Viaje(String origen, String destino, double distancia, Combustible Combustible, int peajes, Vehiculo vehiculo, boolean ruta) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
        this.Combustible = vehiculo.combustible;
        this.peajes = peajes;
        this.vehiculo = vehiculo;
        this.ruta = false;
    }

    public Viaje(String origen, String destino, double kmO, double kmD, double distancia, Combustible Combustible, int peajes, boolean ruta) {
        this.origen = origen;
        this.destino = destino;
        this.kmO = kmO;
        this.kmD = kmD;
        this.distancia = distancia;
        this.Combustible = vehiculo.combustible;
        this.peajes = peajes;
        this.ruta = true;
    }
    
    public double calcularDistancia(){
        return distancia=kmO-kmD;
    }
    
    public void calcularCostoPeajes(){
        
    }
    
    public void costoCombustible(){
        
    }
    
    public void costoTotal(){}

    

    
    
    
}
