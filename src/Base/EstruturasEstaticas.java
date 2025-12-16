package Base;

public class EstruturasEstaticas<T> {
    protected T[] elements;
    protected int size;

    public EstruturasEstaticas(int lenght) {
        this.elements = (T[]) new Object[lenght];
        this.size = 0;
    }

    public EstruturasEstaticas() {
        this(10);
    }

    protected boolean add(T element) {
        addWidthArray();
        if (this.size < this.elements.length) {
            this.elements[this.size] = element;
            this.size++;
            return true;
        }
        return false;
    }

    protected boolean add(int position, T element) {
        if (position < 0 || position > size) {
            throw new IllegalArgumentException("Posição inválida");
        }
        this.addWidthArray();

        for (int i = this.size - 1; i >= position; i--) {
            this.elements[i + 1] = this.elements[i];
        }
        this.elements[position] = element;
        this.size++;

        return true;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    protected void addWidthArray() {
        if (this.size == this.elements.length) {
            T[] newElements = (T[]) new Object[this.elements.length * 2];
            for (int i = 0; i < this.size; i++) {
                newElements[i] = this.elements[i];
            }
            this.elements = newElements;
        }
    }

    public void remove(int position) {
        if (!(position >= 0 && position < size)) {
            throw new IllegalArgumentException("Position invalid");
        }

        for (int i = position; i < this.size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.size--;
    }

    public int size() {
        return this.size;
    }


    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.size - 1; i++) {
            s.append(this.elements[i]);
            s.append(",");
        }

        if (this.size > 0) {
            s.append(this.elements[this.size - 1]);
        }
        s.append("]");
        return s.toString();
    }
}
