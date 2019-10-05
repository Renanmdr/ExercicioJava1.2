package com.Unama;

import java.util.Scanner;

public class ExercicioD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1,n2,n3;
        System.out.println("Informe N1:");
        n1 = sc.nextDouble();
        System.out.println("Informe N2:");
        n2 = sc.nextDouble();
        System.out.println("Informe N3:");
        n3 = sc.nextDouble();
        if (n1 < n2+n3 || n2 < n1+n3 || n3 < n1+n2){
            System.out.println("Esses lados Formão um Triagulo");
        }else{
            System.out.println("esses lados não Formão um Triagulo");

         }if( (n1 == n2) && n2 == n3){
            System.out.println("Triagulo Equilatero");
         }  else if (n1 == n2 || n2 == n3 || n1 == n3){
            System.out.println("Triagulo Isosceles");
         }   else {
            System.out.println("Triagulo Escaleno");
         }
    }
}
