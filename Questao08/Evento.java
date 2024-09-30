package Questao08;

public class Evento {

    private String nomeEvento;
    private String data;
    private String local;

Evento(String nomeEvento, String data, String local){

    this.nomeEvento = nomeEvento;
    this.data = data;
    this.local = local;

 }
Evento(){

}
 public String getnomeEvento(){

    return nomeEvento;
}

public void setnomeEvento(String nomeEvento){

    this.nomeEvento= nomeEvento;

}

public String getData(){

    return data;
}

public void setData(String data){

    this.data = data;
}

public String getLocal(){

    return local;
}

public void setLocal(String local){

    this.local = local;
}

public void exibirInformaçoes(){

    System.out.println("Nome do Evento:" +nomeEvento);
    System.out.println("Data:"+data);
    System.out.println("Local do Evento:"+local);
    System.out.println();
}
}
