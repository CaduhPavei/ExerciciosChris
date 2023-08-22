package ListaPilhas;
/*Desenvolva uma algoritmo para testar se duas pilhas P1 e P2 são iguais.
  Duas pilhas são iguais se possuem os mesmos elementos na mesma ordem.
 */
import java.util.Stack;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> P1 = new Stack<>();
        Stack<Integer> P2 = new Stack<>();

        for(int i=0;i<3;i++){
            System.out.println("Digite os valores a serem inseridos na pilha P1: ");
            int num = scan.nextInt();
            P1.push(num);
        }
        for(int i=0;i<3;i++){
            System.out.println("Digite os valores a serem inseridos na pilha P2: ");
            int num2 = scan.nextInt();
            P2.push(num2);
        }
        if(P1.equals(P2)){
            System.out.println("Pilhas são iguais!");
        }else{
            System.out.println("Pilhas diferentes!");
        }
    }
}
