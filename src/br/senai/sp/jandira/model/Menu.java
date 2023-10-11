package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    public void Menu(){

        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while(continuar){

            System.out.println("----------------------------");
            System.out.println("            Menu");
            System.out.println("----------------------------");
            System.out.println("");
            System.out.println("Escolha uma opção:");
            System.out.println("[1 - Comprar Sorvete]");
            System.out.println("[2 - Comer Sorvete]");
            System.out.println("[3 - Seus Sorvetes]");
            System.out.println("[4 - Sair]");
            System.out.println("");

            int resposta = scanner.nextInt();
            scanner.nextLine();

            System.out.println("");

            switch (resposta) {

                case 1:
                    System.out.println("Qual o tipo do sorvete");
                    System.out.println("[1 - Picole]");
                    System.out.println("[2 - Casquinha]");
                    System.out.println("[3 - Pote]");
                    int respostaTipo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("");

                    switch (respostaTipo){

                        case 1:
                            break;

                        case 2:
                            break;

                        case 3:
                            break;

                    }

                    break;

                case 2:
                    System.out.println("Function in development");
                    break;

                case 3:
                    System.out.println("Function in development");
                    break;

                case 4:
                    continuar = false;
                    break;


            }

        }

    }

}
