package Questao04;

public class Funcionario {
    
    private String nome;
    private String departamento;
    private int salario;

    Funcionario(String nome, String departamento, double salatrio){
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }

    Funcionario(){

    }
    public String getNome(){

        return nome;

    }

    public void setNome(String nome){

         this.nome = nome;
}
    
     public String getDepartamento(){

          return departamento;

     }

     public void setDepartamento( String departamento){
         
          this.departamento = departamento;
}

     public int getSalario(){
 
         return salario;
         
     }

     public void setSalario(int salario){

        this.salario = salario;
     }

     public void exibirInformacoes(){

        System.out.println("Nome:" +this.nome);
        System.out.println("Departamento:" +this.departamento);
        System.out.println("Salário:" +this.salario);
        System.out.println();
     }
}
