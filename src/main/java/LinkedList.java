/**
 * Generic version of the LinkedList class.
 * @param <U> the type of the value being boxed
 */
class LinkedList<U> {
    private Node<U> head = null;
    private Node<U> tail = null;
    private int size;

    LinkedList() {
        this.head = new Node<U>(null,null);
        this.tail = this.head;
        size = 0;
    }

    public void add(U node) {
        tail.next = new Node<U>(node,null);
        this.tail = tail.next;
        size++;
    }

    public int getSize() {
        return size;
    }
}