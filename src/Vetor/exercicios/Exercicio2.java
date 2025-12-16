package Vetor.exercicios;

import Vetor.Lista;

public class Exercicio2 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(10);

        lista.addElement("Java");
        lista.addElement("JavaScript");
        lista.addElement("Python");
        lista.addElement("Ruby");
        lista.addElement("Java");
        lista.addElement("PHP");
        lista.addElement("Java");
        lista.addElement("PHP");
        lista.addElement("PHP");
        lista.addElement("PHP");

        int p = lista.ultimoIndece("Ruby");
        System.out.println(p);
    }
}
