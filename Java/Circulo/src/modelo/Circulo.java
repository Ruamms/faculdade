package modelo;
import java.lang.Math;
public class Circulo {

    private double raio;
    private double pi;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }
    
    public float area(){
        return (float) (pi*(Math.pow(raio, 2)));
    } 

}
