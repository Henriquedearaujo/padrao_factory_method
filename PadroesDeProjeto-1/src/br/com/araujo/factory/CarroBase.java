package br.com.araujo.factory;

public abstract class CarroBase implements Carro {
    private String modelo;
    private String marca;
    private int ano;
    private String cor;
    private double preco;

    public CarroBase(String modelo, String marca, int ano, String cor, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public double getPreco() {
        return preco;
    }
}
