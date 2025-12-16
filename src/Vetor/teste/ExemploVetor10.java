package Vetor.teste;

import Vetor.Contato;
import Vetor.VetorObject;

public class ExemploVetor10 {
    public static void main(String[] args) {

        VetorObject o = new VetorObject(3);

        Contato c1 = new Contato("Contato 1", "contato1@email.com", "1234-5678");
        Contato c2 = new Contato("Contato 2", "contato2@email.com", "1234-5679");
        Contato c3 = new Contato("Contato 3", "contato3@email.com", "1234-5670");

        o.addElement(c1);
        o.addElement(c2);
        o.addElement(c3);

        System.out.println(o);
    }
}
