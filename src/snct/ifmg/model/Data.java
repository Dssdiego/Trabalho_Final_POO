/*
 * Copyright (c) 2018. Diego e Manoel. Todos os Direitos Reservados.
 */

package snct.ifmg.model;

public class Data {
    private Integer dia;
    private Integer mes;
    private Integer ano;

    private Integer hora;
    private Integer minuto;

    public Data(Integer dia, Integer mes, Integer ano, Integer hora, Integer minuto) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.minuto = minuto;
    }

    public String getData() {
        return String.valueOf(dia) + "/" + String.valueOf(mes) + "/" + String.valueOf(ano) + " " + String.valueOf(hora) + ":" + String.valueOf(minuto);
    }

    public void setData(Integer dia, Integer mes, Integer ano, Integer hora, Integer minuto) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        this.hora = hora;
        this.minuto = minuto;
    }
}
