package assignment5_2;

public class Node<E> {
    protected E value;
    protected Node<E> next;

    public Node(E value, Node<E> next){
        this.value = value;
        this.next = next;
    }

    public Node(E value){
        this(value, null);
    }

    public E getValue(){
        return value;
    }

    public void setNext(Node<E> next){
        this.next = next;
    }

    public Node<E> getNext(){
        return next;
    }

    public void setValue(E value){
        this.value = value;
    }
}   
