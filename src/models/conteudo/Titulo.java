package models.conteudo;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean favoritos;

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setFavoritos(boolean favoritos) {
        if (favoritos != false) {
            System.out.println("O  título está nos favoritos");
        }else {
            System.out.println("O título não  está nos favoritos");
        }
        this.favoritos = favoritos;
    }

    public boolean isFavoritos() {
        return favoritos;
    }

    //Método exibir ficha
    public void exibeFichaTecnica(){
        System.out.println("Título:" + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos +  " minutos");
    }
}
