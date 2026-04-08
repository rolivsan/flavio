package filme;

public class Cinema {
    public static void main(String[] args) {

        Filme destruicaoFinal = new Filme();
        destruicaoFinal.nome = "Destruição Final 2";
        destruicaoFinal.genero = "Ação, Catástrofe";
        destruicaoFinal.lancamento = 2026;
        destruicaoFinal.produtora = "STX Entertainment";

        Filme terremoto = new Filme();
        terremoto.nome = "Terremoto";
        terremoto.genero = "Ação, Catástrofe, Drama";
        terremoto.lancamento = 2018;
        terremoto.produtora = "Amanda Award-People’s Amanda";

        System.out.println(destruicaoFinal.nome);
        System.out.println(terremoto.genero);
    }
}
