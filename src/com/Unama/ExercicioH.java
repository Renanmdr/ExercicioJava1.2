package com.Unama;

import java.util.Scanner;

public class ExercicioH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        System.out.println("Informe N1:");
        n1 = sc.nextInt();
        if (n1 % 2 == 1){
            System.out.println("Numero Impar");
        }else{
            System.out.println("Numero Par");
        }


    }
}
