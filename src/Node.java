class Node {
    Node next;

    Object data;

    //Line 8 creates a new node that does not connect to other nodes

    public Node(Object dataValue){
        next = null;
        data = dataValue;
    }

    //line 15 creates a node that is connected to next nodes

    public Node(Object dataValue, Node nextValue){
        next = nextValue;
        data = dataValue;
    }

    public Object getData(){
        return data;
    }

    public void setData(Object dataValue){
        data = dataValue;
    }
    //Returns the node that comes after this node
    public Node getNext(){
        return next;
    }
    //Changes the next data to the specified data
    public void setNext(Node nextValue){
        next = nextValue;
    }

}
