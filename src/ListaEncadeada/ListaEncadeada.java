package ListaEncadeada;

public class ListaEncadeada<T> {

    private No<T> inicio;

    private int tamanho = 0;


    public void add(T elemento) {
        No<T> celula = new No<>(elemento);
        this.inicio = celula;
        this.tamanho++;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return "ListaEncadeada{" +
                "inicio=" + inicio +
                '}';
    }
}
