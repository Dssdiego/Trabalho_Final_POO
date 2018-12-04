/*
 * Copyright (c) 2018. Diego e Manoel. Todos os Direitos Reservados.
 */

package snct.ifmg.model;

public class MiniCurso extends EventoItem {

    private String[] recursos;

    public MiniCurso(Integer id, String tema, Data data, String[] recursos) {
        super(id, tema, data);
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
