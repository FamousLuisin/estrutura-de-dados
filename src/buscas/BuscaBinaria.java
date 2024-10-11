package src.buscas;

import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[1_000_000];

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = i * 2;
        }

        System.out.println("Qual numero vc busca? ");
        int buscado = leitor.nextInt();

        int contador = 0;
        boolean encontrou = false;
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;

        while (inicio <= fim && !encontrou){
            meio = (int) ((inicio + fim) / 2);
            if (vetor[meio] == buscado){
                encontrou = true;
            } else if (vetor[meio] < buscado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
            contador++;
        }

        if (encontrou){
            System.out.println("Achou - Tentativas: " + contador);
        }else {
            System.out.println("Não achou - Tentativas: " + contador);
        }
    }
}
