package Questao03;

public class Produto {

    private String nome;
    private int preço;
    private String categoria;

    Produto( String nome, int preço, String categoria){
        this.nome = nome;
        this.preço = preço;
        this.categoria = categoria;

    }
   public  Produto(){


    }

    public String getNome(){

        return nome;
    }

    public void setNome( String nome){

        this.nome = nome;
    }

    public int getpreço(){

        return preço;
    }
    public void setPreço( int preço){

        this.preço = preço;
    }

    public String getCategoria(){

        return categoria;
    }

    public void setCategoria(String categoria){

        this.categoria = categoria;
    }
    
    public void exibirInformacoes() {

    System.out.println("Nome:" +this.nome);
    System.out.println("Preço:" +this.preço);
    System.out.println("Categoria:" +this.categoria);
    System.out.println();
    
}
}
