package Questao01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Livro l1 = new Livro("Acotar", "Sarah j Mass", 2014);
        Livro l2 = new Livro("Safira de Prta", "Laura Reggiane", 2020);
        Livro l3 = new Livro();

       

       l1.exibirInformacoes();
       l2.exibirInformacoes();
       l3.exibirInformacoes();

    }
    
}
