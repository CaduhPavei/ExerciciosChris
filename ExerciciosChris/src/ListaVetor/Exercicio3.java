package ListaVetor;/*3) Elabore um programa que leia um vetor X com 10 números e calcule
     e imprima a diferença entre o maior e o menor elemento existente no vetor,
     bem como as posições que o maior e o menor ocupam no conjunto de dados: */
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> vetorX= new ArrayList<>();

        int menor=99999, maior=0, pos_maior=0, pos_menor=0;


        for(int i=0;i<10;i++){
            System.out.println("Informe um valor: ");
            int num= ler.nextInt();
            vetorX.add(num);

            if (vetorX.get(i)>maior){
                maior=vetorX.get(i);
                pos_maior=i;
            }
            if (vetorX.get(i)<menor){
                menor=vetorX.get(i);
                pos_menor=i;
            }

        }
        System.out.println("\n"+"Todos os elementos do vetor A são: "+vetorX);
        System.out.println("O maior elemento do vetor é: "+ maior+ ", na posição "+pos_maior);
        System.out.println("O menor elemento do vetor é: "+ menor+ ", na posição "+pos_menor);
        System.out.println("A diferença entre o maior e o menor elemento do vetor é: "+(maior-menor));
    }
}
