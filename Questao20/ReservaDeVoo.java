package Questao20;

public class ReservaDeVoo {
    private String numeroDoVoo;
    private String nomeDoPassageiro;
    private String classe;

    public ReservaDeVoo() {}

    public ReservaDeVoo(String numeroDoVoo, String nomeDoPassageiro, String classe) {
        this.numeroDoVoo = numeroDoVoo;
        this.nomeDoPassageiro = nomeDoPassageiro;
        this.classe = classe;
    }

    public String getNumeroDoVoo() {
        return numeroDoVoo;
    }

    public void setNumeroDoVoo(String numeroDoVoo) {
        this.numeroDoVoo = numeroDoVoo;
    }

    public String getNomeDoPassageiro() {
        return nomeDoPassageiro;
    }

    public void setNomeDoPassageiro(String nomeDoPassageiro) {
        this.nomeDoPassageiro = nomeDoPassageiro;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void alterarClasse(String novaClasse) {
        this.classe = novaClasse;
    }

    public void cancelarReserva() {
        System.out.println("Reserva cancelada para o passageiro: " + nomeDoPassageiro);
    }

    public void confirmarReserva() {
        System.out.println("Reserva confirmada para o passageiro: " + nomeDoPassageiro);
    }

    public void exibirDetalhes() {
        System.out.println("Voo: " + numeroDoVoo + ", Passageiro: " + nomeDoPassageiro + ", Classe: " + classe);
    }
}
