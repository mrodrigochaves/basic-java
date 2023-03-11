package edu.mrodrigochaves.exercices;

import java.util.Random;

public class NumAleatorios {
    public static void main(String[] args) {
        
        Random random = new Random();

        int[] numAleatorios = new int[20];

        for(int i = 0; i < numAleatorios.length; i++){
            int num = random.nextInt(100);
            numAleatorios[i] = num;

        }

        System.out.print("\nNúmeros Aleatorios: ");
        for (int num : numAleatorios) {
            System.out.println(num + " ");            
        }
        
        System.out.print("\nAntecessores do Números Aleatorios: ");
        for (int num : numAleatorios) {
            System.out.println((num-1) + " ");            
        }

        System.out.print("\nSucessores do Números Aleatorios: ");
        for (int num : numAleatorios) {
            System.out.println((num+1) + " ");            
        }




    }
}
