package org.example;

public interface Aparelho {
    boolean estaLigado();
    void ligar();
    void desligar();
    int getVolume();
    void setVolume(int volume);
    String getNome();
}
