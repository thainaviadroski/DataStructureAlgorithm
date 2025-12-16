package Vetor.exercicios;

import Vetor.Lista;

public class Exercicio1 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(5);

        lista.addElement("Java");
        lista.addElement("JavaScript");
        lista.addElement("Python");
        lista.addElement("Ruby");
        lista.addElement("PHP");

        if(lista.contians("Java")){
            System.out.println("Achei");
        }else{
            System.out.printf("Não achei");
        }


    }
}
