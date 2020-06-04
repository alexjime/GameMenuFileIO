class Node<T> {
    T data = null;
    Node<T> next = null;
    Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
}