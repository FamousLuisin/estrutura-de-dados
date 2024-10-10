package src;

public class ProgramaEstados {
    public static void main(String[] args) {

        ListaLigada<String> lista = new ListaLigada<>();
        lista.adicionar("AC");
        lista.adicionar("BA");
        lista.adicionar("CE");
        lista.adicionar("DF");

        for (int i = 0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }

        System.out.println();

        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
        System.out.println("Ultimo: " + lista.getUltimo().getValor());

        System.out.println();

        lista.remover("AC");
        lista.remover("BA");
        lista.remover("CE");
        lista.remover("DF");

        lista.adicionar("AC");

        for (int i = 0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }
    }
}
