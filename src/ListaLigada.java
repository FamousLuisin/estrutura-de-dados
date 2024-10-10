package src;

public class ListaLigada<T> {
    private Elemento<T> primeiro;
    private Elemento<T> ultimo;
    private int tamanho;

    ListaLigada(){
        this.tamanho = 0;
    }

    public void adicionar(T novaValor){
        Elemento<T> novoElemento = new Elemento<>(novaValor);

        if(this.primeiro == null && this.ultimo == null){
            this.primeiro = novoElemento;
        }else{
            this.ultimo.setProximo(novoElemento);
        }
        this.ultimo = novoElemento;
        this.tamanho++;
    }

    public void remover(T valorProcurado){
        Elemento<T> atual = this.primeiro;
        Elemento<T> anterior = null;

        for (int i = 0; i < this.getTamanho(); i++){
            if (atual.getValor().equals(valorProcurado)){
                if (this.tamanho == 1){
                    this.primeiro = null;
                    this.ultimo = null;
                }else if (atual == this.primeiro){
                    this.primeiro = atual.getProximo();
                }else if (atual == this.ultimo){
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                }else {
                    if (anterior != null) {
                        anterior.setProximo(atual.getProximo());
                    }
                }
                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }

    public Elemento<T> get(int posicao){
        Elemento<T> atual = this.primeiro;

        for (int i = 0; i < posicao; i++){
            if (atual.getProximo() != null){
                atual = atual.getProximo();
            }
        }

        return atual;
    }

    public IteratorListaLigada<T> getIterator(){
        return new IteratorListaLigada<>(this.primeiro);
    }

    public Elemento<T> getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Elemento<T> primeiro) {
        this.primeiro = primeiro;
    }

    public Elemento<T> getUltimo() {
        return ultimo;
    }

    public void setUltimo(Elemento<T> ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
