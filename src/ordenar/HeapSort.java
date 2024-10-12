package src.ordenar;

public class HeapSort {
    public static void main(String[] args) {
        int[] vetor = new int[1_000_000];

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * 1000);
        }

        //Heap Sort
        long inicio = System.currentTimeMillis();
        int n = vetor.length;

        for(int i = n / 2; i >= 0; i--){
            heap(vetor, n, i);
        }

        for (int j = n - 1; j >= 0; j--){
            int aux = vetor[0];
            vetor[0] = vetor[j];
            vetor[j] = aux;

            heap(vetor, j, 0);
        }

        long fim = System.currentTimeMillis();

        System.out.println("Tempo Heap Sort: " + (fim - inicio));

    }

    private static void heap(int[] vetor, int n, int i){
        int raiz = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        if (esquerda < n && vetor[esquerda] > vetor[raiz]){
            raiz = esquerda;
        }

        if (direita < n && vetor[direita] > vetor[raiz]){
            raiz = direita;
        }

        if (raiz != i){
            int aux = vetor[i];
            vetor[i] = vetor[raiz];
            vetor[raiz] = aux;

            heap(vetor, n, raiz);
        }
    }
}
