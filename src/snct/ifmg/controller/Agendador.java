/*
 * Copyright (c) 2018. Diego e Manoel. Todos os Direitos Reservados.
 */

package snct.ifmg.controller;

import snct.ifmg.model.Data;
import snct.ifmg.model.Evento;
import snct.ifmg.model.MiniCurso;
import snct.ifmg.model.Palestra;

import java.util.ArrayList;
import java.util.List;

public class Agendador {

    List<Evento> eventoList = new ArrayList<>();

    public Agendador() {
    }

    public void adicionarEvento(Integer eventoID, String area) {
        eventoList.add(new Evento(eventoID, area));
    }

    public void adicionarPalestra(Integer eventoID, Palestra palestra) {
        for (Evento evento : eventoList) {
            if (evento.getEventoID().equals(eventoID)) {
                evento.adicionarPalestra(palestra);
                logaMensagem(palestra.getTema() + " adicionada com sucesso");
            }
        }
    }

    public void adicionarMiniCurso(Integer eventoID, MiniCurso miniCurso) {
        for (Evento evento : eventoList) {
            if (evento.getEventoID().equals(eventoID)) {
                evento.adicionarMiniCurso(miniCurso);
                logaMensagem(miniCurso.getTema() + " adicionado com sucesso");
            }
        }
    }

    public void removerEvento() {

    }

    public void removerMiniCurso() {

    }

    public void removerPalestra() {

    }

    public void getEventos() {
        for (Evento evento : eventoList) {
            System.out.println(evento.getArea());
        }
    }

    public void getPalestras(Integer eventoID) {
        for (Evento evento : eventoList) {
            evento.getPalestras(eventoID);
//            if (evento.getEventoID().equals(eventoID))
//                System.out.println(evento.getArea());
        }
    }

    public void getMiniCursos(Integer eventoID) {
        try {
            for (Evento evento : eventoList) {
                if (evento.getEventoID().equals(eventoID))
                    System.out.println(evento.getArea());
            }
        } catch (Exception e) {

        }
    }

    private void logaMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
