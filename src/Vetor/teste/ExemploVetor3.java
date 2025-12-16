package Vetor.teste;

import Vetor.Vetor;

public class ExemploVetor3 {

    public static void main(String[] args) {
        Vetor v = new Vetor(10);

        v.addElement("Elemento 1");
        v.addElement("Elemento 2");
        v.addElement("Elemento 3");

        System.out.println(v.sizeArray());

        System.out.println(v.toString());

    }
}
