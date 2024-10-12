package src.recursividade;

public class recursivo {
    public static void main(String[] args) {
        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * 10);
        }

        System.out.println("vetor: ");
        for (int j : vetor) {
            System.out.println(j);
        }

        int soma = somar(0, 0, vetor);
        System.out.println(soma);
    }

    //Recusrsividade
    private static int somar (int soma, int posicao, int[] vetor) {
        if (posicao == vetor.length){
            return soma;
        }

        soma = soma + vetor[posicao];
        posicao++;
        return somar(soma, posicao, vetor);
    }
}
