package br.com.araujo.factory;

public class FabricaHonda extends FabricaCarro {

    @Override
    public Carro criarCarro(String modelo,String marca, int ano, String cor, double preco) {
        if (marca.equalsIgnoreCase("Honda")) {
            return new SUVHonda(modelo, marca, ano, cor, preco);
        } else {
            return null;
        }

    }
}
