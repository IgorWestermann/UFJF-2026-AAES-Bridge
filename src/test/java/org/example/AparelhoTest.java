package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AparelhoTest {
    @Test
    void deveLimitarVolumeDaTelevisao() {
        Aparelho televisao = new Televisao();
        televisao.setVolume(150);
        assertEquals(100, televisao.getVolume());
    }

    @Test
    void deveLimitarVolumeDoRadio() {
        Aparelho radio = new Radio();
        radio.setVolume(-10);
        assertEquals(0, radio.getVolume());
    }

    @Test
    void deveIdentificarAparelhos() {
        assertEquals("Televisão", new Televisao().getNome());
        assertEquals("Rádio", new Radio().getNome());
    }
}
