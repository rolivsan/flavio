package entrega;

public class Cliente {

    public static void main(String[] args) {

        Entregashopee joao = new Entregashopee();
        joao.nome = "João";
        joao.rua = "Jose Sebastião boarder";
        joao.bairro = "Sion";
        joao.numero = 145;
        joao.referencia ="Casa de esquina";

        Entregashopee maria = new Entregashopee();
        maria.nome = "Maria";
        maria.rua = "Luís Pederiva";
        maria.bairro = "Parque boa vista";
        maria.numero = 52;
        maria.referencia ="Muro de cor marron";


        System.out.println(maria.rua);
    }

}
