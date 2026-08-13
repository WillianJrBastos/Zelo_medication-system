package com.zelo.entity;

import java.time.LocalDate;

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

}
