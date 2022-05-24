/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author labc
 */
public class Aluno {

    private String nome, matricula;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setAv1(float av1) {
        this.av1 = av1;
    }

    public void setAv2(float av2) {
        this.av2 = av2;
    }

    public void setAv3(float av3) {
        this.av3 = av3;
    }

    private float av1, av2, av3;

    public float calcularMedia() {
        return (av1 + av2 + av3) / 3;
    }

    public void informarResultado() {
        JOptionPane.showMessageDialog(null,
                "matricula : " + matricula
                + "\nNome:" + nome
                + "\nNota1: " + av1
                + "\nNota2: " + av2
                + "\nNota3: " + av3
                + "\nMédia:" + calcularMedia()
                + "\nRESULTDOFinal : " + resultadofinal());

    }

    private String resultadofinal() {
        String resposta;
        if (calcularMedia() >= 6.0) {
            resposta = "aprovado";
        } else {
            resposta = "reprovado";
        }
        return resposta;

    }

}
