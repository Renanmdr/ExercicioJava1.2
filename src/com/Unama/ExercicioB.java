package com.Unama;

import java.util.Scanner;

public class ExercicioB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Total,Defeito;
        System.out.println("Informe o Total de Peças Produzidas:");
        Total = sc.nextInt();
        System.out.println("Informe o Totas de Peças Defeituosas:");
        Defeito = sc.nextInt();
        if (Defeito > Total*0.10){
            System.out.println("Maquina precisa de Manutenção");

        }else{
            System.out.println("Maquina OK");
        }


    }
}
