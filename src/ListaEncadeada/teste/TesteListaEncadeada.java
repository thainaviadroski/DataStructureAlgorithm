package ListaEncadeada.teste;

import ListaEncadeada.ListaEncadeada;

public class TesteListaEncadeada {

    public static void main(String[] args) {
        ListaEncadeada<Integer> list = new ListaEncadeada<Integer>();
        list.add(1);
        list.add(4);
        list.add(18);
        list.add(10);
        list.add(2025);

        System.out.println(list);
        System.out.println("Tamanho: " + list.getTamanho());

        list.limpar();
        System.out.println(list);
        System.out.println("Tamanho: " + list.getTamanho());
    }
}
