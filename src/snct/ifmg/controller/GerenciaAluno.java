/*
 * Copyright (c) 2018. Diego e Manoel. Todos os Direitos Reservados.
 */

package snct.ifmg.controller;

import snct.ifmg.model.*;

import java.util.ArrayList;
import java.util.List;

public class GerenciaAluno {

    List<Aluno> alunoList = new ArrayList<>();
    
    public GerenciaAluno() {}

    public void adicionarAluno(String nome, String cpf, String matricula) throws EmptyStringException {
        if (nome.equals("")) throw new EmptyStringException("Nome Vazio");
        if (cpf.equals("")) throw new EmptyStringException("CPF Vazio");
        if (matricula.equals("")) throw new EmptyStringException("Matricula Vazia");
        Aluno aluno = new Aluno(nome, cpf, matricula);
        this.alunoList.add(aluno);
        Utils.logaMensagem("ALUNO " + "\"" + aluno.getNome() + "\"" + " adicionado com sucesso");
    }

    public void removerAluno(String matricula) throws NonExistentException{
        Aluno aluno = encontrarAluno(matricula);
        this.alunoList.remove(aluno);
        Utils.logaMensagem("ALUNO " + "\"" + aluno.getNome() + "\"" + " removido com sucesso");
    }
    
    public void inscreverAlunoEmEventoItem(String matricula, Integer eventoID, Integer EventoItemID, Agendador agendador) throws NonExistentException{
        Aluno aluno = encontrarAluno(matricula);
        Evento evento = agendador.encontrarEvento(eventoID);
        EventoItem eventoItem = evento.encontrarEventoItem(EventoItemID);
        aluno.realizarInscricao(eventoItem);
    }
    
    public void cancelarInscricaoAlunoEmEventoItem(String matricula, Integer eventoID, Integer EventoItemID, Agendador agendador) throws NonExistentException{
        Aluno aluno = encontrarAluno(matricula);
        Evento evento = agendador.encontrarEvento(eventoID);
        EventoItem eventoItem = evento.encontrarEventoItem(EventoItemID);
        aluno.cancelarInscricao(eventoItem);
    }
    
    public void printAlunoData(String matricula) throws NonExistentException{
        Aluno aluno = encontrarAluno(matricula);
        aluno.imprimirDados();
    }
    
    private Aluno encontrarAluno(String matricula) throws NonExistentException{
        for (Aluno aluno : alunoList) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        throw new NonExistentException("Aluno inexistente.");
    }
}
