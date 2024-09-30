package Questao18;

public class AtividadeFisica {
    private String tipoDeAtividade;
    private int duracao; // duração em minutos
    private int caloriasQueimadas;

    public AtividadeFisica() {}

    public AtividadeFisica(String tipoDeAtividade, int duracao) {
        this.tipoDeAtividade = tipoDeAtividade;
        this.duracao = duracao;
        calcularCalorias();
    }

    public String getTipoDeAtividade() {
        return tipoDeAtividade;
    }

    public void setTipoDeAtividade(String tipoDeAtividade) {
        this.tipoDeAtividade = tipoDeAtividade;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
        calcularCalorias();
    }

    public int getCaloriasQueimadas() {
        return caloriasQueimadas;
    }

    private void calcularCalorias() {
        // Exemplo de cálculo simples: 5 calorias por minuto de atividade
        this.caloriasQueimadas = this.duracao * 5;
    }

    public void registrarAtividade(int duracao) {
        this.duracao = duracao;
        calcularCalorias();
    }

    public void alterarTipoDeAtividade(String novoTipo) {
        this.tipoDeAtividade = novoTipo;
    }

    public void exibirAtividade() {
        System.out.println("Tipo de Atividade: " + tipoDeAtividade + ", Duração: " + duracao + 
                           " minutos, Calorias Queimadas: " + caloriasQueimadas);
    }

    public void compararCalorias(AtividadeFisica outraAtividade) {
        if (this.caloriasQueimadas > outraAtividade.getCaloriasQueimadas()) {
            System.out.println(this.tipoDeAtividade + " queimou mais calorias do que " + outraAtividade.getTipoDeAtividade());
        } else if (this.caloriasQueimadas < outraAtividade.getCaloriasQueimadas()) {
            System.out.println(outraAtividade.getTipoDeAtividade() + " queimou mais calorias do que " + this.tipoDeAtividade);
        } else {
            System.out.println("Ambas as atividades queimaram a mesma quantidade de calorias.");
        }
    }
}
