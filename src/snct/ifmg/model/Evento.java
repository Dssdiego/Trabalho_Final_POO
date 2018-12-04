/*
 * Copyright (c) 2018. Diego e Manoel. Todos os Direitos Reservados.
 */

package snct.ifmg.model;

import java.util.ArrayList;
import java.util.List;

public class Evento {

    //    List<EventoItem> eventoItemList = new ArrayList<>();
    List<Palestra> palestraList = new ArrayList<>();
    List<MiniCurso> miniCursoList = new ArrayList<>();

    private Integer eventoID;
    private String area;

    public Evento(Integer eventoID, String area) {
        this.eventoID = eventoID;
        this.area = area;
    }

    public Integer getEventoID() {
        return eventoID;
    }

    public String getArea() {
        return area;
    }

    public void getPalestras(Integer eventoID) {
        for (Palestra palestra : palestraList) {
            if (eventoID.equals(getEventoID()))
                System.out.println(palestra.getTema() + " - " + palestra.getDataFormatada());
        }
    }

    public void getMiniCursos(Integer eventoID) {
        for (MiniCurso miniCurso : miniCursoList) {
            if (eventoID.equals(getEventoID()))
                System.out.println(miniCurso.getTema() + " - " + miniCurso.getDataFormatada());
        }
    }

    public void adicionarPalestra(Palestra palestra) {
//        palestraList.add(new Palestra(id, tema, usaAuditorio));
//        eventoItemList.add(new Palestra(palestra.getId(), palestra.getTema(), palestra.getData(), palestra.getUsaAuditorio()));
        palestraList.add(new Palestra(palestra.getId(), palestra.getTema(), palestra.getData(), palestra.getUsaAuditorio()));
    }

    public void adicionarMiniCurso(MiniCurso miniCurso) {
//        miniCursoList.add(new MiniCurso(id, tema, recursos));
//        eventoItemList.add(new MiniCurso(miniCurso.getId(), miniCurso.getTema(), miniCurso.getData(), miniCurso.getRecursos()));
        miniCursoList.add(new MiniCurso(miniCurso.getId(), miniCurso.getTema(), miniCurso.getData(), miniCurso.getRecursos()));
    }

    public void removerPalestra(Integer id) throws NonExistentException{
        palestraList.remove(encontrarPalestra(id));
//        eventoItemList.remove(encontrarPalestra(id));
    }

    public void removerMiniCurso(Integer id) throws NonExistentException{
        miniCursoList.remove(encontrarMiniCurso(id));
//        eventoItemList.remove(encontrarMiniCurso(id));
    }

    private Palestra encontrarPalestra(Integer id) throws NonExistentException{
        for (Palestra palestra : palestraList) {
            if (palestra.getId().equals(id)) {
                return palestra;
            }
        }
        throw new NonExistentException("Palestra inexistente.");
    }

    private MiniCurso encontrarMiniCurso(Integer id) throws NonExistentException{
        for (MiniCurso miniCurso : miniCursoList) {
            if (miniCurso.getId().equals(id)) {
                return miniCurso;
            }
        }
        throw new NonExistentException("Mini Curso inexistente.");
    }
    
    public EventoItem encontrarEventoItem(Integer id) throws NonExistentException{
        for (EventoItem miniCurso : miniCursoList) {
            if (miniCurso.getId().equals(id)) {
                return miniCurso;
            }
        }
        for (EventoItem palestra : palestraList) {
            if (palestra.getId().equals(id)) {
                return palestra;
            }
        }
        throw new NonExistentException("Mini Curso/Palestra inexistente.");
    }

}