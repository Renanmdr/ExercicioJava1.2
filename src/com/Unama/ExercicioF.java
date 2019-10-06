package com.Unama;

import java.util.Scanner;

public class ExercicioF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1,n2,media;
        int faltas;
        System.out.println("Informe o Numero de Faltas:");
        faltas = sc.nextInt();
        System.out.println("Informe N1:");
        n1 = sc.nextDouble();
        System.out.println("Informe N2:");
        n2 = sc.nextDouble();
        media = (n1+n2)/2;
        if (faltas > 40 ){
            System.out.println("Aluno Repovado por Numero de Faltas:");
        }if (media >= 6){
            System.out.println("Aluno Aprovado");
        }else if (media >= 4 && media < 6){
            System.out.println("Aluno em recuperação");
        }else{
            System.out.println("Aluno Reprovado");
        }


    }
}
