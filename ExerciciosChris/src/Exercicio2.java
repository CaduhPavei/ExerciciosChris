//2) Elabore um programa que leia 5 números inteiros em um vetor A, e gere e imprima o vetor T com o triplo dos valores do vetor A:

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> vetorA= new ArrayList<>();
        ArrayList<Integer> vetorT= new ArrayList<>();


        for(int i=0;i<5;i++){
            System.out.println("Informe um valor: ");
            int num= ler.nextInt();
            vetorA.add(num);
            vetorT.add(num*3);




        }
        System.out.println("\n"+"Todos os elementos do vetor A são: "+vetorA);
        System.out.println("\n"+"Todos os elementos do vetor T são: "+vetorT);

    }
}
