package ListaVetor;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> vetorA= new ArrayList<>();

        int menor=99999, soma=0,maior=0;

        for(int i=0;i<5;i++){
            System.out.println("Informe um valor: ");
            int num= ler.nextInt();
            vetorA.add(num);
            soma+= vetorA.get(i);

            if (vetorA.get(i)>maior){
                maior=vetorA.get(i);
            }
            if (vetorA.get(i)<menor){
                menor=vetorA.get(i);
            }

        }
        System.out.println("\n"+"Todos os elementos do vetor A são: "+vetorA);
        System.out.println("O maior elemento do vetor A é: "+ maior);
        System.out.println("O menor elemento do vetor A é: "+ menor);
        System.out.println("A soma dos elementos do vetor A é: "+soma);
        System.out.println("A média é: " + soma/vetorA.size());
    }
}
