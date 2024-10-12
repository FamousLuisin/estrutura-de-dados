package src.ordenar;

public class InsertionSort {
    public static void main(String[] args) {
        int[] vetor = new int[100_000];

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * 1000);
        }

        //Insertion Sort 4°
        int chave;
        long inicio = System.currentTimeMillis();
        for (int i = 1; i < vetor.length; i++){
            chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave){
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
        long fim = System.currentTimeMillis();

        System.out.println("Tempo Insertion Sort: " + (fim - inicio));
    }
}
