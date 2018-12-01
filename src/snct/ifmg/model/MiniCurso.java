/*
 * Copyright (c) 2018. Diego e Manoel. Todos os Direitos Reservados.
 */

package snct.ifmg.model;

public class MiniCurso extends EventoItem {

    private String[] recursos;

    public MiniCurso(String tema, String[] recursos) {
        super(tema);
        this.recursos = recursos;
    }

    public String[] getRecursos() {
        return recursos;
    }

    public void setRecursos(String[] recursos) {
        this.recursos = recursos;
    }

    @Override
    public Boolean temConflitos() {
        return super.temConflitos();
    }
}
