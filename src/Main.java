import models.conteudo.Musica;
import models.conteudo.Podcast;

public class Main {
    public static void main(String[] args) {
        Podcast podcast = new Podcast();
        Musica musica = new Musica();

        //Músicas
        musica.setNome("Numb");
        musica.setCantor("Linkin Park");
        musica.setGenero("Rock");
        musica.setFavoritos(true);
        musica.setAnoDeLancamento(2006);
        musica.setDuracaoEmMinutos(3);

        musica.exibeFichaTecnica();
        System.out.println("Banda: " + musica.getCantor());
        System.out.println("Gênero musical: " + musica.getGenero());

        System.out.println("-----------------------------------------");

        //Podcast
        podcast.setNome("Podpah");
        podcast.setApresentador("Igão e Mítico");
        podcast.setNicho("Geral");
        podcast.setAnoDeLancamento(2020);
        podcast.setDuracaoEmMinutos(100);

        podcast.exibeFichaTecnica();
        System.out.println("Apresentadores: " + podcast.getApresentador());
        System.out.println("Nicho: " + podcast.getNicho());
    }
}