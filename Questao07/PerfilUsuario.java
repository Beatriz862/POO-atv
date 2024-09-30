package Questao07;

public class PerfilUsuario {

private String nomeUsuario;
private String bio;
 private int numeroSeguidores;

PerfilUsuario(String nomeUsuario, String bio, int numeroSeguidores){
    this.nomeUsuario = nomeUsuario;
    this.bio= bio;
    this.numeroSeguidores = numeroSeguidores;
}

PerfilUsuario(){

}
public String getnomeUsuario(){

    return nomeUsuario;
}

public void setnomeUsuario(String nomeUsuario){

    this.nomeUsuario= nomeUsuario;

}

public String getBio(){

    return bio;
}

public void setBio(String bio){

    this.bio = bio;
}

public int getNumeroSeguidores(){

    return numeroSeguidores;
}

public void setNumeroSeguidores(int numeroSeguidores){

    this.numeroSeguidores = numeroSeguidores;
}

public void exibirInformaçoes(){

    System.out.println("Nome do Usuario:" +nomeUsuario);
    System.out.println("bio:"+bio);
    System.out.println("Numero de Seguidores:"+numeroSeguidores);
    System.out.println();
}
    
}
