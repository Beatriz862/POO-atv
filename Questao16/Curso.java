package Questao16;

public class Curso {
    private String nome;
    private String categoria;
    private int cargaHoraria;
    private int numeroDeAlunosInscritos;

    public Curso() {}

    public Curso(String nome, String categoria, int cargaHoraria, int numeroDeAlunosInscritos) {
        this.nome = nome;
        this.categoria = categoria;
        this.cargaHoraria = cargaHoraria;
        this.numeroDeAlunosInscritos = numeroDeAlunosInscritos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getNumeroDeAlunosInscritos() {
        return numeroDeAlunosInscritos;
    }

    public void setNumeroDeAlunosInscritos(int numeroDeAlunosInscritos) {
        this.numeroDeAlunosInscritos = numeroDeAlunosInscritos;
    }

    public void inscreverAluno() {
        this.numeroDeAlunosInscritos++;
    }

    public void cancelarInscricao() {
        if (this.numeroDeAlunosInscritos > 0) {
            this.numeroDeAlunosInscritos--;
        }
    }

    public void atualizarCargaHoraria(int novaCargaHoraria) {
        this.cargaHoraria = novaCargaHoraria;
    }

    public void exibirInformacoes() {
        System.out.println("Curso: " + nome);
        System.out.println(", Categoria: " + categoria);
        System.out.println(" Carga Horária: " +cargaHoraria );
        System.out.println(" Alunos Inscritos: " + numeroDeAlunosInscritos);
    }
}
