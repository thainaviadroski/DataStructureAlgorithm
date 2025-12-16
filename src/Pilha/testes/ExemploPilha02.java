package Pilha.testes;

import Pilha.Pilha;

import java.util.AbstractQueue;
import java.util.Queue;

public class ExemploPilha02 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        pilha.stack(1);
        pilha.stack(9);
        pilha.stack(2);
        pilha.stack(4);
        pilha.stack(6);

        System.out.println(pilha.peek());


        System.out.println("Pilha tamanho original: " + pilha.size());
        Integer num = pilha.pop();
        System.out.println("Saiu da pilha: " + num);
        System.out.println("Perdeu um elemento: " + pilha.size());

    }
}
