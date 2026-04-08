package livro;

public class Grafica {
    public static void main(String[] args) {

        Livro guerra = new Livro();
        guerra.titulo = "A arte da guerra";
        guerra.capa = "Capa dura";
        guerra.editora = "Garnier";
        guerra.quantidadeDePagina = 89;


        Livro mente  = new Livro();
        mente.titulo = "Mais Esperto que o Diabo";
        mente.capa = "Capa dura";
        mente.editora = "Citadel";
        mente.quantidadeDePagina = 210;


        System.out.println(mente.titulo);
        System.out.println(guerra.titulo);


    }
}
