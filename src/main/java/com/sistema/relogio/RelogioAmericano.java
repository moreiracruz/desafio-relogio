package com.sistema.relogio;

public class RelogioAmericano extends Relogio {

    public RelogioAmericano(int hora, int minuto, int segundo) {
        super(hora > 12 ? hora - 12 : hora, minuto, segundo); // Converte para formato 12 horas
    }

    @Override
    public void sincronizar(Relogio outroRelogio) {
        int hora = outroRelogio.getHora();
        this.setHora(hora > 12 ? hora - 12 : hora); // Converte para formato 12 horas
        this.setMinuto(outroRelogio.getMinuto());
        this.setSegundo(outroRelogio.getSegundo());
    }

}
