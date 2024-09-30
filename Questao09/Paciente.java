package Questao09;

public class Paciente {
    private String nome;
    private int idade;
    private String diagnostico;

    Paciente(String nome,int idade, String diagnostico){
        this.nome = nome;
        this.idade = idade;
        this.diagnostico = diagnostico;

    }
     Paciente() {
        
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
       public void setIdade(int idade){
    
        this.idade = idade;
    }
        public String setDiagnostico(){
    
            return diagnostico;
    }
    
       public void diagnostico(String diagnostico){
    
        this.diagnostico = diagnostico;
    
       }
       
        public void exibirInformacoes() {
    
            System.out.println("Nome: " + this.nome);
            System.out.println("Idade: " + this.idade);
            System.out.println("Diagnostico: " + this.diagnostico);
            System.out.println();
        
            
       }
    
}
