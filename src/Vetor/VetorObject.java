package Vetor;

public class VetorObject {


    private Object[] elements;
    private int size;

    public VetorObject(int lenght) {
        this.elements = new Object[lenght];
        this.size = 0;
    }

    public boolean addElement(Object element) {
        addWidthArray();
        if (this.size < this.elements.length) {
            this.elements[this.size] = element;
            this.size++;
            return true;
        }
        return false;
    }

    public int sizeArray() {
        return this.size;
    }

    public Object searchByPosition(int position) {
        if (!(position >= 0 && position < size)) {
            throw new IllegalArgumentException("Position invalid");
        }
        return this.elements[position];
    }

    public int searchByElementExists(Object element) {
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }


    public boolean addOrderArray(int position, String element) {
        addWidthArray();
        if (!(position >= 0 && position < size)) {
            throw new IllegalArgumentException("Position invalid");
        }
        for (int i = this.size - 1; i >= position; i--) {
            this.elements[i + 1] = this.elements[i];
        }
        this.elements[position] = element;
        this.size++;
        return false;
    }


    private void addWidthArray() {
        if (this.size == this.elements.length) {
            Object[] newElements = new String[this.elements.length * 2];
            for (int i = 0; i < this.size; i++) {
                newElements[i] = this.elements[i];
            }
            this.elements = newElements;
        }
    }

    public void removeElementByPosition(int position) {
        if (!(position >= 0 && position < size)) {
            throw new IllegalArgumentException("Position invalid");
        }

        for (int i = position; i < this.size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.size--;
    }

    public void removeElement(String element) {
        int position = searchByElementExists(element);
        if (position != -1) {
            for (int i = position; i < this.size - 1; i++) {
                this.elements[i] = this.elements[i + 1];
            }
            this.size--;
        }
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
