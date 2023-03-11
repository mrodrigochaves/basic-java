package edu.mrodrigochaves.exercices;

import java.util.Scanner;

public class ParImpar {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        int quantNum;
        int num;
        int quantNumPares = 0, quantNumImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNum = scan.nextInt();   
        
        int count = 0;
        do{
            System.out.println("Número: ");
            num = scan.nextInt();

            if (num % 2 == 0 ) quantNumPares++;
            else quantNumImpares++;

            count ++;
        } while(count < quantNum);

        System.out.println("Quantidade de número(s) Par(es): " + quantNumPares);
        System.out.println("Quantidade de número(s) Impar(es): " + quantNumImpares);
    }

}
