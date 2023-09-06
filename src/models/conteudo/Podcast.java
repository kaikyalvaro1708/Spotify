package models.conteudo;

public class Podcast extends Titulo{
    private String apresentador;
    private String nicho;

    public String getApresentador(){
        return apresentador;
    }
    public void setApresentador(String apresentador){
        this.apresentador = apresentador;
    }

    public String getNicho(){
        return nicho;
    }
    public void setNicho(String nicho){
        this.nicho = nicho;
    }
}
