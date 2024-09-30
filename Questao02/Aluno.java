package Questao02;

public class Aluno {
    private String nome;
    private int idade;
    private int serie;

    Aluno(String nome, int idade, int serie){

        this.nome = nome;
        this.idade = idade;
        this.serie = serie;
    }
   public Aluno() {
        
}

   public String getNome() {

    return nome;
}  
   public void setNome( String nome){

    this.nome = nome;
}
   public int getIdade(){

    return idade;
}
   public void idade(int idade){

    this.idade = idade;
}
    public int setSerie(){

        return serie;
}

   public void serie(int serie){

    this.serie = serie;

   }
   
    public void exibirInformacoes() {

        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Ano de Publicação: " + this.serie);
        System.out.println();
    
        
   }
}