public class Node{
    private String data;
    Integer num;
    private Node next;
    private Node prev;

    public Node(String data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public Node(Integer data) {
        this.num = data;
        this.next = null;
        this.prev = null;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public void setPrev(Node node) {
        this.prev = node;
    }

    public Node getNext() {
        return this.next;
    }

    public Node getPrev() {
        return this.prev;
    }

    public String getData() {
        return data;
    }

    public Integer getNumData() {
        return num;
    }
}
