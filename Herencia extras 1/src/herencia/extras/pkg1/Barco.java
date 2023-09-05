package herencia.extras.pkg1;

import java.util.Random;


public class Barco {
    
    private String matricula;
    private double eslora;
    private int año;

    public Barco() {
    }

    
    public Barco(String matricula, double eslora, int año) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.año = año;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public void generarCaracterAleatorio() {
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int numeroAleatorio = random.nextInt(26);
            char caracterAleatorio = (char) ('a' + numeroAleatorio);
            this.matricula += caracterAleatorio;
        }
        
        this.matricula += "-";
        
        for (int i = 0; i < 5; i++) {
            this.matricula += (int) (Math.random() * 10);
        }
        
        this.matricula = this.matricula.toUpperCase();
    }
    
    public double valorModulo(){
        return eslora*10.0;
    }
    
}
