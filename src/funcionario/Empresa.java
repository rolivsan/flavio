package funcionario;

public class Empresa {
    public static void main(String[] args) {

        Funcionario carlos = new Funcionario();
        carlos.nome = "Carlos";
        carlos.id = 1547;
        carlos.cracha = true;
        carlos.idade = 30;


        Funcionario fernanda = new Funcionario();
        fernanda.nome = "Fernanda";
        fernanda.id = 7894;
        fernanda.cracha = true;
        fernanda.idade = 25;

        System.out.println(fernanda.id);
        System.out.println(carlos.id);
    }
}
