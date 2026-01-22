class Node {
    int data;
    Node next;
    //Constructors
    public Node (int dataValue) {
        data = dataValue;
        next = null;
    }
    public Node(int  dataValue, Node nextValue) {
        next = nextValue;
        data = dataValue;
    }
    public int getData() {
        return data;
    }
    public void setData(int  dataValue) {
        data = dataValue;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node nextValue) {
        next = nextValue;
    }
}
