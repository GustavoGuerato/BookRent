package AluguelDeLivro;

import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo à biblioteca");
        System.out.println("Escolha uma opção: 1 - Ver os livros, 2 - Ver os teus livros, 3 - Sair");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Os livros disponíveis são:");
                System.out.println("1. O Enigma da Esfinge");
                System.out.println("2. A Ilha dos Ventos");
                System.out.println("3. As Estrelas Sussurrantes");
                System.out.println("4. A Sombra do Corvo");
                System.out.println("5. O Labirinto Invisível");
                System.out.println("6. Sair");
                System.out.println("Você quer pegar um livro?");
                int livro = sc.nextInt();
                int opcao1 = sc.nextInt();

                if (opcao1 == 1) {
                    System.out.println("qual livro voce quer pegar?");
                    switch (livro) {

                        case 1:
                            System.out.println("Você pegou O Enigma da Esfinge");
                            break;
                        case 2:
                            System.out.println("Você pegou A Ilha dos Ventos");
                            break;
                        case 3:
                            System.out.println("Você pegou As Estrelas Sussurrantes");
                            break;
                        case 4:
                            System.out.println("Você pegou A Sombra do Corvo");
                            break;
                        case 5:
                            System.out.println("Você pegou O Labirinto Invisível");
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Não achamos a opção escolhida");
                            break;
                    }
                } else {
                    System.out.println("Fechando o programa");
                }
                break;

            case 2:
                System.out.println("Isso não funciona por enquanto");
                break;

            case 3:
                break;

            default:
                break;
        }

        sc.close();
    }
}
