/*
 * Copyright (c) 2018. Diego e Manoel. Todos os Direitos Reservados.
 */

package snct.ifmg.model;

public class EventoItem implements Agendavel {

    private String tema;
    private Data data;

    public EventoItem(String tema, Data data) {
        this.tema = tema;
        this.data = data;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public Boolean temConflitos() {
        return null;
    }

}
