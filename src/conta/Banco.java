package conta;

public class Banco {
    public static void main(String[] args) {

        Conta alberto = new Conta();
        alberto.nome = "Alberto";
        alberto.id = 15615615;
        alberto.senha = 159847;
        alberto.valor = 12;

        Conta roberta = new Conta();
        roberta.nome = "Roberta";
        roberta.id = 14578945;
        roberta.senha = 123456;
        roberta.valor = 500;

        System.out.println(roberta.nome + " " + roberta.valor);
        System.out.println(alberto.nome);

    }
}
