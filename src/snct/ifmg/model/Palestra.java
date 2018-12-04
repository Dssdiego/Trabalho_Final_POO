/*
 * Copyright (c) 2018. Diego e Manoel. Todos os Direitos Reservados.
 */

package snct.ifmg.model;

public class Palestra extends EventoItem {

    private Boolean usaAuditorio;

    public Palestra(Integer id, String tema, Data data, Boolean usaAuditorio) {
        super(id, tema, data);
        this.usaAuditorio = usaAuditorio;
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
