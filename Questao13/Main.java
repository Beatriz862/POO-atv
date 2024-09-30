package Questao13;

public class Main {
    public static void main(String[] args) {
        Contato contato = new Contato("Ana Costa", "1234-5678", "ana@exemplo.com");

        contato.exibirContato();

        contato.alterarTelefone("8765-4321");
        contato.alterarEmail("anacosta@exemplo.com");

        contato.exibirContato();

        if (contato.validarEmail()) {
            System.out.println("Email válido.");
        } else {
            System.out.println("Email inválido.");
        }
    }
}
