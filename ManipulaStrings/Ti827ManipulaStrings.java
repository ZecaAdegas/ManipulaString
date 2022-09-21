package ManipulaStrings;

import java.util.Scanner;

public class Ti827ManipulaStrings {

    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        do {
            System.out.println(">>>>>>>>>>MENU<<<<<<<<<<");
            System.out.println("1 - Tamanho String");
            System.out.println("2 - Árvore de Letras");
            System.out.println("3 - Capitalização de Letras");
            System.out.println("4 - Árvore de Letras (Substring)");
            System.out.println("5 - Substituir frase");
            System.out.println("0 - Sair");
            System.out.println("Selecione a opção pretendida: ");
            op = ler.nextInt();
            switch (op) {
                case 0:
                    break;
                case 1:
                    System.out.println("A string inserida tem: " +
                    ExerciciosStrings.contaCaracteres() + " caracteres");
                    break;
                case 2:
                    ExerciciosStrings.ArvoreChar();
                    break;
                case 3:
                    ExerciciosStrings.CapitalizaLetras();
                    break;
                case 4:
                    ExerciciosStrings.ArvoreCharSubString();
                    break;
                case 5:
                    ExerciciosStrings.SubstituirFrase();
                    break;
                default:
                    System.out.println("Insira opção válida");
            }
        } while (op != 0);

    }
}
