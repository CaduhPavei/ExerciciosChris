package ListaPilhas;
/*Escreva um algoritmo, usando uma Pilha, que inverte as letras de cada palavra de um texto terminado por ponto (.)
preservando a ordem das palavras.
  Por exemplo, dado o texto: ESTE EXERCÍCIO É MUITO FÁCIL.
  A saída deve ser ETSE OICÍCREXE É OTIUM LICÁF
 */
import java.util.Scanner;
import java.util.Stack;

public class Execicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<String> P = new Stack<>();
        Stack<String> P2 = new Stack<>();

        System.out.println("Escreva uma frase: ");
        String frase = scan.nextLine();
        P.push(frase);
        while (!P.isEmpty()){
            P2.push(P.pop());
        }

        System.out.println(P2);
    }
}
