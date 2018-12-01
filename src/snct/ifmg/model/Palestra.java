/*
 * Copyright (c) 2018. Diego e Manoel. Todos os Direitos Reservados.
 */

package snct.ifmg.model;

public class Palestra extends EventoItem{

    private Boolean usaAuditorio;

    public Palestra(String tema, Boolean usaAuditorio) {
        super(tema);
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
