package com.Unama;

import java.util.Scanner;

public class ExercicioI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String genero;
        double altura,peso;
        System.out.println("Informe seu Genero [M] ou [F]:");
        genero = sc.nextLine();
        System.out.println("Informe Sua Altura");
        altura = sc.nextDouble();
        switch (genero){
            case "M":
                System.out.println("Seu peso Ideal E:");
                System.out.println(peso=(72.7*altura)-58);

                break;
            case "F":
                System.out.println("Seu peso Ideal E:");
                System.out.println(peso=(62.1*altura)-44.7);

                break;
        }

    }
}
