package Questao19;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Transacao> transacoes = new ArrayList<>();

        Transacao receita1 = new Transacao("Salário", 3000, "Receita");
        Transacao despesa1 = new Transacao("Aluguel", 1000, "Despesa");

        transacoes.add(receita1);
        transacoes.add(despesa1);

        receita1.exibirTransacao();
        despesa1.exibirTransacao();

        double saldoFinal = Transacao.calcularSaldo(transacoes);
        System.out.println("Saldo final: R$ " + saldoFinal);
    }
}
