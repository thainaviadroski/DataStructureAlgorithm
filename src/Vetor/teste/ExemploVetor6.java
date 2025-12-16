package Vetor.teste;

import Vetor.Vetor;

public class ExemploVetor6 {
    public static void main(String[] args) {
        Vetor v = new Vetor(10);

        v.addElement("B");
        v.addElement("C");
        v.addElement("E");
        v.addElement("F");

        System.out.println(v.toString());

        v.addOrderArray(0,"A");

        System.out.println(v.toString());

        v.addOrderArray(3,"D");

        System.out.println(v.toString());

    }
}
