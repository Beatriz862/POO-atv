package Questao10;

public class Pedido {
    
    private int numeroPedido;
    private String descriçaoItem;
    private double preço;

    Pedido(int numeroPedido, String descriçaoItem, double preço){
        this.numeroPedido =numeroPedido;
        this.descriçaoItem = descriçaoItem;
        this.preço = preço;

    }
    Pedido() {
        
    }
    
       public int getNumeroPedido() {
    
        return  numeroPedido;
    }  
       public void setNumeroPedido(int numeroPedido){
    
        this.numeroPedido = numeroPedido;
    }
       public double getpreço(){
    
        return preço;
    }
       public void preço(double preço){
    
        this.preço = preço;
    }
        public String setDescriçaoItem(){
    
            return descriçaoItem;
    }
    
       public void descriçaoItem(String descriçaoItem){
    
        this.descriçaoItem = descriçaoItem;
    
       }
       
        public void exibirInformacoes() {
    
            System.out.println("Numero do Pedido: " + this.numeroPedido);
            System.out.println("preço: " + this.preço);
            System.out.println("Descriçao do Item: " + this.descriçaoItem);
            System.out.println();
        
            
       }
}
