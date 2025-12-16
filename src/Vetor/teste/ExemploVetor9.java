package Vetor.teste;

import Vetor.Vetor;

public class ExemploVetor9 {
    public static void main(String[] args) {
        Vetor v = new Vetor(3);

        v.addElement("B");
        v.addElement("C");
        v.addElement("E");
        v.addElement("F");

        System.out.println(v.toString());
        v.removeElement("C");
        System.out.println(v.toString());
    }
}
