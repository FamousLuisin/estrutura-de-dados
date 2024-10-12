package src.ordenar;

public class BubbleSort {
    public static void main(String[] args) {
        int[] vetor = new int[100_000];

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * 1000);
        }

        //Bubble Sort 6°
        int aux;
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < vetor.length; i++){
            for (int j = i + 1; j < vetor.length; j++){
                if (vetor[i] > vetor[j]){
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }
        long fim = System.currentTimeMillis();

        System.out.println("Tempo Bubble Sort: " + (fim - inicio));
    }
}
