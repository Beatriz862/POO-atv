package Questao18;

public class Main {
    public static void main(String[] args) {
        AtividadeFisica corrida = new AtividadeFisica("Corrida", 30);
        AtividadeFisica caminhada = new AtividadeFisica("Caminhada", 45);

        corrida.exibirAtividade();
        caminhada.exibirAtividade();

        corrida.compararCalorias(caminhada);
    }
}

