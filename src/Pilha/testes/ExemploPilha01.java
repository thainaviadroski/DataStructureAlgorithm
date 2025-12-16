package Pilha.testes;

import Pilha.Pilha;

public class ExemploPilha01 {

    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        pilha.stack(1);
        pilha.stack(4);
        pilha.stack(0);

        System.out.println(pilha.toString());

        Pilha<Integer> pilha2 = new Pilha<Integer>();

        System.out.println(pilha2.isEmpty());
        pilha2.stack(34534534);
        System.out.println(pilha2.isEmpty());
    }
}
