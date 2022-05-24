package MODELO;

public class IMC {

    public double peso;
    public double altura;

    public double calcIMC() {
        return (peso / (altura * altura));
    }

    public String resultadoIMC() {

        String resultado;
        if (calcIMC() < 18.5) {
            resultado = ("Abaixo do peso");
        } else if (calcIMC() >= 18.5 && calcIMC() <= 24.9) {
            resultado = ("\nResultado final: Peso Normal");
        } else if (calcIMC() >= 25 && calcIMC() <= 29.9) {
            resultado = ("\nResultado final: Sobrepeso");
        } else if (calcIMC() >= 30 && calcIMC() <= 34.9) {
            resultado = ("\nResultado final: Obesidade Grau 1");
        } else if (calcIMC() >= 35 && calcIMC() <= 39.9) {
            resultado = ("\nResultado final: Obesidade Grau 2");
        } else {
            resultado = ("\nResultado final: Obesidade Grau 3");
        }
        return resultado;
    }

}
