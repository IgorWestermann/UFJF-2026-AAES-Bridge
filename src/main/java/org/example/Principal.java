package org.example;

public class Principal {
    public static void main(String[] args) {
        Aparelho televisao = new Televisao();
        ControleRemoto controleTelevisao = new ControleRemoto(televisao);

        System.out.println("--- Controlando a televisão ---");
        controleTelevisao.alternarLigadoDesligado();
        controleTelevisao.aumentarVolume();
        controleTelevisao.aumentarVolume();
        controleTelevisao.mostrarEstado();

        System.out.println();

        Aparelho radio = new Radio();
        ControleRemotoAvancado controleRadio = new ControleRemotoAvancado(radio);

        System.out.println("--- Controlando o rádio ---");
        controleRadio.alternarLigadoDesligado();
        controleRadio.aumentarVolume();
        controleRadio.silenciar();
        controleRadio.mostrarEstado();
    }
}
