import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {
    private Node<T> head;
    private Node<T> tail;

    public void add(T data) {
        Node<T> node = new Node<T>(data);
        if(head == null)
            tail = head = node;
        else {
            tail.setNext(node);
            tail = node;
        }
    }

    private class Node<T> {
        private T data;
        private Node<T> next;
        private Node<T> prev;

        public Node(T data) {
            this.data = data;
        }

        public void setPrev(Node<T> prev) {
            this.prev = prev;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public Node<T> getNext() {
            return next;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator<T>(head);
    }

    private class LinkedListIterator<T> implements Iterator<T> {
        private Node<T> current;

        public LinkedListIterator(Node<T> head) {
            current = head;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T result = current.getData();
            current = current.next;
            return result;
        }
    }
}
