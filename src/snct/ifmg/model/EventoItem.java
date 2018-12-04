/*
 * Copyright (c) 2018. Diego e Manoel. Todos os Direitos Reservados.
 */

package snct.ifmg.model;

public class EventoItem implements Agendavel {

    private String tema;
    private Data data;
    private Integer id;

    public EventoItem(Integer id, String tema, Data data) {
        this.id = id;
        this.tema = tema;
        this.data = data;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getDataFormatada() {
        return data.getDataFormatada();
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Boolean temConflitos() {
        return null;
    }
}
