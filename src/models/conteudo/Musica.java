package models.conteudo;

public class Musica extends Titulo {
    private String cantor;
    private String genero;

    public String getCantor(){
        return cantor;
    }
    public void setCantor(String cantor){
        this.cantor = cantor;
    }

    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
}
