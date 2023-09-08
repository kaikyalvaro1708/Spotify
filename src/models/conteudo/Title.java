package models.conteudo;

public class Title {
    private String name;
    private int releaseYear;
    private int durationMinutes;
    private int totalReproductions;
    private int totalLikes;
    private int classification;

    public int getTotalReproductions() {
        return totalReproductions;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public int getClassification() {
        return classification;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }


    //Método exibir ficha
    public void displaySheet(){
        System.out.println("Título:" + name);
        System.out.println("Ano de lançamento: " + releaseYear);
        System.out.println("Duração em minutos: " + durationMinutes +  " minutos");
    }

    //método curtir
    public void like(){
        this.totalLikes++;
    }

    public void reproduce(){
        this.totalReproductions++;
    }
}
