package com.zelo.entity;

import java.time.LocalTime;

public class Alarme {

    private long id;
    private LocalTime hora;
    private Boolean ativo;
    private Integer adiarMinutos;
    private Medicamento medicamento;

    public Alarme() {
    }

    public Alarme(long id, LocalTime hora, Boolean ativo, Integer adiarMinutos, Medicamento medicamento) {
        this.id = id;
        this.hora = hora;
        this.ativo = ativo;
        this.adiarMinutos = adiarMinutos;
        this.medicamento = medicamento;
    }
}
