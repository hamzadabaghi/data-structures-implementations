package basics.programming.linkedlists;

public class LinkedList<T> {

    private class Node<Q> {

        public Q value;
        public Node<Q> next;

        public Node(Q value) {
            this.value = value;
        }

    }

    private Node<T> first;
    private Node<T> last;

    public LinkedList() {
    }

    public void addFirst(T element) {
        var newNode = this.newNode(element);
        if (isEmpty()) {
            this.first = this.last = newNode;
        } else {
            newNode.next = this.first;
            this.first = newNode;
        }
    }

    public void addLast(T element) {
        var newNode = this.newNode(element);
        if (isEmpty()) {
            this.first = this.last = newNode;
        } else {
            this.last.next = newNode;
            this.last = newNode;
        }
    }

    @SuppressWarnings({"ConstantConditions"})
    public void deleteFirst() {
        if (isEmpty()) {
            this.first = this.first.next;
            if (this.first == null) {
                this.last = null;
            }
        }
    }

    public void deleteLast() {
        if (!isEmpty()) {
            var current = this.first;
            if (this.first == this.last) {
                this.first = this.last = null;
            } else {
                while (current.next.next != null) {
                    current = current.next;
                }
                this.last = current;
                this.last.next = null;
            }
        }
    }

    public boolean contains(T element) {
        var current = this.first;
        while (current != null) {
            if (current.value.equals(element)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int indexOf(T element) {
        var current = this.first;
        int i = 0;
        while (current != null) {
            if (current.value.equals(element)) {
                return i;
            }
            current = current.next;
            i++;
        }
        return -1;
    }

    public int size() {
        var current = this.first;
        int i = 0;
        while (current != null) {
            i++;
            current = current.next;
        }
        return i;
    }

    private boolean isEmpty() {
        return this.first == null;
    }

    private Node<T> newNode(T element) {
        return new Node<T>(element);
    }

    @Override
    @SuppressWarnings({"ConstantConditions"})
    public String toString() {
        var output = new StringBuilder("[ ");
        var current = this.first;
        while (current != null) {
            output.append(current.value);
            current = current.next;
            if (current != null) {
                output.append(", ");
            }
        }
        return output.append(" ]").toString();
    }


}
