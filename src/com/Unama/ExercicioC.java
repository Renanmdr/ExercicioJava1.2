package com.Unama;

import java.util.Scanner;

public class ExercicioC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Idade;
        System.out.println("Informe Idade:");
        Idade = sc.nextInt();
        if (Idade <= 10){
            System.out.println("Categoria Infantil");
        }else if ( Idade > 10 && Idade <= 17){
            System.out.println("categoria Juvenil");

        }   else{
            System.out.println("categoria Senior");

          }
    }
}
