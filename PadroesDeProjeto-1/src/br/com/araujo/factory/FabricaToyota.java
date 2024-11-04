package br.com.araujo.factory;

public class FabricaToyota extends FabricaCarro {

    public Carro criarCarro(String modelo, String marca, int ano, String cor, double preco) {
        if (marca.equalsIgnoreCase("Toyota")) {
            return new SUVToyota(modelo, marca,  ano, cor, preco);
        } else  {
            return null;
        }

    }
}
