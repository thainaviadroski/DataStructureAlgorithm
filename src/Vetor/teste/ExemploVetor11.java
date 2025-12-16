package Vetor.teste;

import Vetor.Lista;

import java.util.ArrayList;

public class ExemploVetor11 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("a");
        arrayList.add("c");
        arrayList.add("t");
        arrayList.add(2, "s");
        System.out.println(arrayList.toString());

        // Verifica se o elemento existe no arrya e retorna true ou false
        boolean isExists = arrayList.contains("s");
        if (isExists) {
            System.out.println("Elemento existe no array");
        }


        // Verifisa se o elmento existe no array e retorna sua posisção
        int position = arrayList.indexOf("s");
        System.out.println(position);

        // Busca elemento pela posição no array
        System.out.println(arrayList.get(2));
    }
}
