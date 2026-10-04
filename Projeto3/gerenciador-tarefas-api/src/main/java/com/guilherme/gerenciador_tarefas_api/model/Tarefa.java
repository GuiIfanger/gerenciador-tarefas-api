package com.guilherme.gerenciador_tarefas_api.model;

import com.guilherme.gerenciador_tarefas_api.enums.StatusTarefa;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_tarefas")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private LocalDate dataEntrega;

    @Enumerated(EnumType.STRING)
    private StatusTarefa status;

    public Tarefa() {
    }

    public Tarefa(Long id, String nome, String descricao, LocalDate dataEntrega, StatusTarefa status) {

        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataEntrega = dataEntrega;
        this.status = status;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }
    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public StatusTarefa getStatus() {
        return status;
    }
    public void setStatus(StatusTarefa status) {
        this.status = status;
    }
}
