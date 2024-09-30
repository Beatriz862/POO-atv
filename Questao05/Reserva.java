package Questao05;

public class Reserva {

    private String nomeHospedes;
    private String tipoQuarto;
    private int numeroNoites;

    Reserva(String nomeHospedes, String TipoQuarto, int numeroNoites){

        this.nomeHospedes = nomeHospedes;
        this.tipoQuarto = tipoQuarto;
        this.numeroNoites = numeroNoites;

    }

    Reserva(){

    }

    public String getNomeHospedes(){

        return nomeHospedes;
    }

    public void setNomeHospedes(){

        this.nomeHospedes = nomeHospedes;
    }

    public String getTipoQuarto(){

        return tipoQuarto;

    }

    public void setTipoQuarto(){

        this.tipoQuarto = tipoQuarto;

    }

    public int getNumeroNoites(){

        return numeroNoites;
    }

    public void setNumeroNoites(int numeroNoites){

        this.numeroNoites = numeroNoites;
    }

    public void exibirInformaçoes(){

        System.out.println("Nome do Hospedo:" +nomeHospedes);
        System.out.println("Tipo de Quarto:" +tipoQuarto);
        System.out.println("Numero de Noites:" +numeroNoites);
        System.out.println();
    }
}
    

