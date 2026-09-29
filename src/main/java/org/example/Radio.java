package org.example;

public class Radio implements Aparelho {
    private boolean ligado;
    private int volume = 20;

    @Override
    public boolean estaLigado() {
        return ligado;
    }

    @Override
    public void ligar() {
        ligado = true;
    }

    @Override
    public void desligar() {
        ligado = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = Math.max(0, Math.min(100, volume));
    }

    @Override
    public String getNome() {
        return "Rádio";
    }
}
