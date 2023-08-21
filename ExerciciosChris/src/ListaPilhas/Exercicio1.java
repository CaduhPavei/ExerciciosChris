package ListaPilhas;
/*Desenvolva uma operação para transferir elementos de uma pilha P1 para uma pilha P2.
  Observação: A pilha P2 deve ficar igual a pilha P1.
  Mostrar na tela a pilha P1 depois mostrar a pilha P2.
*/
import java.util.Stack;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Stack<Integer> P1 = new Stack<>();
        Stack<Integer> P2 = new Stack<>();
        Stack<Integer> P3 = new Stack<>();

        Scanner scan = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Digite o elemento a ser adicionado a pilha: ");
            int num = scan.nextInt();
            P1.push(num);
        }
        while (!P1.isEmpty()) {
           P3.push(P1.pop());
        }
        while (!P3.isEmpty()){
            int num2 = P3.pop();
            P1.push(num2);
            P2.push(num2);
        }
        System.out.println("Pilha P1: " + P1);
        System.out.println("Pilha P2: " + P2);
    }
}
