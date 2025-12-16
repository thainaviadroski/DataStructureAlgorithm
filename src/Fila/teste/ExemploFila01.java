package Fila.teste;

import Fila.Fila;

public class ExemploFila01 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<Integer>();
        fila.addFila(3);
        fila.addFila(5);
        fila.addFila(1);
        System.out.println(fila.toString());
        System.out.println(fila.peek());
        System.out.println(fila.remove());
        System.out.println(fila.toString());
    }
}
