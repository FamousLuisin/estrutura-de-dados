package src.ordenar;

public class QuickSort {
    public static void main(String[] args) {
        int[] vetor = new int[1_000_000];

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * 1000);
        }

        long inicio = System.currentTimeMillis();
        quick(vetor, 0, vetor.length - 1);
        long fim = System.currentTimeMillis();

        System.out.println("Tempo Quick Sort: " + (fim - inicio));
    }

    static void quick(int[] vetor, int esquerda, int direita){
        if(esquerda < direita){
            int p = particao(vetor, esquerda, direita);
            quick(vetor, esquerda, p);
            quick(vetor, p + 1, direita);
        }
    }

    static int particao(int[] vetor, int esquerda, int direita){
        int meio = (int) (esquerda + direita) / 2;
        int pivot = vetor[meio];
        int i = esquerda - 1;
        int j = direita + 1;

        while (true){
            do {
                i++;
            }while (vetor[i] < pivot);
            do {
                j--;
            }while (vetor[j] > pivot);
            if (i >= j){
                return j;
            }
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
    }
}
