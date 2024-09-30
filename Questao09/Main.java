package Questao09;

public class Main {
    public static void main(String[] args){

        Paciente paciente1 = new Paciente("Feranda Alvez",27, "Anemia");
        Paciente paciente2 = new Paciente("Renato", 30,"Dor de cabeça");
        Paciente paciente3 = new Paciente("kylie",21,"Gripe");

        paciente1.exibirInformacoes();
        paciente2.exibirInformacoes();
        paciente3.exibirInformacoes();

    }
    
}
