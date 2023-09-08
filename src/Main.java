import models.conteudo.Favorites;
import models.conteudo.Music;
import models.conteudo.Podcast;

public class Main {
    public static void main(String[] args) {
        Podcast podcast = new Podcast();
        Music music = new Music();
        Favorites favorites = new Favorites();


        //Musics
        music.setName("Numb");
        music.setArtist("Linkin Park");
        music.setMusicalGenre("Rock");
        music.setReleaseYear(2006);
        music.setDurationMinutes(3);

        music.displaySheet();
        System.out.println("Banda: " + music.getArtist());
        System.out.println("Gênero musical: " + music.getMusicalGenre());
        favorites.includes(music);


        for( int i=0; i < 1000; i++){
            music.reproduce();
        }
        for(int i=0; i < 50; i++){
            music.like();
        }

        System.out.println("-----------------------------------------");

        //Podcast
        podcast.setName("Podpah");
        podcast.setHost("Igão e Mítico");
        podcast.setNiche("Geral");
        podcast.setReleaseYear(2020);
        podcast.setDurationMinutes(100);

        podcast.displaySheet();
        System.out.println("Apresentadores: " + podcast.getHost());
        System.out.println("Nicho: " + podcast.getNiche());

        for( int i=0; i < 5000; i++){
            podcast.reproduce();
        }
        for(int i=0; i < 1000; i++) {
            podcast.like();
        }

        favorites.includes(podcast);

    }
}