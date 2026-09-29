package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControleRemotoTest {
    @Test
    void deveLigarEDesligarAparelho() {
        Aparelho televisao = new Televisao();
        ControleRemoto controle = new ControleRemoto(televisao);
        controle.alternarLigadoDesligado();
        assertTrue(televisao.estaLigado());
        controle.alternarLigadoDesligado();
        assertFalse(televisao.estaLigado());
    }

    @Test
    void deveAumentarEDiminuirVolume() {
        Aparelho televisao = new Televisao();
        ControleRemoto controle = new ControleRemoto(televisao);
        controle.aumentarVolume();
        assertEquals(40, televisao.getVolume());
        controle.diminuirVolume();
        assertEquals(30, televisao.getVolume());
    }

    @Test
    void deveControlarAparelhosDiferentes() {
        Aparelho televisao = new Televisao();
        Aparelho radio = new Radio();
        new ControleRemoto(televisao).aumentarVolume();
        new ControleRemoto(radio).aumentarVolume();
        assertEquals(40, televisao.getVolume());
        assertEquals(30, radio.getVolume());
    }

    @Test
    void deveSilenciarAparelhoComControleAvancado() {
        Aparelho radio = new Radio();
        new ControleRemotoAvancado(radio).silenciar();
        assertEquals(0, radio.getVolume());
    }

    @Test
    void deveRejeitarAparelhoNulo() {
        assertThrows(NullPointerException.class, () -> new ControleRemoto(null));
    }
}
