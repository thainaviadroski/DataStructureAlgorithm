package ListaEncadeada;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;

    private int tamanho = 0;


    public void add(T elemento) {
        No<T> celula = new No<>(elemento);
        if (this.tamanho == 0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho++;
    }

    public void limpar() {

        for (No<T> atual = this.inicio; atual != null; ) {
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }

        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;

    }

    private No<T> buscaPorPosicao(int posicao) {
        if (!(posicao > 0 && posicao <= this.tamanho)) {
            throw new IllegalArgumentException("Posicao não existe");
        }

        No<T> noAtual = this.inicio;

        for (int i = 0; i < posicao; i++) {
            noAtual = noAtual.getProximo();
        }

        return noAtual;
    }

    public T buscar(int posicao) {
        return this.buscaPorPosicao(posicao).getElemento();
    }

    public int buscaPosicao(T elemento) {
        No<T> atual = this.inicio;
        int posicao = 0;
        while (atual.getProximo() != null) {
            if (atual.getElemento().equals(elemento)) {
                return posicao;
            }
            posicao++;
            atual = atual.getProximo();
        }
        return -1;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        if (this.tamanho == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");

        No<T> atual = this.inicio;

        for (int i = 0; i < this.tamanho - 1; i++) {
            atual = atual.getProximo();
            builder.append(atual.getElemento()).append(",");
        }
        builder.append(atual.getElemento()).append("]");

//        while (atual.getProximo() != null) {
//            atual = atual.getProximo();
//            builder.append(atual.getElemento()).append(",");
//        }
        return builder.toString();
    }
}
