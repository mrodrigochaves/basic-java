package edu.mrodrigochaves.operators;

public class Operators {
        public static void main(String[] args) {
         String nomeUm = "Márcio";
         String nomeDois = new String("Rodrigo");


         System.out.println(nomeUm.equals(nomeDois));
         
         
         
        int numero1 = 3;
        int numero2 = 2;
            
          if(numero1 < numero2){
          System.out.println("Sim é verdade!");
        }
          else if(numero1 > numero2){
            System.out.println("Não, ele é menor.");
        }




        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras.");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das duas condições é verdadeira.");
        }
          
    }


  
}

