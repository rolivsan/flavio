package carro;

public class TiposDeCarro {
    public static void main(String[] args) {

        Carro corolla = new Carro();
        corolla.modelo = "Corolla";
        corolla.cor = "Branca";
        corolla.ano = 2026;
        corolla.motorizacao = "Hibrido";


        Carro hiluxCabineDupla = new Carro();
        hiluxCabineDupla.modelo = "Hilux Cabine Dubla";
        hiluxCabineDupla.cor = "Preta";
        hiluxCabineDupla.ano = 2026;
        hiluxCabineDupla.motorizacao = "Diesel";


        System.out.println(corolla.modelo);
        System.out.println(hiluxCabineDupla.modelo);


    }
}
