package src;

import java.util.ArrayList;
import java.util.LinkedList;

public class Comparacao {

    public static void main(String[] args) {
        ListaLigada<Integer> lista = new ListaLigada<>();
        ArrayList<Integer> vetor = new ArrayList<>();

        //Adicionar elementos
        System.out.println("=====Adicionar=====");
        int limite = 1_000_000;

        long inicio = System.currentTimeMillis();
        for (int i=0; i < limite; i++){
            vetor.add(i);
        }
        long fim = System.currentTimeMillis();

        System.out.println("Adicionar no vetor: " + (fim - inicio));

        inicio = System.currentTimeMillis();
        for (int i=0; i < limite; i++){
            lista.adicionar(i);
        }
        fim = System.currentTimeMillis();

        System.out.println("Adicionar na lista: " + (fim - inicio));


        System.out.println("\n=====ler=====");

        inicio = System.currentTimeMillis();
        for (int i=0; i < vetor.size(); i++){
            vetor.get(i);
        }
        fim = System.currentTimeMillis();

        System.out.println("Ler no vetor: " + (fim - inicio));

        IteratorListaLigada<Integer> iteratorLista = lista.getIterator();
        inicio = System.currentTimeMillis();
        while (iteratorLista.temProximo()){
            iteratorLista.getProximo();
        }
        fim = System.currentTimeMillis();

        System.out.println("Ler na lista: " + (fim - inicio));
    }
}
