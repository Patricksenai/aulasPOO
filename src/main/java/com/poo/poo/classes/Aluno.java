package com.poo.poo.classes;

import java.util.Scanner;

import ch.qos.logback.core.net.SyslogOutputStream;

public class Aluno {

    Scanner sc = new Scanner(System.in);


    private String aluno;
    private String nascimento;
    private  String matricula;
    public static int contador = 1000;

    public Aluno (){
        System.out.println("Escreva o nome do aluno");
        this.setAluno(sc.nextLine());

        System.out.println("Digite a data de nascimento");
        this.setNascimento(sc.nextLine());
        
        this.setMatricula(contador);
        System.out.println("PET" + contador);
        contador++;
    }


    

    public String getAluno(){
        return aluno;
    }

    public void setAluno(String aluno){
        this.aluno = aluno;
    }

    public String getNascimento(){
        return nascimento;
    }

    public void setNascimento(String nascimento){
        this.nascimento = nascimento;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = "PET" + matricula;
    }

}
