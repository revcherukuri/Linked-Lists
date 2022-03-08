public class MyList {
    Node head;
    Node tail;
    private int size;

    public int getSize() {
        return size;
    }

    public void add(String value) {
        Node n = new Node(value);
        n.setNext(null);

        if (head == null) {
            head = n;
            tail = n;
        }
        else {
            tail.setNext(n);
            tail = n;
        }
        size++;
    }

    public void addInt(Integer value) {
        Node n = new Node(value);
        n.setNext(null);

        if (head == null) {
            head = n;
            tail = n;
        }
        else {
            tail.setNext(n);
            tail = n;
        }
        size++;
    }

    public void push(String value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        }
        else {
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }

    public Node pop() {
        Node temp = head;
        if (head == null) {
            System.out.println("error-list is empty");
        }
        else {
            head = head.getNext();
        }
        size--;
        return temp;
    }
    public void insert(Node n, String value) {
        if (n == null) {
            System.out.println("error");
            return;
        }
        else {
            Node newNode = new Node(value);
            newNode.setNext(n.getNext());
            n.setNext(newNode);
        }
        size++;
    }

    public void addWithoutTail(String value) {
        Node newNode = new Node(value);
        Node tempNode = head;
        if (head == null) {
            head = newNode;
        }
        else {
            while(tempNode.getNext() != null) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(newNode);
        }
        size++;
    }

    public void remove(Node n) {
        Node tempNode = head;
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        else {
            while(tempNode.getNext() != n) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(n.getNext());

        }
        size--;
    }

    public void reverse() {
        Node current = this.head;
        Node next = null;
        Node prev = null;

        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        Node temp = this.head;
        this.head = this.tail;
        this.tail = temp;
    }

    public void append(MyList list) {
        this.tail.setNext(list.head);
        this.tail = list.tail;
//        list.head.setPrev(this.tail);
        this.size += list.size;
    }

    public void sort() {
        Node current = head, index = null;

        int temp;

        if (head == null) {
            return;
        }
        else {
            while (current != null) {
                // Node index will point to node next to
                // current
                index = current.getNext();

                while (index != null) {
                    // If current node's data is greater
                    // than index's node data, swap the data
                    // between them
                    if (current.getNumData() > index.getNumData()) {
                        temp = current.getNumData();
                        current.num = index.num;
                        index.num = temp;
                    }

                    index = index.getNext();
                }
                current = current.getNext();
            }
        }
    }



}
