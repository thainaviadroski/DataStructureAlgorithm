package Pilha;

import Base.EstruturasEstaticas;

public class Pilha<T> extends EstruturasEstaticas {


    public Pilha() {
        super();
    }

    public Pilha(int lenght) {
        super(lenght);
    }

    public void stack(T element) {
        super.add(element);
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return (T) this.elements[size - 1];
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T element = (T) this.elements[size - 1];
        size--;

        return element;
    }

}
