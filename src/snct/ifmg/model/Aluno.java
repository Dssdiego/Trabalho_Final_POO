/*
 * Copyright (c) 2018. Diego e Manoel. Todos os Direitos Reservados.
 */

package snct.ifmg.model;

import java.util.ArrayList;

public class Aluno extends Pessoa implements EmiteCertificado {
    private String matricula;
    private ArrayList<EventoItem> eventoItemList;

    public Aluno(String matricula) {
        this.matricula = matricula;
        this.eventoItemList = new ArrayList<>();
    }

    public Aluno(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
        this.eventoItemList = new ArrayList<>();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public ArrayList<EventoItem> getEventoItemList() {
        return eventoItemList;
    }

    public void setEventoItemList(ArrayList<EventoItem> eventoItemList) {
        this.eventoItemList = eventoItemList;
    }

    public void realizarInscricao(EventoItem eventoItem) {
        this.eventoItemList.add(eventoItem);
    }

    public void cancelarInscricao(EventoItem eventoItem) {
        this.eventoItemList.remove(eventoItem);
    }

    public void imprimirDados(){
        String dados = "Nome:      " + this.getNome() + "\n" + 
                       "CPF:       " + this.getCpf() + "\n" + 
                       "Matricula: " + this.getMatricula() + "\n";
        System.out.println(dados);
    }
    
    @Override
    public void emitirCertificado() {
        System.out.println("Not supported yet.");
    }
}
