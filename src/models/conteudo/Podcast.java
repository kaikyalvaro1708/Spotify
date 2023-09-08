package models.conteudo;

public class Podcast extends Title {
    private String host;
    private String niche;

    public String getHost(){
        return host;
    }
    public void setHost(String host){
        this.host = host;
    }

    public String getNiche(){
        return niche;
    }
    public void setNiche(String niche){
        this.niche = niche;
    }

    //Classificação
    @Override
    public int getClassification() {
        if(this.getTotalLikes() > 500){
            return 10;
        }else {
            return 8;
        }
    }
}
