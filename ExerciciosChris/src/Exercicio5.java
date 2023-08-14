    /*5) Dado um vetor A de 5 elementos A={7,21,15,12,82}, elabore um programa que solicite ao usuário
    um número e verifique se esse número encontra-se inserido no vetor. Caso o elemento esteja inserido no vetor,
    deve-se exibir uma mensagem indicando que o elemento foi encontrado e sua posição. Caso contrário,
    exibir a seguinte mensagem "Elemento não encontrado".
    */

    import java.util.Scanner;

    public class Exercicio5 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int[] vetorA={7,21,15,12,82};
            System.out.println("Insira um valor a ser pesquisado no vetor: ");
            int num= scan.nextInt();

            boolean existe= false;
            for (int i=0;i< vetorA.length;i++){
                if(vetorA[i]==num){
                    existe=true;
                    System.out.println("Elemento encontrado na posição "+i);
                    break;
                }
            }if(!existe){
                System.out.println("Elemento não encontrado!");
            }
        }
    }
