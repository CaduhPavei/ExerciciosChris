package ListaVetor;//4) Elabore um programa que entre com 5 números inteiros em um vetor A
// e imprima o índice do primeiro número negativo, se houver. Caso não existam números negativos,
// imprimir a seguinte mensagem "Negativo não encontrado".
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> vetorA = new ArrayList<>();

        int negativo=0,posNegativo=0;

        for(int i=0;i<5;i++){
            System.out.println("Digite um número: ");
            int num = scan.nextInt();
            vetorA.add(num);
           }
        boolean existe = false;
        for(int i=0;i<vetorA.toArray().length;i++) {
            if (vetorA.get(i) < 0) {
                negativo = vetorA.get(i);
                posNegativo = i;
                existe=true;
                break;
            }
        }
        if(existe) {
            System.out.println("Negativo encontrado: " + negativo + ".");
            System.out.println("Sua posição é: " + posNegativo + ".");
        }else{
            System.out.println("Negativo não encontrado!");
        }
    }
}
