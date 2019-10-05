package com.Unama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int copias;
        System.out.println("Informe o Total de Copias:");
        copias = sc.nextInt();
        if (copias <= 100){
            System.out.println("Total a Pagar e:R$"+copias*0.25);

        }else{
            System.out.println("Total a Pagar e:R$"+copias*0.20);
        }
    }
}
