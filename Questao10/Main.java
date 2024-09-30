package Questao10;

public class Main { 
    public static void main(String[] args){

     Pedido pedido1 = new Pedido(000234,"Macarrão, Lasanha", 95);
     Pedido pedido2 = new Pedido(000345,"Parmediana, galeto e Carne de sol",170);
     Pedido pedido3 = new Pedido(000456,"Galeto completo",79.99);

     pedido1.exibirInformacoes();
     pedido2.exibirInformacoes();
     pedido3.exibirInformacoes();



    }
    
}
