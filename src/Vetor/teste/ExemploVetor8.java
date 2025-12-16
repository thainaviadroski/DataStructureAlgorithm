package Vetor.teste;

import Vetor.Vetor;

public class ExemploVetor8 {

    public static void main(String[] args) {
        Vetor v = new Vetor(3);

        v.addElement("B");
        v.addElement("C");
        v.addElement("E");
        v.addElement("F");

        System.out.println(v.toString());

        v.removeElementByPosition(2);
        System.out.println(v.toString());
    }
}

