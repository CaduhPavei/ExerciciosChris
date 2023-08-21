package ListaPilhas;
/*Desenvolva um algoritmo para inverter a posição dos elementos de uma pilha P.
  Você pode criar pilhas auxiliares, se necessário.
  Mas o resultado precisa ser dado na pilha P.
 */
import java.util.Stack;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> P = new Stack<>();
        Stack<Integer> P2 = new Stack<>();

        for(int i=0;i<5;i++){
            System.out.println("Digite os elementos a serem adicionados e invertidos: ");
            int num = scan.nextInt();
            P2.push(num);
        }
        while (P.isEmpty()) {
            int num2 = P2.pop();
            P.push(num2);
        }
        System.out.println("Pilha P invertida: " + P);
    }
}
