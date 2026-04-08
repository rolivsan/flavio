package produto;

public class Mercado {
    public static void main(String[] args) {


        Produtos chocolate = new Produtos();
        chocolate.nome = "Snickers";
        chocolate.cor = "Marrom";
        chocolate.tipo = "Bombom";
        chocolate.dataDeValidade = "19/10/26";

        Produtos sabao = new Produtos();
        sabao.nome = "Ypé";
        sabao.cor = "Verde";
        sabao.tipo = "Limpeza";
        sabao.dataDeValidade = "25/9/26";

        System.out.println(sabao.nome);
        System.out.println(chocolate.nome);

    }

}
