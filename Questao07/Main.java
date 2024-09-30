package Questao07;

public class Main {
    
    public static void main(String[] args){

        PerfilUsuario PerfilUsuario1 = new PerfilUsuario ("Dani.k", "Estudande de Publicidade e Propaganda" , 100020);
        PerfilUsuario PerfilUsuario2 =new PerfilUsuario ("Fabrício.Max", "Professor da rede Publica de ensino", 500);
        PerfilUsuario PerfilUsuario3 =new PerfilUsuario (" Micaela. Garcia", " Modelo",2000);

        PerfilUsuario1.exibirInformaçoes();
        PerfilUsuario2.exibirInformaçoes();
        PerfilUsuario3.exibirInformaçoes();

    }
}
