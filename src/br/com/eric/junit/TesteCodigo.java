package br.com.eric.junit;

import java.time.LocalDate;

public class TesteCodigo {

    public static void main(String[] args) {
        Colecionador eric = new Colecionador("Eric");

        Carro carro1 = new Carro( "Mustang", "Ford", 1994, LocalDate.now());
        Carro carro2 = new Carro( "Enzo", "Ferrari", 2002, LocalDate.now());
        Carro carro3 = new Carro( "Urus", "Lamborghini", 2017, LocalDate.now());

        eric.getColecao().add(carro1);
        eric.getColecao().add(carro2);
        eric.getColecao().add(carro3);

        int ano = eric.obterAnoDoCarroMaisAntigo();

        System.out.println("Ano do carro mais antigo é: " + ano);
    }
}
