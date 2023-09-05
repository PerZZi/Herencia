
package herencia.extras.pkg1;

public class Alquiler {
    
    private String nombre;
    private int documento;
    private int fechaA;
    private int fechaD;
    private String posicion;

    public Alquiler(String nombre, int documento, int fechaA, int fechaD, String posicion) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaA = fechaA;
        this.fechaD = fechaD;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getFechaA() {
        return fechaA;
    }

    public void setFechaA(int fechaA) {
        this.fechaA = fechaA;
    }

    public int getFechaD() {
        return fechaD;
    }

    public void setFechaD(int fechaD) {
        this.fechaD = fechaD;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    
    
}
