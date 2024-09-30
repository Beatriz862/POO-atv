package Questao12;

public class SessaoCinema {
    private String filme;
    private String horario;
    private int capacidadeTotal;
    private int ingressosVendidos;

    public SessaoCinema() {}

    public SessaoCinema(String filme, String horario, int capacidadeTotal) {
        this.filme = filme;
        this.horario = horario;
        this.capacidadeTotal = capacidadeTotal;
        this.ingressosVendidos = 0;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }

    public int getIngressosVendidos() {
        return ingressosVendidos;
    }

    public void setIngressosVendidos(int ingressosVendidos) {
        this.ingressosVendidos = ingressosVendidos;
    }

    public void venderIngresso() {
        if (capacidadeTotal > ingressosVendidos) {
            ingressosVendidos++;
        }
    }

    public void cancelarIngresso() {
        if (ingressosVendidos > 0) {
            ingressosVendidos--;
        }
    }

    public void exibirInfoSessao() {
        int lugaresDisponiveis = capacidadeTotal - ingressosVendidos;
        System.out.println("Filme: " + filme + ", Horário: " + horario + ", Lugares Disponíveis: " + lugaresDisponiveis);
    }

    public void alterarHorario(String novoHorario) {
        this.horario = novoHorario;
    }
}