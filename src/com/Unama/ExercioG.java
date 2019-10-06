package com.Unama;

import java.util.Scanner;

public class ExercioG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.println("Informe N1:");
        n1 = sc.nextInt();
        System.out.println("Informe N2:");
        n2 = sc.nextInt();
        if (n1 > n2){
            System.out.println(n1);
        }else{
            System.out.println(n2);
        }
    }
}
