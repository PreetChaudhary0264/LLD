import java.util.Iterator;
import java.util.Stack;

public class StackEX {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Iterator it = stack.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
