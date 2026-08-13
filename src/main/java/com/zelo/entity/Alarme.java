package com.zelo.entity;

import jakarta.persistence.*;

import java.time.LocalTime;
import java.util.Objects;

@Entity
@Table(name = "alarmes")
public class Alarme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalTime hora;
    private Boolean ativo;
    private Integer adiarMinutos;

    @ManyToOne
    @JoinColumn(name = "medicamento_id")
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Integer getAdiarMinutos() {
        return adiarMinutos;
    }

    public void setAdiarMinutos(Integer adiarMinutos) {
        this.adiarMinutos = adiarMinutos;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alarme alarme = (Alarme) o;
        return id == alarme.id && Objects.equals(hora, alarme.hora) && Objects.equals(ativo, alarme.ativo) && Objects.equals(adiarMinutos, alarme.adiarMinutos) && Objects.equals(medicamento, alarme.medicamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hora, ativo, adiarMinutos, medicamento);
    }

    @Override
    public String toString() {
        return "Alarme{" +
                "id=" + id +
                ", hora=" + hora +
                ", ativo=" + ativo +
                ", adiarMinutos=" + adiarMinutos +
                ", medicamento=" + medicamento +
                '}';
    }
}
