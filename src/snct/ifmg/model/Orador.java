/*
 * Copyright (c) 2018. Diego e Manoel. Todos os Direitos Reservados.
 */

package snct.ifmg.model;

public class Orador extends Pessoa {
    private String formacao;

    public Orador(String formacao) {
        this.formacao = formacao;
    }

    public Orador(String nome, String cpf, String formacao) {
        super(nome, cpf);
        this.formacao = formacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
