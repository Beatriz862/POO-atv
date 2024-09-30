package Questao11;

public class ContaCorrente {
    private String numeroDaConta;
    private double saldo;
    private String nomeDoTitular;

    
    public ContaCorrente() {}

    public ContaCorrente(String numeroDaConta, String nomeDoTitular, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        this.saldo = saldo;
    }

   
    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    
    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(ContaCorrente destino, double valor) {
        if (sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    public void exibirSaldo() {
        System.out.println("Nome Do Titular: " +nomeDoTitular);
        System.out.println("numero Da Conta:  " +numeroDaConta);
        System.out.println("Saldo atual: R$ " +saldo);
    }
}
    

