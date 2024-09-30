package Questao20;

public class Main {
    public static void main(String[] args) {
        ReservaDeVoo reserva = new ReservaDeVoo("AB1234", "Carlos Silva", "Econômica");

        reserva.exibirDetalhes();

        reserva.confirmarReserva();
        reserva.alterarClasse("Executiva");
        reserva.exibirDetalhes();

        reserva.cancelarReserva();
    }
}
