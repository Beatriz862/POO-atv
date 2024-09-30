package Questao15;

public class Main {
    public static void main(String[] args) {
        ProdutoEstoque produto = new ProdutoEstoque("Camiseta", 50, 29.99);

        produto.exibirProduto();

        produto.adicionarEstoque(10);
        produto.removerEstoque(5);

        produto.atualizarPreco(34.99);

        produto.exibirProduto();
    }
}

