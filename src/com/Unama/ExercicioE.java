package com.Unama;

import java.util.Scanner;

public class ExercicioE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("Informe N1:");
        n1 = sc.nextInt();
        System.out.println("Informe N2:");
        n2 = sc.nextInt();
        System.out.println("Informe N3:");
        n3 = sc.nextInt();
        if(n1 < n2 && n1 < n3 && n2 < n3){
            System.out.println(n1+""+n2+""+n3);
        }else if (n1 < n2 && n1 < n3 && n3 < n2){
            System.out.println(n1+""+n2+""+n3);
        }else if (n2 < n1 && n2 < n3 && n1 < n3){
            System.out.println(n2+""+n1+""+n3);
        }else if (n2 < n1 && n2 < n3 && n3 < n1){
            System.out.println(n2+""+n3+""+n1);
        }else if(n3 < n1 && n3 < n2 && n2 < n1){
            System.out.println(n3+""+n2+""+n1);
        }else if(n3 < n1 && n3 < n2 && n1 < n2){
            System.out.println(n3+""+n1+""+n2);
        }else{
            System.out.println("os valores devem ser diferentes um do outro.");
        }


    }
}
