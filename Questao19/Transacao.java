package Questao19;
import java.util.ArrayList;

public class Transacao {
    private String descricao;
    private double valor;
    private String tipo; // Receita ou Despesa

    public Transacao() {}

    public Transacao(String descricao, double valor, String tipo) {
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void alterarDescricao(String novaDescricao) {
        this.descricao = novaDescricao;
    }

    public void exibirTransacao() {
        System.out.println("Descrição: " + descricao + ", Valor: " + valor + ", Tipo: " + tipo);
    }

    public static double calcularSaldo(ArrayList<Transacao> transacoes) {
        double saldo = 0;
        for (Transacao t : transacoes) {
            if (t.getTipo().equalsIgnoreCase("Receita")) {
                saldo += t.getValor();
            } else if (t.getTipo().equalsIgnoreCase("Despesa")) {
                saldo -= t.getValor();
            }
        }
        return saldo;
    }
}