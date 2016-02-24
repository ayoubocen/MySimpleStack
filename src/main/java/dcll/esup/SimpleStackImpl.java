package dcll.esup;

/**
 * Created by 21508830 on 24/02/2016.
 */
public class SimpleStackImpl implements SimpleStack{
    public Stack<Object> wrappedStack = new Stack<Object>;
    public boolean isEmpty(){
        return wrappedStack.isEmpty();
    }

    public int getSize(){
        return wrappedStack.size();
    }

    public void push(Item item){
        wrappedStack.push(item);
    }

    public Item peek() throws EmptyStackException{
        return (Item) wrappedStack.peek();
    }

    public Item pop() throws EmptyStackException{
        return (Item) wrappedStack.pop();
    }
}
