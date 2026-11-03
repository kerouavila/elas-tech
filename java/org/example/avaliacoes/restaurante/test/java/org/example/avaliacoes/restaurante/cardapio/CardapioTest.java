package org.example.avaliacoes.restaurante.cardapio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CardapioTest {

    @Test
    void precoNegativoDeveLancarExcecao() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Lanche("Lanche Inválido", -10.0);
        });
    }

    @Test
    void lancheComAdicionalCustaPrecoEsperado() {

        ItemCardapio lanche = LancheFactory.bauruPileque();
        lanche = new ComCheddar(lanche);

        assertEquals(35.90, lanche.getPreco(), 0.001);
    }
}
