
package herencia.ejercicio.pkg4;


public class Personaje {
    
    protected Position ubicacion;
    protected String nick;
    protected int vidas=3;
    protected int energia=100;
    protected char orientacion='N';

    public Personaje(int x,int y, String nick) {
        this.ubicacion = new Position(x,y);
        this.nick = nick;
    }
    
    public void Disparar(){
        if(energia>=10){
            energia-=10;
        }else{
            System.out.println("No tiene energia suficiente");
            
        }
        
        
    }
    
    public void Girar() {
        switch (orientacion) {
            case 'N':
                orientacion = 'E';
                System.out.println("giro hacia el este :");
                break;
            case 'E':
                orientacion = 'S';
                System.out.println("giro hacia el sur :");
                break;
            case 'S':
                orientacion = 'O';
                System.out.println("giro hacia el oeste :");
                break;
            case 'O':
                orientacion = 'N';
                System.out.println("giro hacia el norte :");
                break;

        }
    }
    
    public void Avanzar(){
        switch (orientacion) {
            case 'N':
                this.ubicacion.setY(ubicacion.getY()+1);
                System.out.println("Avanzo 10 pasos hacia el norte :");
                break;
            case 'E':
                this.ubicacion.setX(ubicacion.getX()+1);
                System.out.println("Avanzo 10 pasos hacia el este :");
                break;
            case 'S':
                this.ubicacion.setY(ubicacion.getY()-1);
                System.out.println("Avanzo 10 pasos hacia el sur :");
                break;
            case 'O':
                this.ubicacion.setX(ubicacion.getX()-1);
                System.out.println("Avanzo 10 pasos hacia el oeste :");
                break;

        }
    }
}
