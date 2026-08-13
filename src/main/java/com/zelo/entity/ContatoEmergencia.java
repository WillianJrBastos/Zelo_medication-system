package com.zelo.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "contatosemergencia")
public class ContatoEmergencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String telefone;
    private String parentesco;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public ContatoEmergencia() {
    }

    public ContatoEmergencia(long id, String nome, String telefone, String parentesco, Usuario usuario) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.parentesco = parentesco;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
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
        ContatoEmergencia that = (ContatoEmergencia) o;
        return id == that.id && Objects.equals(nome, that.nome) && Objects.equals(telefone, that.telefone) && Objects.equals(parentesco, that.parentesco) && Objects.equals(usuario, that.usuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, telefone, parentesco, usuario);
    }

    @Override
    public String toString() {
        return "ContatoEmergencia{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", parentesco='" + parentesco + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}
