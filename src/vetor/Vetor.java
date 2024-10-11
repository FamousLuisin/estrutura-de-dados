package src.vetor;

public class Vetor {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        vetor[0] = 3;
        vetor[1] = 4;
        vetor[2] = 8;
        vetor[3] = 13;
        vetor[5] = 51;
        vetor[4] = 22;
        vetor[6] = 33;

        for (int i = 0; i < vetor.length; i++){
            System.out.println("valor " + i + ": " + vetor[i]);
        }
    }
}
