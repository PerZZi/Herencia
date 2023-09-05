
package herencia.extras.pkg1;


public class Velero extends Barco {
    
    private int numeroMastiles;

    public Velero() {
    }

    public Velero(int numeroMastiles, String matricula, double eslora, int año) {
        super(matricula, eslora, año);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }
    
    
    @Override
    public double valorModulo(){
        return super.valorModulo()+numeroMastiles;
    }

  
    
}
