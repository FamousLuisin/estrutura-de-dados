package src;

public class ProgramaInteiros {

    public static void main(String[] args) {
        ListaLigada<Integer> numeros = new ListaLigada<>();

        numeros.adicionar(10);
        numeros.adicionar(20);
        numeros.adicionar(30);
        numeros.adicionar(40);
        numeros.adicionar(50);

        for (int i = 0; i < numeros.getTamanho(); i++){
            System.out.println(numeros.get(i).getValor());
        }
    }
}
