/*
 * Copyright (c) 2018. Diego e Manoel. Todos os Direitos Reservados.
 */

//TODO: cadastro no minicurso é feito pelo aluno
//TODO: cadastro do evento é feito pelo palestrante (são coisas separadas)
//TODO: conflito de horários de minicurso para o mesmo professor
//TODO: conflito de inscrição do aluno

package snct.ifmg.ui;

import snct.ifmg.controller.*;
import snct.ifmg.model.*;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws EmptyStringException {

        Agendador agendador = new Agendador();
        GerenciaAluno gerenciaAluno = new GerenciaAluno();
        int opcao;
        
        String nome;
        String cpf;
        String matricula;
        Integer eventoID;
        Integer eventoItemID;
        
        do {
            showMainMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: // Gerenciar evento
                    do {
                        showAgendaMenu();
                        opcao = scanner.nextInt();

                        switch (opcao) {
                            case 1: // Adicionar Evento
                                System.out.println("Digite o ID do Evento");
                                int id = scanner.nextInt();

                                scanner.nextLine();

                                System.out.println("Digite a área do Evento");
                                String ar = scanner.nextLine();

                                agendador.adicionarEvento(id, ar);

                                mostrarRodape();
                                break;
                            case 2: // Remover Evento
                                System.out.println("Digite o ID do Evento a ser Removido");
                                int idEvento = scanner.nextInt();

                                try {
                                    agendador.removerEvento(idEvento);
                                } catch (NonExistentException e) {
                                    e.printStackTrace();
                                }

                                mostrarRodape();
                                break;
                            case 3: // Listar Eventos
                                agendador.getEventos();

                                scanner.nextLine();

                                mostrarRodape();
                                break;
                            case 4: // Adicionar MiniCurso
                                System.out.println("Digite o ID do Evento");
                                int evento12 = scanner.nextInt();
                                scanner.nextLine();
                                
                                System.out.println("Digite o ID do Minicurso");
                                int miniCursoID = scanner.nextInt();
                                scanner.nextLine();

                                System.out.println("Digite o tema do Minicurso");
                                String miniCursoTema = scanner.nextLine();

                                System.out.println("Digite o dia do Minicurso");
                                Integer dia = scanner.nextInt();

                                System.out.println("Digite o mes do Minicurso");
                                Integer mes = scanner.nextInt();

                                System.out.println("Digite o ano do Minicurso");
                                Integer ano = scanner.nextInt();

                                System.out.println("Digite a hora do Minicurso");
                                Integer hora = scanner.nextInt();

                                System.out.println("Digite o minuto do Minicurso");
                                Integer minuto = scanner.nextInt();

                                Data data = new Data(dia, mes, ano, hora, minuto);
                                MiniCurso miniCurso = new MiniCurso(miniCursoID, miniCursoTema, data, null);

                                try {
                                    agendador.adicionarMiniCurso(evento12, miniCurso);
                                } catch (NonExistentException e) {
                                    e.printStackTrace();
                                }

                                scanner.nextLine();

                                mostrarRodape();
                                break;
                            case 5: // Remover MiniCurso
                                System.out.println("Digite o ID do Evento");
                                int evID = scanner.nextInt();

                                scanner.nextLine();

                                System.out.println("Digite o ID do MiniCurso a ser removido");
                                int miniID = scanner.nextInt();

                                try {
                                    agendador.removerMiniCurso(evID, miniID);
                                } catch (NonExistentException e) {
                                    e.printStackTrace();
                                }

                                scanner.nextLine();

                                mostrarRodape();

                                break;
                            case 6: // Listar MiniCursos
                                System.out.println("Digite o ID do Evento");
                                int eventID = scanner.nextInt();

                                agendador.getMiniCursos(eventID);

                                scanner.nextLine();

                                mostrarRodape();
                                break;
                            case 7: // Adicionar Palestra
                                System.out.println("Digite o ID do Evento");
                                int idEvento2 = scanner.nextInt();
                                scanner.nextLine();
                                
                                System.out.println("Digite o ID da Palestra");
                                int idPalestra = scanner.nextInt();

                                scanner.nextLine();

                                System.out.println("Digite o tema da Palestra");
                                String palestraTema = scanner.nextLine();

                                System.out.println("Digite o dia da Palestra");
                                Integer diaPalestra = scanner.nextInt();

                                System.out.println("Digite o mes da Palestra");
                                Integer mesPalestra = scanner.nextInt();

                                System.out.println("Digite o ano da Palestra");
                                Integer anoPalestra = scanner.nextInt();

                                System.out.println("Digite a hora da Palestra");
                                Integer horaPalestra = scanner.nextInt();

                                System.out.println("Digite o minuto da Palestra");
                                Integer minutoPalestra = scanner.nextInt();

                                System.out.println("Usa Auditorio? (s/n)");
                                Boolean usaAuditorio = scanner.next().equals("s");

                                Data dataPalestra = new Data(diaPalestra, mesPalestra, anoPalestra, horaPalestra, minutoPalestra);
                                Palestra palestra = new Palestra(idPalestra, palestraTema, dataPalestra, usaAuditorio);

                                try {
                                    agendador.adicionarPalestra(idEvento2, palestra);
                                } catch (NonExistentException e) {
                                    e.printStackTrace();
                                }

                                scanner.nextLine();

                                mostrarRodape();
                                break;
                            case 8: // Remover Palestra
                                System.out.println("Digite o ID do Evento");
                                int eventRemoveID = scanner.nextInt();

                                scanner.nextLine();

                                System.out.println("Digite o ID da Palestra a ser removida");
                                int palessID = scanner.nextInt();

                                try {
                                    agendador.removerPalestra(eventRemoveID, palessID);
                                } catch (NonExistentException e) {
                                    e.printStackTrace();
                                }

                                scanner.nextLine();

                                mostrarRodape();

                                break;
                            case 9: // Listar Palestras
                                System.out.println("Digite o ID do Evento");
                                int evvvID = scanner.nextInt();

                                agendador.getPalestras(evvvID);

                                scanner.nextLine();

                                mostrarRodape();
                                break;
                            case 10: // Voltar o menu principal
                                break;
                            default:
                                System.out.println("Opcao inválida, tente novamente");
                        }
                    } while (opcao != 10);
                    break;
                case 2: // Gerenciar alunos
                    do {
                        showStudentMenu();
                        opcao = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcao) {
                            case 1: // Adicionar Aluno
                                System.out.println("Digite o nome do aluno");
                                nome = scanner.nextLine();
                                System.out.println("Digite o cpf do aluno");
                                cpf = scanner.nextLine();
                                System.out.println("Digite a matricula do aluno");
                                matricula = scanner.nextLine();
                                gerenciaAluno.adicionarAluno(nome, cpf, matricula);
                                
                                mostrarRodape();
                                break;
                            case 2: // Remover Aluno
                                gerenciaAluno.listarAlunos();
                                System.out.println("Digite a matricula do aluno");
                                matricula = scanner.nextLine();
                                try{
                                    gerenciaAluno.removerAluno(matricula);
                                } catch (NonExistentException nExc){
                                    System.out.println(nExc.getMessage());
                                }
                                
                                mostrarRodape();
                                break;
                            case 3: // Cadastrar aluno em eventoItem
                                gerenciaAluno.listarAlunos();
                                System.out.println("Digite a matricula do aluno");
                                matricula = scanner.nextLine();
                                System.out.println("Digite o id do evento em que deseja cadastrar o aluno");
                                eventoID = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Digite o id do mini curso/Palestra que deseja cadastrar o aluno");
                                eventoItemID = scanner.nextInt();
                                scanner.nextLine();
                                try{
                                    gerenciaAluno.inscreverAlunoEmEventoItem(matricula, eventoID, eventoItemID, agendador);
                                } catch (NonExistentException nExc){
                                    System.out.println(nExc.getMessage());
                                }
                                
                                mostrarRodape();
                                break;
                            case 4: // Remover aluno de eventoItem
                                gerenciaAluno.listarAlunos();
                                System.out.println("Digite a matricula do aluno");
                                matricula = scanner.nextLine();
                                System.out.println("Digite o id do evento do qual deseja remover o aluno");
                                eventoID = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Digite o id do mini curso/Palestra do qual deseja remover o aluno");
                                eventoItemID = scanner.nextInt();
                                scanner.nextLine();
                                try{
                                    gerenciaAluno.cancelarInscricaoAlunoEmEventoItem(matricula, eventoID, eventoItemID, agendador);
                                } catch (NonExistentException nExc){
                                    System.out.println(nExc.getMessage());
                                }
                                
                                mostrarRodape();
                                break;
                            case 5: // Gerar certificados
                                gerenciaAluno.listarAlunos();
                                System.out.println("Digite a matricula do aluno");
                                matricula = scanner.nextLine();
                                try{
                                    gerenciaAluno.encontrarAluno(matricula).emitirCertificado();
                                } catch (NonExistentException nExc){
                                    System.out.println(nExc.getMessage());
                                }
                                
                                mostrarRodape();
                                break;
                            case 6: // Voltar o menu principal
                                break;
                            default:
                                System.out.println("Opcao inválida, tente novamente");
                        }
                    } while (opcao != 6);
                    break;
                case 3: // Fechar Aplicação
                    break;
                default:
                    System.out.println("Opcao inválida, tente novamente");
            }
        } while (opcao != 3);

        

        // TESTES
//        agendador.adicionarEvento(0, "Sistemas de Informação");
//        agendador.adicionarEvento(1, "Administração");
//
//        Palestra reflexoesUniverso = new Palestra(0, "Reflexões sobre o Universo", new Data(1, 12, 18, 13, 51), false);
//        Palestra aleluia = new Palestra(0, "Orações para o Brasil", new Data(1, 12, 18, 13, 51), false);
//        MiniCurso introducaoAndroid = new MiniCurso(0, "Introdução ao Android", new Data(26, 9, 18, 15, 0), null);
//
//        agendador.adicionarPalestra(0, reflexoesUniverso);
//        agendador.adicionarPalestra(0, aleluia);
//        agendador.adicionarMiniCurso(0, introducaoAndroid);
//
//        System.out.println("\nEventos:");
//        agendador.getEventos();
//
//        System.out.println("\nPalestras - 0");
//        agendador.getPalestras(0);
//
//        System.out.println("\nPalestras - 1:");
//        agendador.getPalestras(1);
//
//        System.out.println("\nMiniCursos - 0");
//        agendador.getMiniCursos(0);
//
//        System.out.println("\nMiniCursos - 1:");
//        agendador.getMiniCursos(1);
//
//        System.out.println("\nRemoção:");
//        System.out.println("\nPalestra - 0");
//        agendador.removerMiniCurso(0, 0);
//
//        System.out.println("\nMiniCursos - 0");
//        agendador.getMiniCursos(0);
//
//        agendador.adicionarMiniCurso(1, introducaoAndroid);
//
//        System.out.println("\nMiniCursos - 1");
//        agendador.getMiniCursos(1);
    }

    public static void mostrarRodape() {
        System.out.println("Aperte qualquer tecla para continuar...");
        scanner.nextLine();
        showAgendaMenu();
    }

    private static void showMainMenu() {
        clearConsole();
        System.out.println("----------------------");
        System.out.println("1) Gerenciar Eventos");
        System.out.println("2) Gerenciar Alunos");
        System.out.println("3) Sair do Sistema");
        System.out.println("----------------------");
    }
    
    private static void showAgendaMenu() {
        clearConsole();
        System.out.println("----------------------");
        System.out.println("1) Adicionar Evento");
        System.out.println("2) Remover Evento");
        System.out.println("3) Listar Eventos");
        System.out.println("\n4) Adicionar MiniCurso");
        System.out.println("5) Remover MiniCurso");
        System.out.println("6) Listar Minicursos");
        System.out.println("\n7) Adicionar Palestra");
        System.out.println("8) Remover Palestra");
        System.out.println("9) Listar Palestras");
        System.out.println("\n10) Voltar ao Menu Principal");
        System.out.println("----------------------");
    }
    
    private static void showStudentMenu() {
        clearConsole();
        System.out.println("----------------------");
        System.out.println("1) Adicionar Aluno");
        System.out.println("2) Remover Aluno");
        System.out.println("\n3) Cadastrar Aluno em EventoItem");
        System.out.println("4) Remover Aluno de EventoItem");
        System.out.println("\n5) Gerar Certificados");
        System.out.println("\n6) Voltar ao Menu Principal");
        System.out.println("----------------------");
    }

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
    private static void clearConsole() {
        for (int i = 0; i <= 100; i++) {
            System.out.println();
        }
    }
}
