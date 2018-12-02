/*
 * Copyright (c) 2018. Diego e Manoel. Todos os Direitos Reservados.
 */

package snct.ifmg.controller;

import snct.ifmg.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agendador {

    List<Evento> eventoList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Agendador() {
    }

    public void adicionarEvento(Integer eventoID, String area) throws EmptyStringException {
        if (area.equals("")) throw new EmptyStringException("Area Vazia");
        Evento evento = new Evento(eventoID, area);
        eventoList.add(evento);
        logaMensagem("EVENTO " + "\"" + evento.getArea() + "\"" + " adicionado com sucesso");
    }

    public void adicionarPalestra(Integer eventoID, Palestra palestra) {
        for (Evento evento : eventoList) {
            if (evento.getEventoID().equals(eventoID)) {
                evento.adicionarPalestra(palestra);
                logaMensagem("PALESTRA " + "\"" + palestra.getTema() + "\"" + " adicionada com sucesso");
            }
        }
    }

    public void adicionarMiniCurso(Integer eventoID, MiniCurso miniCurso) {
        for (Evento evento : eventoList) {
            if (evento.getEventoID().equals(eventoID)) {
                evento.adicionarMiniCurso(miniCurso);
                logaMensagem("MINICURSO " + "\"" + miniCurso.getTema() + "\"" + " adicionado com sucesso");
            }
        }
    }

    public void removerEvento(Integer eventoID) {
        for (Evento evento : eventoList) {
            eventoList.remove(encontrarEvento(eventoID));
        }
    }

    public void removerMiniCurso(Integer eventoID, Integer miniCursoID) {
        for (Evento evento : eventoList) {
            if (evento.getEventoID().equals(eventoID)) {
                evento.removerMiniCurso(miniCursoID);
                logaMensagem("Minicurso de ID " + miniCursoID + " removido com sucesso");
            }
        }
    }

    public void removerPalestra(Integer eventoID, Integer palestraID) {
        for (Evento evento : eventoList) {
            if (evento.getEventoID().equals(eventoID)) {
                evento.removerPalestra(palestraID);
                logaMensagem("Palestra de ID " + palestraID + " removida com sucesso");
            }
        }
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

    private Evento encontrarEvento(Integer id) {
        for (Evento evento : eventoList) {
            if (evento.getEventoID().equals(id)) {
                return evento;
            }
        }
        return null;
    }

    private void logaMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
