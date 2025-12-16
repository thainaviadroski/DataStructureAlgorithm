package Pilha.testes;

import java.util.Stack;

public class ExemploStackJava {
    public static void main(String[] args) {
        Stack<String>  stack = new Stack<>();

        stack.push("Aline");
        stack.push("Gessica");
        stack.push("Sara");

        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());

    }
}
