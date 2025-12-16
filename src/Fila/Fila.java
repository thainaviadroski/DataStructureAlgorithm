package Fila;

import Base.EstruturasEstaticas;

public class Fila<T> extends EstruturasEstaticas<T> {

    public Fila() {
        super();
    }

    public Fila(Integer size) {
        super(size);
    }

    public void addFila(T element) {
        this.elements[this.size] = element;
        this.add(element);
    }

    public T peek() {
        final int position = 0;
        if (this.isEmpty()) {
            return null;
        }
        return this.elements[position];
    }

    public T remove() {
        final int position = 0;
        if (this.isEmpty()) {
            return null;
        }
        T removed = this.elements[position];
        this.remove(position);
        return removed;
    }
}
