package src;

public class IteratorListaLigada<T> {
    private Elemento<T> elemento;

    public IteratorListaLigada(Elemento<T> elemento){
        this.elemento = elemento;
    }

    public boolean temProximo(){
        return elemento.getProximo() != null;
    }

    public Elemento<T> getProximo(){
        return this.elemento = elemento.getProximo();
    }

    public Elemento<T> getElemento() {
        return elemento;
    }

    public void setElemento(Elemento<T> elemento) {
        this.elemento = elemento;
    }
}
