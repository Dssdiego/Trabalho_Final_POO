/*
 * Copyright (c) 2018. Diego e Manoel. Todos os Direitos Reservados.
 */

package snct;

public class Aluno extends Pessoa{
    String matricula;

    public Aluno(String nome, String cpf, String matricula) {
        super(nome,cpf);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
