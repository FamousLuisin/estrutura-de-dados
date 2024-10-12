package src.ordenar;

public class MergeSort {
    public static void main(String[] args) {
        int[] vetor = new int[1_000_000];
        int[] newVetor = new int[vetor.length];

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * 1000);
        }

        long inicio = System.currentTimeMillis();
        merge(vetor, newVetor, 0, vetor.length - 1);
        long fim = System.currentTimeMillis();

        System.out.println("Tempo Merge Sort: " + (fim - inicio));

    }

    private static void merge(int[] v, int[] w, int inicio, int fim){
        if (inicio < fim){
            int meio = (inicio + fim) / 2;
            merge(v, w, inicio, meio);
            merge(v, w, meio + 1, fim);
            intercalar(v, w, inicio, meio, fim);
        }
    }

    private static void intercalar(int[] v, int[] w, int inicio, int meio, int fim) {
        for (int k = inicio; k <= fim; k++){
            w[k] = v[k];
        }

        int i = inicio;
        int f = meio + 1;

        for(int k = inicio; k <= fim; k++){
            if (i > meio){
                v[k] = w[f++];
            } else if (f > fim){
                v[k] = w[i++];
            } else if (w[i] < w[f]){
                v[k] = w[i++];
            } else {
                v[k] = w[f++];
            }
        }
    }
}
