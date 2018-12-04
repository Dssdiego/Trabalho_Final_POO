/*
 * Copyright (c) 2018. Diego e Manoel. Todos os Direitos Reservados.
 */

package snct.ifmg.controller;

import snct.ifmg.model.*;

import java.util.ArrayList;
import java.util.List;

public class Agendador {

    List<Evento> eventoList = new ArrayList<>();

    public Agendador() {
    }

    public void adicionarEvento(Integer eventoID, String area) throws EmptyStringException {
        if (area.equals("")) throw new EmptyStringException("Area Vazia");
        Evento evento = new Evento(eventoID, area);
        eventoList.add(evento);
        Utils.logaMensagem("EVENTO " + "\"" + evento.getArea() + "\"" + " adicionado com sucesso");
    }

    public void adicionarPalestra(Integer eventoID, Palestra palestra)  throws NonExistentException{
        Evento evento = encontrarEvento(eventoID);
        evento.adicionarPalestra(palestra);
        Utils.logaMensagem("PALESTRA " + "\"" + palestra.getTema() + "\"" + " adicionada com sucesso");
    }

    public void adicionarMiniCurso(Integer eventoID, MiniCurso miniCurso)  throws NonExistentException{
        Evento evento = encontrarEvento(eventoID);
        evento.adicionarMiniCurso(miniCurso);
        Utils.logaMensagem("MINICURSO " + "\"" + miniCurso.getTema() + "\"" + " adicionado com sucesso");
    }

    public void removerEvento(Integer eventoID) throws NonExistentException{
        Evento evento = encontrarEvento(eventoID);
        eventoList.remove(evento);
        Utils.logaMensagem("EVENTO " + "\"" + evento.getArea() + "\"" + " removido com sucesso");
    }

    public void removerMiniCurso(Integer eventoID, Integer miniCursoID) throws NonExistentException{
        Evento evento = encontrarEvento(eventoID);
        evento.removerMiniCurso(miniCursoID);
        Utils.logaMensagem("Minicurso de ID " + miniCursoID + " removido com sucesso");
    }

    public void removerPalestra(Integer eventoID, Integer palestraID) throws NonExistentException{
        Evento evento = encontrarEvento(eventoID);
        evento.removerPalestra(palestraID);
        Utils.logaMensagem("Palestra de ID " + palestraID + " removida com sucesso");
    }

    public void getEventos() {
        System.out.println("--------- EVENTOS ---------");
        for (Evento evento : eventoList) {
            System.out.println(evento.getArea());
        }
        System.out.println("---------------------------");

    }

    public void getPalestras(Integer eventoID) {
        System.out.println("--------- PALESTRAS ---------");
        for (Evento evento : eventoList) {
            evento.getPalestras(eventoID);
        }
        System.out.println("-----------------------------");
    }

    public void getMiniCursos(Integer eventoID) {
        System.out.println("--------- MINICURSOS ---------");
        for (Evento evento : eventoList) {
            evento.getMiniCursos(eventoID);
        }
        System.out.println("------------------------------");
    }

    public Evento encontrarEvento(Integer id) throws NonExistentException{
        for (Evento evento : eventoList) {
            if (evento.getEventoID().equals(id)) {
                return evento;
            }
        }
        throw new NonExistentException("Evento inexistente.");
    }
}
