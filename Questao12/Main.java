package Questao12;

public class Main {
    public static void main(String[] args) {

        SessaoCinema sessao1 = new SessaoCinema("Vingadores: Ultimato", "20:00", 100);
        SessaoCinema sessao2 = new SessaoCinema("Jogos Vorazes", "20:00", 100);

        sessao1.venderIngresso();
        sessao2.venderIngresso();

        sessao1.exibirInfoSessao();

        sessao1.alterarHorario("21:00");

        sessao1.cancelarIngresso();

        sessao1.exibirInfoSessao();
    }
}

