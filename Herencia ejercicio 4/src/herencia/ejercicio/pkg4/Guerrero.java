
package herencia.ejercicio.pkg4;

public class Guerrero extends Personaje {
    
    private boolean caballo;

    public Guerrero(int x,int y, String nick) {
        super(x,y, nick);
    }
    
    
    @Override
    public void Avanzar() {
        if (caballo) {
            switch (orientacion) {
                case 'N':
                    this.ubicacion.setY(ubicacion.getY() + 10);
                    System.out.println("Avanzo 10 pasos hacia el norte :"  );
                    break;
                case 'E':
                    this.ubicacion.setX(ubicacion.getX() + 10);
                    System.out.println("Avanzo 10 pasos hacia el este :");
                    break;
                case 'S':
                    this.ubicacion.setY(ubicacion.getY() - 10);
                    System.out.println("Avanzo 10 pasos hacia el sur :");
                    break;
                case 'O':
                    this.ubicacion.setX(ubicacion.getX() - 10);
                    System.out.println("Avanzo 10 pasos hacia el oeste :");
                    break;

            }
            
        }else{
            super.Avanzar();
        }
    }
    
    @Override
    public void Disparar(){
        super.Disparar();
        if(energia<30 && caballo){
            caballo=false;
            energia-=10;
            System.out.println("perdiste al caballo");
        }
        System.out.println("la energia restante es: " + energia);
    }
    
}
