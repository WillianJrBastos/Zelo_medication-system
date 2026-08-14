package com.zelo.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class RegistroMedicacao {

    private long id;
    private LocalDateTime dataHoraAgendada;
    private LocalDateTime dataHoraAcao;
    private String status;
    private Medicamento medicamento;

    public RegistroMedicacao() {
    }

    public RegistroMedicacao(long id, LocalDateTime dataHoraAgendada, LocalDateTime dataHoraAcao, String status, Medicamento medicamento) {
        this.id = id;
        this.dataHoraAgendada = dataHoraAgendada;
        this.dataHoraAcao = dataHoraAcao;
        this.status = status;
        this.medicamento = medicamento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getDataHoraAgendada() {
        return dataHoraAgendada;
    }

    public void setDataHoraAgendada(LocalDateTime dataHoraAgendada) {
        this.dataHoraAgendada = dataHoraAgendada;
    }

    public LocalDateTime getDataHoraAcao() {
        return dataHoraAcao;
    }

    public void setDataHoraAcao(LocalDateTime dataHoraAcao) {
        this.dataHoraAcao = dataHoraAcao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        RegistroMedicacao that = (RegistroMedicacao) o;
        return id == that.id && Objects.equals(dataHoraAgendada, that.dataHoraAgendada) && Objects.equals(dataHoraAcao, that.dataHoraAcao) && Objects.equals(status, that.status) && Objects.equals(medicamento, that.medicamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dataHoraAgendada, dataHoraAcao, status, medicamento);
    }

    @Override
    public String toString() {
        return "RegistroMedicacao{" +
                "id=" + id +
                ", dataHoraAgendada=" + dataHoraAgendada +
                ", dataHoraAcao=" + dataHoraAcao +
                ", status='" + status + '\'' +
                ", medicamento=" + medicamento +
                '}';
    }
}
