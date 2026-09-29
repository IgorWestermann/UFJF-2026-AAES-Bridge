package org.example;

import java.util.Objects;

public class ControleRemoto {
    protected final Aparelho aparelho;

    public ControleRemoto(Aparelho aparelho) {
        this.aparelho = Objects.requireNonNull(aparelho, "O aparelho é obrigatório.");
    }

    public void alternarLigadoDesligado() {
        if (aparelho.estaLigado()) aparelho.desligar();
        else aparelho.ligar();
    }

    public void aumentarVolume() { aparelho.setVolume(aparelho.getVolume() + 10); }

    public void diminuirVolume() { aparelho.setVolume(aparelho.getVolume() - 10); }

    public void mostrarEstado() {
        String estado = aparelho.estaLigado() ? "ligado" : "desligado";
        System.out.println(aparelho.getNome() + ": " + estado + ", volume " + aparelho.getVolume());
    }
}
