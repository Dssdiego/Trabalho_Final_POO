/*
 * Copyright (c) 2018. Diego e Manoel. Todos os Direitos Reservados.
 */

//TODO: cadastro no minicurso é feito pelo aluno
//TODO: cadastro do evento é feito pelo palestrante (são coisas separadas)
//TODO: conflito de horários de minicurso para o mesmo professor
//TODO: conflito de inscrição do aluno

package snct.ifmg.ui;

import snct.ifmg.controller.Agendador;
import snct.ifmg.model.Data;
import snct.ifmg.model.MiniCurso;
import snct.ifmg.model.Palestra;

public class Main {

    public static void main(String[] args) {

//        Data data = new Data(1,12,18,13,51);
//        System.out.println(data.getData()); // TESTE DATA OK

        Agendador agendador = new Agendador();
        agendador.adicionarEvento(0, "Sistemas de Informação");
        agendador.adicionarEvento(1, "Administração");

        Palestra reflexoesUniverso = new Palestra(0,"Reflexões sobre o Universo", new Data(1,12,18,13,51), false);
        Palestra aleluia = new Palestra(0,"Orações para o Brasil", new Data(1,12,18,13,51), false);
        MiniCurso introducaoAndroid = new MiniCurso(0, "Introdução ao Android", new Data(26,9,18,15,0),null);

        agendador.adicionarPalestra(0, reflexoesUniverso);
        agendador.adicionarPalestra(0, aleluia);
        agendador.adicionarMiniCurso(0, introducaoAndroid);

        System.out.println("\nEventos:");
        agendador.getEventos();

        System.out.println("\nPalestras - 0");
        agendador.getPalestras(0);

        System.out.println("\nPalestras - 1:");
        agendador.getPalestras(1);

        System.out.println("\nMiniCursos - 0");
        agendador.getMiniCursos(0);

        System.out.println("\nMiniCursos - 1:");
        agendador.getMiniCursos(1);

//        agendador.getMiniCursos(0);
    }

    //        Scanner scanner = new Scanner(System.in);
//        int opcao = 0;
//
//        showMainMenu();
//        do {
//            opcao = scanner.nextInt();
//
//            switch (opcao) {
//                case 1:
//                    manageEvents();
//                    break;
//                case 2:
//                    manageStudents();
//                    break;
//                case 3:
////                    showCertificatesMenu();
//                    break;
//            }
//        } while (opcao != 4);

    // Menu Evento
//        System.out.println("Digite o nome do Evento:");
//        System.out.println("Digite o tipo do Evento:");
//        System.out.println("Digite a data do Evento:");
//        System.out.println("Digite o cpf do orador do Evento:");
//        System.out.println("Digite a carga horária do Evento:");

    // Menu Orador
//        System.out.println("Digite o nome do Orador:");
//        System.out.println("Digite o cpf do Orador:");

//    private static void showMainMenu() {
//        clearConsole();
//        System.out.println("----------------------");
//        System.out.println("1) Gerenciar Eventos");
//        System.out.println("2) Gerenciar Alunos");
//        System.out.println("3) Gerar Certificados");
//        System.out.println("4) Sair do Sistema");
//        System.out.println("----------------------");
//    }
//
//    private static void manageEvents() {
//        int op = 0;
//        Scanner sc = new Scanner(System.in);
//        showRegisterEventMenu();
//
//        op = sc.nextInt();
//
//        switch (op) {
//            case 1:
//                registerLecture();
//                break;
//            case 2:
//                registerShortCourse();
//                break;
//            case 3:
//                showMainMenu();
//                break;
//        }
//    }
//
//    private static void registerLecture() {
//        clearConsole();
//        System.out.println("Cadastro Palestra");
//        showMainMenu();
//    }
//
//    private static void registerShortCourse() {
//        clearConsole();
//        System.out.println("Cadastro Minicurso");
//        showMainMenu();
//    }
//
//    private static void showRegisterEventMenu() {
//        clearConsole();
//        System.out.println("----------------------");
//        System.out.println("1) Palestra");
//        System.out.println("2) Minicurso");
//        System.out.println("3) Voltar");
//        System.out.println("----------------------");
//    }
//
//    private static void manageStudents() {
//        String nome;
//        String cpf;
//        String matricula;
//
//        Scanner sc = new Scanner(System.in);
//
//        clearConsole();
//
//        System.out.println("Digite o nome do Aluno:");
//        nome = sc.next();
//
//        System.out.println("Digite o cpf do Aluno:");
//        cpf = sc.next();
//
//        System.out.println("Digite a matrícula do Aluno:");
//        matricula = sc.next();
//
//        Aluno aluno = new Aluno(nome, cpf, matricula);
//        showMainMenu();
//    }
//
//    private static void clearConsole() {
//        for (int i = 0; i <= 100; i++) {
//            System.out.println();
//        }
//    }
}
