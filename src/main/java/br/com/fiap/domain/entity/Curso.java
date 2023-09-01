package br.com.fiap.domain.entity;

public class Curso {

    private Long id;

    private String nome;

    private Short cargaHoraria;


    public Curso() {
    }

    public Curso(Long id, String nome, Short cargaHoraria) {
        this.id = id;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public Long getId() {
        return id;
    }

    public Curso setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Curso setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Short getCargaHoraria() {
        return cargaHoraria;
    }

    public Curso setCargaHoraria(Short cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
        return this;
    }


    @Override
    public String toString() {
        return id + " - " + nome + " - " + cargaHoraria + " horas";
    }

    public long size() {
    }
}
