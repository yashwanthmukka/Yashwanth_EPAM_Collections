import java.util.Arrays;

public class DataList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int n = 0;
    private Object array[];

    public DataList() {
        array = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e) {
        if (n == array.length) {
            ensureCapacity();
        }
        array[n++] = e;
    }

    @SuppressWarnings("unchecked")
    public E get(int i) {
        if (i >= n || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) array[i];
    }

    @SuppressWarnings("unchecked")
    public E remove(int i) {
        if (i >= n || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        Object item = array[i];
        int numElts = array.length - (i + 1);
        System.arraycopy(array, i + 1, array, i, numElts);
        n--;
        return (E) item;
    }

    public int size() {
        return n;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < n; i++) {
            sb.append(array[i].toString());
            if (i < n - 1) {
                sb.append(",");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    private void ensureCapacity() {
        int newSize = array.length * 2;
        array = Arrays.copyOf(array, newSize);
    }
}