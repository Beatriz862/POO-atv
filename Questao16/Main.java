package Questao16;

public class Main {
    public static void main(String[] args) {
        
        Curso curso = new Curso("Java Básico", "Programação", 40, 20);

        curso.exibirInformacoes();

        curso.inscreverAluno();
        curso.exibirInformacoes();

        curso.cancelarInscricao();
        curso.exibirInformacoes();

        curso.atualizarCargaHoraria(50);
        curso.exibirInformacoes();
    }
}

