package Pilha.testes;

import java.util.Stack;

public class ExemploStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Gessica");
        stack.push("Sara");
        stack.push("Aline");

        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
    }
}
