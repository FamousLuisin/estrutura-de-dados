package src.buscas;

import java.util.Scanner;

public class BuscaLinear {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[100];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * 100);
        }

        System.out.println("Qual número vc busca?");
        int buscado = leitor.nextInt();

        boolean encontrou = false;
        for(int i = 0; i < vetor.length; i++){
            if (vetor[i] == buscado){
                encontrou = true;
                break;
            }
        }

        if (encontrou){
            System.out.println("Achou");
        }else{
            System.out.println("Não achou");
        }
    }
}
