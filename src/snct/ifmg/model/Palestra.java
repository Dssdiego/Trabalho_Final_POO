/*
 * Copyright (c) 2018. Diego e Manoel. Todos os Direitos Reservados.
 */

package snct.ifmg.model;

public class Palestra extends EventoItem {

    private Integer id;
    private Boolean usaAuditorio;

    public Palestra(Integer id, String tema, Data data, Boolean usaAuditorio) {
        super(tema, data);
        this.id = id;
        this.usaAuditorio = usaAuditorio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getUsaAuditorio() {
        return usaAuditorio;
    }

    public void setUsaAuditorio(Boolean usaAuditorio) {
        this.usaAuditorio = usaAuditorio;
    }

    @Override
    public Boolean temConflitos() {
        return super.temConflitos();
    }
}
