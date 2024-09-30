package Questao14;

public class Tarefa {
    private String descricao;
    private boolean concluida;
    private int prioridade;

    public Tarefa() {}

    public Tarefa(String descricao, int prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.concluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public void concluirTarefa() {
        this.concluida = true;
    }

    public void mudarPrioridade(int novaPrioridade) {
        this.prioridade = novaPrioridade;
    }

    public void exibirTarefa() {
        System.out.println("Tarefa: " + descricao + ", Concluída: " + (concluida ? "Sim" : "Não") + ", Prioridade: " + prioridade);
    }

    public void resetarTarefa() {
        this.concluida = false;
    }
}