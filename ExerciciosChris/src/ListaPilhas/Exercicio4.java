package ListaPilhas;
/*Escreva um algoritmo, usando uma Pilha, que inverte as letras de cada palavra de um texto terminado por ponto (.)
preservando a ordem das palavras.
  Por exemplo, dado o texto: ESTE EXERCÍCIO É MUITO FÁCIL.
  A saída deve ser ETSE OICÍCREXE É OTIUM LICÁF
 */
import java.util.Scanner;
import java.util.Stack;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Character> charStack = new Stack<>();
        StringBuilder invertido = new StringBuilder();

        String frase;
        boolean validfrase = false;

        do {
            System.out.println("Escreva uma frase terminada por ponto: ");
            frase = scan.nextLine();

            if (frase.endsWith(".")) {
                validfrase = true;
            } else {
                System.out.println("Frase inválida! A frase deve ser terminada por um ponto. Tente novamente.");
            }
        } while (!validfrase);

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == ' ' || c == '.') {
                while (!charStack.isEmpty()) {
                    invertido.append(charStack.pop());
                }
                if (c == ' ') {
                    invertido.append(" ");
                } else {
                    invertido.append(".");
                }
            } else {
                charStack.push(c);
            }
        }

        System.out.println("Frase invertida: " + invertido);
    }
}
