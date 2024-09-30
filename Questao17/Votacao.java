package Questao17;

public class Votacao {
    private String candidato;
    private int votosRecebidos;

    public Votacao() {}

    public Votacao(String candidato) {
        this.candidato = candidato;
        this.votosRecebidos = 0;
    }

    public String getCandidato() {
        return candidato;
    }

    public void setCandidato(String candidato) {
        this.candidato = candidato;
    }

    public int getVotosRecebidos() {
        return votosRecebidos;
    }

    public void adicionarVoto() {
        this.votosRecebidos++;
    }

    public void zerarVotos() {
        this.votosRecebidos = 0;
    }

    public void exibirResultado() {
        System.out.println("Candidato: " + candidato + ", Votos Recebidos: " + votosRecebidos);
    }

    public void compararVotos(Votacao outraVotacao) {
        if (this.votosRecebidos > outraVotacao.getVotosRecebidos()) {
            System.out.println(candidato + " tem mais votos que " + outraVotacao.getCandidato());
        } else if (this.votosRecebidos < outraVotacao.getVotosRecebidos()) {
            System.out.println(outraVotacao.getCandidato() + " tem mais votos que " + candidato);
        } else {
            System.out.println(candidato + " e " + outraVotacao.getCandidato() + " têm a mesma quantidade de votos.");
        }
    }
}