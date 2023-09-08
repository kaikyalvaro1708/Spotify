package models.conteudo;

public class Music extends Title {
    private String artist;
    private String musicalGenre;

    public String getArtist(){
        return artist;
    }
    public void setArtist(String artist){
        this.artist = artist;
    }

    public String getMusicalGenre(){
        return musicalGenre;
    }
    public void setMusicalGenre(String musicalGenre){
        this.musicalGenre = musicalGenre;
    }

    @Override
    public int getTotalReproductions() {
        if ( this.getTotalReproductions() > 2000){
            return 10;
        }else{
            return 7;
        }
    }
}
