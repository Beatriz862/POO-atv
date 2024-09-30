package  Questao01;

public class Livro {
   private String titulo;
   private String autor;
   private int anoPublicacao;

Livro(String titulo, String autor, int anoPublicaçao){

    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicacao = anoPublicacao;
}

Livro() {
   
}
public String getTitulo() {
    return titulo;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}


public String getAutor() {
    return autor;
}

public void setAutor(String autor) {
    this.autor = autor;
}


public int getAnoPublicacao() {
    return anoPublicacao;
}

public void setAnoPublicacao(int anoPublicacao) {
    this.anoPublicacao = anoPublicacao;
}

public void exibirInformacoes() {
    System.out.println("Título: " + this.titulo);
    System.out.println("Autor: " + this.autor);
    System.out.println("Ano de Publicação: " + this.anoPublicacao);
    System.out.println();
}
}