package Questao06;

public class Veiculo {
    private String placa; 
    private String marca;
    private int ano;

    Veiculo(String placa, String marca, int ano){
        this.placa = placa;
        this.marca = marca;
        this.ano = ano;

    }

    Veiculo(){

    }

    public String setPlaca(){

        return placa;
    }

    public void getPlacas(String placas){

        this.placa = placa;

    }

    public String setMarca(){

        return marca;
    }

    public void getMarca(String marca){

        this.marca = marca;
    }

    public int setAno(){

        return ano;
    }

    public void getAno(int ano){

        this.ano = ano;
    }
   
    public void exibirInformaçoes(){

        System.out.println("Placa:" +placa);
        System.out.println("Marca:"+marca);
        System.out.println("Ano:"+ano);
        System.out.println();
    }
}
