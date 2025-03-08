package com.sistema.relogio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RelogioBrasileiroTest {

    @Test
    void testRelogioBrasileiro() {
        RelogioBrasileiro relogio = new RelogioBrasileiro(15, 30, 45);
        assertEquals("15:30:45", relogio.getHoraFormatada());
    }

    @Test
    void testSincronizar() {
        RelogioBrasileiro relogioBrasileiro = new RelogioBrasileiro(15, 30, 45);
        RelogioAmericano relogioAmericano = new RelogioAmericano(18, 45, 15);
        relogioBrasileiro.sincronizar(relogioAmericano);
        assertEquals("06:45:15", relogioBrasileiro.getHoraFormatada());
    }
}
