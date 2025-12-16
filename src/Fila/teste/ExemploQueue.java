package Fila.teste;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(90);
        queue.add(1);
        queue.add(2);
        queue.add(45);


        System.out.println("Fila:" + queue);
        System.out.println("Primeiro elemento:" + queue.peek());
        Integer removed = queue.remove();
        System.out.println("Primeiro elemento foi removido: " + removed);



    }
}
