package assignment5_2;

public class LinkedList<T> implements List<T>{
    protected Node<T> head;
    protected Node<T> tail;
    protected int size;

    /**
     * Linked list constructor
     */
    public LinkedList(){
        this.head = head;
        this.tail = tail;
        this.size = 0;
    }

    /**
     * retuns size
     */
    public int size() {
        return size;
    }

    /**
     * appends new value to list in parameter field
     * @Param T
     */
    public void append(T value) {
        Node<T> node = new Node<>(value);
        if (this.size == 0){
            head = node;
            tail = node;
        } else{
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    /**
     * Looks for index value by walking through list
     * @Param Index
     * @Return Value
     */
    public T get(int index) throws IndexOutOfBoundsException{
        Node<T> node = head;
        for(int i = 1; i<index; i++){
            node = node.getNext();
        }
        return node.getValue();
    }
    
    /**
     * takes index and new value and replaces old value at given index
     * @Param Index(Int), Value(T)
     */
    public void set(int index, T value) throws IndexOutOfBoundsException {
        Node<T> node = head;
        for(int i = 1; i<index; i++){
            node = node.getNext();
        }
        node.setValue(value);
    }
}
