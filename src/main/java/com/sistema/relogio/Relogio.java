package com.sistema.relogio;

public abstract class Relogio {
    private int hora;
    private int minuto;
    private int segundo;

    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public void setHora(int hora) {
        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Hora inválida. Deve estar entre 0 e 23.");
        }
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        if (minuto < 0 || minuto > 59) {
            throw new IllegalArgumentException("Minuto inválido. Deve estar entre 0 e 59.");
        }
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        if (segundo < 0 || segundo > 59) {
            throw new IllegalArgumentException("Segundo inválido. Deve estar entre 0 e 59.");
        }
        this.segundo = segundo;
    }

    public String getHoraFormatada() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public abstract void sincronizar(Relogio outroRelogio);

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

}
