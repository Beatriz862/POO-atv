package Questao11;

    public class Main {
        public static void main(String[] args) {
            
            ContaCorrente conta1 = new ContaCorrente("12345-6", "João Silva", 1000);
            ContaCorrente conta2 = new ContaCorrente("65432-1", "Maria Souza", 500);
            ContaCorrente conta3 = new ContaCorrente("85432-1", "Sonia Silva", 1500);
            
            conta1.exibirSaldo();
            conta2.exibirSaldo();
            conta3.exibirSaldo();

            conta1.depositar(200);
            conta2.sacar(100);
    

            conta1.exibirSaldo();
            conta2.exibirSaldo();
    
            conta1.transferir(conta2, 300);
    
            conta1.exibirSaldo();
            conta2.exibirSaldo();
        }
    }
    

