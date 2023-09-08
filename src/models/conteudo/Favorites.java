package models.conteudo;

public class Favorites {

    public void includes(Title title){
        if(title.getClassification() >= 8){
            System.out.println(title.getName() + " é considerado sucesso absoluto e preferido por todos! ");
        }else{
            System.out.println(title.getName() + " excelente opção para se ouvir!");
        }
    }
}
