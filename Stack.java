public class Stack<S> {
    private LinkedList<S> linkedList;

    public Stack(){
        linkedList = new LinkedList<S>();

    }


    //push adds to the top of the stack
    public void push(S value){
        linkedList.addFirst(value);

    }

    //pop will remove whatever is on top
    public void pop(){
    linkedList.removeFirst();
    }
}
