public class PracticeList {
    private Node head;
    private int listCount;
    //line 5 creating the first node
    public PracticeList(){
        head = new Node(null);
        listCount = 0;
    }
    //line 10 puts another node at the end of the current list
    public void add(Object data){
        Node test = new Node(data);
        Node testCurr = head;

        while(testCurr.getNext() != null){
            testCurr = testCurr.getNext();
        }
        testCurr.setNext(test);
        listCount++;
    }
}

