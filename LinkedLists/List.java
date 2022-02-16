package assignment5_2;

public interface List<E> {
    void append(E value);
    E get(int index);
    void set(int index, E value);
    int size();
}
