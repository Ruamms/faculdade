/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author labc
 */
public class Calculadora {
        
    private double valor1, valor2;
    private char operacao;
    
    public double getValor1() {return valor1;}
    public double getValor2() {return valor2;}
    public char getOperacao() {return operacao;}
    
    public void setValor1(double valor1) {this.valor1 = valor1;}
    public void setValor2(double valor2) {this.valor2 = valor2;}
    public void setOperacao(char operacao) {this.operacao = operacao;}
    
    public double calcular(double val1, double val2, char operador) {
        switch(operador){
            case '+':
                return val1 + val2;
            case '-':
                return val1 - val2;
            case 'x':
                return val1 * val2;
            case '/':
                return val1 / val2;    
            default:
                return 0; 
                
        }
    }
    
}
