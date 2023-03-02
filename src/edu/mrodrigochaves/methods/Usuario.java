package edu.mrodrigochaves.methods;
//somar (int n1, int n2){}
//abrirConexao(){}
//concluirProcessamento(){}

public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        
        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);
        
        smartTv.ligar ();
        System.out.println("TV ligada ? " + smartTv.ligada);

        smartTv.desligar ();
        System.out.println("TV ligada ? " + smartTv.ligada);

    }
}
