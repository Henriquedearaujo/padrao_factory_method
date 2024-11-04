package br.com.araujo.factory;

public abstract class FabricaCarro {
    public abstract Carro criarCarro(String modelo, String marca, int ano, String cor, double preco);
}
