package Vetor.teste;

import Vetor.Vetor;

public class ExemploVetor7 {

    public static void main(String[] args) {
        Vetor v = new Vetor(3);

        v.addElement("B");
        v.addElement("C");
        v.addElement("E");
        v.addElement("F");

        System.out.println(v.toString());

    }
}
