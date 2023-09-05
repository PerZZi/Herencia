
package herencia.extras.pkg1;


public class Yate extends BarcoAMotor {
    
   private int cantidadCamarotes;

    public Yate() {
    }

    public Yate(int cantidadCamarotes) {
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public Yate(int cantidadCamarotes, double potencia) {
        super(potencia);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public Yate(int cantidadCamarotes, double potencia, String matricula, double eslora, int año) {
        super(potencia, matricula, eslora, año);
        this.cantidadCamarotes = cantidadCamarotes;
    }
    

    public int getCantidadCamarotes() {
        return cantidadCamarotes;
    }

    public void setCantidadCamarotes(int cantidadCamarotes) {
        this.cantidadCamarotes = cantidadCamarotes;
    }
   
    
}
