package ListaEncadeada.teste;

import ListaEncadeada.ListaEncadeada;

public class TesteListaEncadeada {

    public static void main(String[] args) {
        ListaEncadeada<Integer> list = new ListaEncadeada<Integer>();
        list.add(1);

        System.out.println(list);
        System.out.println("Tamanho: " + list.getTamanho());
    }
}
