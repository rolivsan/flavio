package aluno;

public class Escola {
    public static void main(String[] args) {

        Aluno felipe = new Aluno();
        felipe.nome = "Felipe";
        felipe.cor = "Branca";
        felipe.idade = 16;
        felipe.altura = 1.65;

        Aluno ana = new Aluno();
        ana.nome = "Ana";
        ana.cor = "parda";
        ana.idade = 16;
        ana.altura = 1.65;

        System.out.println(ana.altura + " " + ana.nome);
        System.out.println(felipe.altura + " " + felipe.nome);

    }
}