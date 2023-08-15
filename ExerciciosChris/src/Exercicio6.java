/*6) Elabore um programa que leia 5 números inteiros em um vetor A.
     Construir um vetor B de mesma dimensão, com os mesmo elementos do vetor A, os quais devem estar invertidos,
     ou seja, o primeiro elemento do vetor A passa a ser o último elemento do vetor B,
     o segundo elemento do vetor A, passa a ser o penúltimo elemento do vetor B, e assim por diante.
     Ao final, imprima os elementos dos 2 vetores. */

import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio6 {
    public static void main(String[] args) {
        ArrayList<Integer> vetorA= new ArrayList<>();
        ArrayList<Integer> vetorB= new ArrayList<>();
        Scanner scan= new Scanner(System.in);

        for(int i=0;i<5;i++){
            System.out.println("Digite um valor: ");
            int num=scan.nextInt();
            vetorA.add(num);
        }
        for(int i= vetorA.size()-1;i>=0;i--){
          vetorB.add(vetorA.get(i));
        }
        System.out.println("Vetor A: "+vetorA);
        System.out.println("Vetor B: "+vetorB);
    }
}
