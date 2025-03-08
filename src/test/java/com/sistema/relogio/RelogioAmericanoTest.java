package com.sistema.relogio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RelogioAmericanoTest {

    @Test
    void testRelogioAmericano() {
        RelogioAmericano relogio = new RelogioAmericano(15, 30, 45);
        assertEquals("03:30:45", relogio.getHoraFormatada()); // 15h em formato 12h é 3h
    }

    @Test
    void testSincronizar() {
        RelogioAmericano relogioAmericano = new RelogioAmericano(15, 30, 45);
        RelogioBrasileiro relogioBrasileiro = new RelogioBrasileiro(18, 45, 15);
        relogioAmericano.sincronizar(relogioBrasileiro);
        assertEquals("06:45:15", relogioAmericano.getHoraFormatada()); // 18h em formato 12h é 6h
    }

}
