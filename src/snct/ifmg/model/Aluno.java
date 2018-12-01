/*
 * Copyright (c) 2018. Diego e Manoel. Todos os Direitos Reservados.
 */

package snct.ifmg.model;

public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String matricula) {
        this.matricula = matricula;
    }

    public Aluno(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void realizarInscricao() {

    }

    public void cancelarInscricao() {

    }

}
