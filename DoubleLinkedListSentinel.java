public class DoubleLinkedListSentinel {
    Node baseNode;
    private int size;

    public DoubleLinkedListSentinel() {
        baseNode = new Node("");
        baseNode.setNext(baseNode);
        baseNode.setPrev(baseNode);
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void add(String value) {
        Node newNode = new Node(value);
        newNode.setNext(null);
        newNode.setPrev(null);

        if (size == 0) {
            baseNode.setPrev(newNode);
            baseNode.setNext(newNode);
        }
        else {
            newNode.setPrev(baseNode.getPrev());
            baseNode.getPrev().setNext(newNode);
            baseNode.setPrev(newNode);
            newNode.setNext(baseNode);

        }

        size++;
    }

    public void remove(Node n) {
        if (size == 0) {
            System.out.println("error-list is empty");
        }
        else {
            if (baseNode.getNext() == n) {//first node being removed
                n.getNext().setPrev(baseNode);
                baseNode.setNext(n.getNext());
            }
            else if(baseNode.getPrev() == n) {//last node being removed
                n.getPrev().setNext(baseNode);
                baseNode.setPrev(n.getPrev());
            }
            else {
                n.getPrev().setNext(n.getNext());
                n.getNext().setPrev(n.getPrev());
            }

            size--;
        }
    }

    public void insert(Node n, String value) {
        Node newNode = new Node(value);
        newNode.setNext(n.getNext());
        newNode.setPrev(n);
        n.getNext().setPrev(newNode);
        n.setNext(newNode);

        size++;
    }

    public void append(DoubleLinkedListSentinel list) {
            this.baseNode.getPrev().setNext(list.baseNode.getNext());
            list.baseNode.getNext().setPrev(this.baseNode.getPrev());
            list.baseNode.getPrev().setNext(this.baseNode);
            this.baseNode.setPrev(list.baseNode.getPrev());

            this.size += list.size;
    }

    public void reverse() {
        Node current = baseNode.getNext();
        Node next = null;

        while(current != null) {
            next = current.getNext();
            current.setNext(current.getPrev());
            current = next;
        }
    }
}
