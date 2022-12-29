package basics.programming.linkedlists;

public class LinkedList<T> {

    private Node<T> first;
    private Node<T> last;

    public LinkedList() {
    }

    public LinkedList(Node<T> first, Node<T> last) {
        this.first = first;
        this.last = last;
    }

    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setLast(Node<T> last) {
        this.last = last;
    }

    // addFirst
    public void addFirst(T element) {
        Node<T> newNode = new Node<>(element, null);
        if (this.first == null && this.last == null) {
            this.first = this.last = newNode;
        } else {
            newNode.setNext(this.first);
            this.first = newNode;
        }
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("[ ");
        Node<T> temp = this.first;
        while (temp != null) {
            output.append(temp.getValue());
            temp = temp.getNext();
            if (temp != null) {
                output.append(", ");
            }
        }
        return output.append(" ]").toString();
    }

    // addLast
    // deleteFirst
    // deleteLast
    // contains
    // indexOf
}
