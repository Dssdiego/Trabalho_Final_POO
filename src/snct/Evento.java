/*
 * Copyright (c) 2018. Diego e Manoel. Todos os Direitos Reservados.
 */

package snct;

import java.util.Date;

public abstract class Evento {

    public enum Tipo{
        palestra, minicurso;
    }

    private Date datas;
    private float cargaHoraria;
    private Pessoa orador;
    private String nome;
    private Tipo tipo;

    public Evento() {
    }

    public Evento(float cargaHoraria, String nome, Tipo tipo) {
        this.cargaHoraria = cargaHoraria;
        this.nome = nome;
        this.tipo = tipo;
    }

    public Evento(Date datas, float cargaHoraria, Pessoa orador, String nome, Tipo tipo) {
        this.datas = datas;
        this.cargaHoraria = cargaHoraria;
        this.orador = orador;
        this.nome = nome;
        this.tipo = tipo;
    }

    public Date getDatas() {
        return datas;
    }

    public void setDatas(Date datas) {
        this.datas = datas;
    }

    public float getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Pessoa getOrador() {
        return orador;
    }

    public void setOrador(Pessoa orador) {
        this.orador = orador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }


}