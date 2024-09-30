package Questao14;

public class Main {
    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa("Estudar para a prova", 5);

        tarefa.exibirTarefa();

        tarefa.concluirTarefa();

        tarefa.exibirTarefa();

        tarefa.mudarPrioridade(3);

        tarefa.resetarTarefa();

        tarefa.exibirTarefa();
    }
}