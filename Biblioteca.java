package AluguelDeLivro;

import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bem vindo a biblioteca");
        System.out.println("escolha uma opção, 1-ver os livros, 2-ver os teus livros, 3-sair");
        int opcao = sc.nextInt();
        sc.close();

        switch (opcao) {
            case 1:

                int livro = sc.nextInt();
                int opcao1 = sc.nextInt();
                System.out.println("os livros disponiveis são:");
                System.out.println("1. O Enigma da Esfinge");
                System.out.println("2. A Ilha dos Ventos");
                System.out.println("3. As Estrelas Sussurrantes");
                System.out.println("4. A Sombra do Corvo");
                System.out.println("5. O Labirinto Invisível");
                System.out.println("6. Sair");
                System.out.println("voce quer pegar um livro?");
                if (opcao1 == 1) {
                    switch (livro) {
                        case 1:
                            System.out.println("voce pegou o O Enigma da Esfinge");
                            break;
                        case 2:
                            System.out.println("voce pegou A Ilha dos Ventos");
                            break;
                        case 3:
                            System.out.println("voce pegou As Estrelas Sussurrantes");
                            break;
                        case 4:
                            System.out.println("voce pegou A Sombra do Corvo");
                            break;
                        case 5:
                            System.out.println("voce pegou o labirinto invisivel");
                            break;
                        case 6:
                            break;

                        default:
                            System.out.println("não achamos a opção escolhida");
                            break;
                    }

                    break;
                } else {
                    System.out.println("fechando o programa");
                }
                break;

            case 2:
                System.out.println("isso não funciona por enquanto");
                break;

            case 3:
                break;

            default:
                break;
        }
        sc.close();

    }
}
