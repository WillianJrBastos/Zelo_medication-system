package com.zelo.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Medicamento {

    private long id;
    private String nome;
    private String dosagem;
    private String formato;
    private String viaAdministracao;
    private Integer quatidadeEstoque;
    private Integer dosesPorDia;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private boolean ativo;
    private Usuario usuario;

    public Medicamento() {
    }

    public Medicamento(long id, String nome, String dosagem, String formato, String viaAdministracao, Integer quatidadeEstoque, Integer dosesPorDia, LocalDate dataInicio, LocalDate dataFim, boolean ativo, Usuario usuario) {
        this.id = id;
        this.nome = nome;
        this.dosagem = dosagem;
        this.formato = formato;
        this.viaAdministracao = viaAdministracao;
        this.quatidadeEstoque = quatidadeEstoque;
        this.dosesPorDia = dosesPorDia;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.ativo = ativo;
        this.usuario = usuario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getViaAdministracao() {
        return viaAdministracao;
    }

    public void setViaAdministracao(String viaAdministracao) {
        this.viaAdministracao = viaAdministracao;
    }

    public Integer getQuatidadeEstoque() {
        return quatidadeEstoque;
    }

    public void setQuatidadeEstoque(Integer quatidadeEstoque) {
        this.quatidadeEstoque = quatidadeEstoque;
    }

    public Integer getDosesPorDia() {
        return dosesPorDia;
    }

    public void setDosesPorDia(Integer dosesPorDia) {
        this.dosesPorDia = dosesPorDia;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Medicamento that = (Medicamento) o;
        return id == that.id && ativo == that.ativo && Objects.equals(nome, that.nome) && Objects.equals(dosagem, that.dosagem) && Objects.equals(formato, that.formato) && Objects.equals(viaAdministracao, that.viaAdministracao) && Objects.equals(quatidadeEstoque, that.quatidadeEstoque) && Objects.equals(dosesPorDia, that.dosesPorDia) && Objects.equals(dataInicio, that.dataInicio) && Objects.equals(dataFim, that.dataFim) && Objects.equals(usuario, that.usuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, dosagem, formato, viaAdministracao, quatidadeEstoque, dosesPorDia, dataInicio, dataFim, ativo, usuario);
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dosagem='" + dosagem + '\'' +
                ", formato='" + formato + '\'' +
                ", viaAdministracao='" + viaAdministracao + '\'' +
                ", quatidadeEstoque=" + quatidadeEstoque +
                ", dosesPorDia=" + dosesPorDia +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                ", ativo=" + ativo +
                ", usuario=" + usuario +
                '}';
    }
}
