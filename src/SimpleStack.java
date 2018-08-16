import java.util.Stack;

public class SimpleStack
{
    public static void main(String[] args)
    {
        SimpleStack mystack = new SimpleStack();
        mystack.run();
    }

    private void run()
    {
        Stack <String> simpleStack = new Stack<>();

        simpleStack.push("One");
        simpleStack.push("Two");
        simpleStack.push("Three");
        simpleStack.push("Four");
        simpleStack.push("Five");

        System.out.println(simpleStack);
        System.out.println(simpleStack.peek());
        System.out.println(simpleStack);
        System.out.println(simpleStack.pop());
        System.out.println(simpleStack);
        System.out.println(simpleStack.pop());
        System.out.println(simpleStack);
        System.out.println(simpleStack.pop());
        System.out.println(simpleStack);
        System.out.println(simpleStack.pop());
        System.out.println(simpleStack);
    }
}
