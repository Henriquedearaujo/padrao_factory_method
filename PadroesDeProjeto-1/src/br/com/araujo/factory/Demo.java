package br.com.araujo.factory;

public class Demo {
    public static void main(String[] args) {
        FabricaCarro fabricaHonda = new FabricaHonda();

        Carro suvHonda = fabricaHonda.criarCarro("CR-V", "Honda", 2022, "Branco", 150000.0);
        suvHonda.exibirInfo();


        FabricaCarro fabricaToyota = new FabricaToyota();
        Carro suvToyota = fabricaToyota.criarCarro("RAV4", "Toyota", 2022, "Vermelho", 160000.0);
        suvToyota.exibirInfo();
    }
}
