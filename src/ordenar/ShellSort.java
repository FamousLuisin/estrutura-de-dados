package src.ordenar;

public class ShellSort {
    public static void main(String[] args) {
        int[] vetor = new int[1_000_000];

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * 1000);
        }

        //Shell Sort
        int n = vetor.length;
        int h = n / 2;
        int chave, j;

        long inicio = System.currentTimeMillis();
        while (h > 0){
            for (int i = h; i < vetor.length; i++){
                chave = vetor[i];
                j = i;

                while (j >= h && vetor[j - h] > chave){
                    vetor[j] = vetor[j - h];
                    j = j - h;
                }
                vetor[j] = chave;
            }
            h = h / 2;
        }
        long fim = System.currentTimeMillis();

        System.out.println("Tempo Shell Sort: " + (fim - inicio));
    }
}
