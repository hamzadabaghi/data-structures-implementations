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

    public void addFirst(T element) {
        var newNode = new Node<>(element, null);
        if (this.first == null && this.last == null) {
            this.first = this.last = newNode;
        } else {
            newNode.setNext(this.first);
            this.first = newNode;
        }
    }

    public void addLast(T element) {
        var newNode = new Node<>(element, null);
        if (this.first == null && this.last == null) {
            this.first = this.last = newNode;
        } else {
            this.last.setNext(newNode);
            this.last = newNode;
        }
    }

    @SuppressWarnings({"ConstantConditions"})
    public void deleteFirst() {
        if (this.first != null && this.last != null) {
            this.first = this.first.getNext();
            if (this.first == null) {
                this.last = null;
            }
        }
    }

    public void deleteLast() {
        if (this.first != null && this.last != null) {
            var temp = this.first;
            if (this.first == this.last) {
                this.first = this.last = null;
            } else {
                while (temp.getNext().getNext() != null) {
                    temp = temp.getNext();
                }
                this.last = temp;
                this.last.setNext(null);
            }
        }
    }

    public boolean contains(T element) {
        var temp = this.first;
        while (temp != null) {
            if (temp.getValue().equals(element)) {
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    public int indexOf(T element) {
        var temp = this.first;
        int i = 0;
        while (temp != null) {
            if (temp.getValue().equals(element)) {
                return i;
            }
            temp = temp.getNext();
            i++;
        }
        return -1;
    }

    public int size() {
        var temp = this.first;
        int i = 0;
        while (temp != null) {
            i++;
            temp = temp.getNext();
        }
        return i;
    }

    @Override
    public String toString() {
        var output = new StringBuilder("[ ");
        var temp = this.first;
        while (temp != null) {
            output.append(temp.getValue());
            temp = temp.getNext();
            if (temp != null) {
                output.append(", ");
            }
        }
        return output.append(" ]").toString();
    }


}
