package br.com.araujo.factory;

public class SUVHonda extends CarroBase {
    public SUVHonda(String modelo, String marca, int ano, String cor, double preco) {
        super(modelo, marca, ano, cor, preco);
    }
    @Override
    public void exibirInfo() {
        System.out.println("Fabrica: " + getMarca() + "\nModelo: " + getModelo() + "\nAno: " + getAno() + "\nCor: " + getCor() + "\nPreço: " + getPreco() + "\n");
    }
}
