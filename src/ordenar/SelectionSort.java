package src.ordenar;

public class SelectionSort {
    public static void main(String[] args) {
        int[] vetor = new int[100_000];

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * 1000);
        }

        //Selection Sort 5°
        int aux, menor;
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < vetor.length; i++){
            menor = i;
            for (int j = i + 1; j < vetor.length; j++){
                if (vetor[j] < vetor[menor]){
                    menor = j;
                }
            }
            aux = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = aux;
        }
        long fim = System.currentTimeMillis();

        System.out.println("Tempo Selection Sort: " + (fim - inicio));
    }
}
