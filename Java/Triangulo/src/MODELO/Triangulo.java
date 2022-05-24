package MODELO;


public class Triangulo {

    public double valor1;
    public double valor2;
    public double valor3;
    
    public String equil() {
        
       String resultado;
       if(valor1 == valor2 + valor3 || valor2 == valor1 + valor3 || valor3 == valor2 + valor1){  //corrigir
           resultado = "não e um triangulo se a soma \nde dois lado for igual ao de um lado";
       }else if(valor1 == 0 || valor2 == 0 || valor3 == 0){
           resultado = "um dos lados contém 0cm \nentão não e possivel calcular";               
       } else if (valor1 == valor2 || valor1 == valor3 || valor2 == valor3 ) {
           resultado = "Esse triangulo e Isósceles";
       } else if (valor1 == valor2 && valor2 == valor3) {
           resultado = "Esse triangulo e Equilátero";
       } else {
           resultado = "Esse triangulo e Escaleno";
       }
       
       return resultado;
    } 
    
}
