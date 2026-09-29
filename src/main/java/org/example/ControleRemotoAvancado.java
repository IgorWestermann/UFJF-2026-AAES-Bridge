package org.example;

public class ControleRemotoAvancado extends ControleRemoto {
    public ControleRemotoAvancado(Aparelho aparelho) { super(aparelho); }

    public void silenciar() { aparelho.setVolume(0); }
}
