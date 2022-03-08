public class DoubleLinkedList {
    Node head;
    Node tail;
    private int size;

    public int getSize() {
        return size;
    }

    public void add(String value) {
        Node newNode = new Node(value);
        newNode.setNext(null);
        newNode.setPrev(null);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }

        else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
        size++;
    }

    public void push(String value) {
        Node newNode = new Node(value);
        newNode.setNext(null);
        newNode.setPrev(null);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
        size++;
    }

    public void insert(Node n, String value) {
        Node newNode = new Node(value);
        newNode.setNext(null);
        newNode.setPrev(null);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.setNext(n.getNext());
            n.getNext().setPrev(newNode);
            n.setNext(newNode);
            newNode.setPrev(n);
        }
        size++;
    }

    public void remove(Node n) {
        if (head == null) {
            System.out.println("error-list is empty");
        }
        else {
            n.getPrev().setNext(n.getNext());
            n.getNext().setPrev(n.getPrev());
            size--;
        }

    }

    public void reverse() {
        Node current = this.head;
        Node next = null;

        while(current != null) {
            next = current.getNext();
            current.setNext(current.getPrev());
            current = next;
        }
        Node temp = this.head;
        this.head = this.tail;
        this.tail = temp;
    }

    public void append(DoubleLinkedList list) {
        this.tail.setNext(list.head);
        list.head.setPrev(this.tail);
        this.tail = list.tail;
        this.size += list.size;
    }

}
