import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue
{
    public static void main(String[] args)
    {
        SimpleQueue myQueue = new SimpleQueue();
        myQueue.run();
    }

    public void run()
    {
        Queue <String> myQueue = new LinkedList<>();

        myQueue.add("One");
        myQueue.add("Two");
        myQueue.add("Three");
        myQueue.add("Four");
        myQueue.add("Five");

        System.out.print("Original Queue --> ");
        System.out.println(myQueue);

        String removedValue = myQueue.poll();
        System.out.println("Polled value --> " + removedValue);

        System.out.print("Queue after poll --> ");
        System.out.println(myQueue);

        String peekedValue = myQueue.peek();
        System.out.println("Peeked value --> " + peekedValue);

        removedValue = myQueue.poll();
        System.out.println("Polled value --> " + removedValue);

        removedValue = myQueue.poll();
        System.out.println("Polled value --> " + removedValue);

        removedValue = myQueue.poll();
        System.out.println("Polled value --> " + removedValue);

        removedValue = myQueue.poll();
        System.out.println("Polled value --> " + removedValue);

        removedValue = myQueue.poll();
        System.out.println("Polled value --> " + removedValue);


    }
}
