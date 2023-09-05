
package herencia.ejercicio.pkg1;


public class HerenciaEjercicio1 {

   
    public static void main(String[] args) {
        
        
        Animal perro1=new Perro("Cliford","Carne",3,"buldog");
        perro1.queCome();
        
        Animal gato1=new Gato("Manchas","Pescado",2,"mestizo");
        gato1.queCome();
    }
    
}
