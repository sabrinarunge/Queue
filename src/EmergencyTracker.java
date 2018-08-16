import java.util.Scanner;
import java.util.Stack;

public class EmergencyTracker
{

    Stack<String> myStack = new Stack<>();      //create a new stack for an emergency tracker

    public static void main(String[] args)
    {
        EmergencyTracker myEmergencyTracker = new EmergencyTracker();
        myEmergencyTracker.run();
    }

    private void run()
    {
        System.out.println("Welcome to my emergency tracker!\n");
        printMenu();

        Scanner in = new Scanner(System.in);

        boolean exit = false;

        do
        {
            System.out.println("Enter your command.");      //get command from user
            String commandLine = in.nextLine();
            String[] words = commandLine.split(" ");

            String command = words[0].toUpperCase();

            switch (command)        //modify the stack based on user commands
            {
                case "ADD":
                    try
                    {
                        String emergency = words[1];
                        add(emergency);
                    }
                    catch (Exception e)
                    {
                        System.out.println("Please enter a valid command.");
                    }
                    break;
                case "PEEK":
                    try
                    {
                        peek();
                    }
                    catch (Exception e)
                    {
                        System.out.println("Please enter a valid command.");
                    }
                    break;
                case "REMOVE":
                    try
                    {
                        remove();
                    }
                    catch (Exception e)
                    {
                        System.out.println("Please enter a valid command.");
                    }
                    break;
                case "HOWMANY":
                    try
                    {
                        printHowMany();
                    }
                    catch (Exception e)
                    {
                        System.out.println("Please enter a valid command.");
                    }
                    break;
                case "PANIC":
                    try
                    {
                        panic();
                        exit = true;
                    }
                    catch (Exception e)
                    {
                        System.out.println("Please enter a valid command.");
                    }
                    break;
            }
        } while (!exit);
    }

    private void add(String emergency)      //add an emergency to the stack
    {
        myStack.push(emergency);
        System.out.println("You have added " + emergency + " as an emergency.");
    }
    private void peek()     //peek at the next emergency to be completed
    {
        String nextEmergency = myStack.peek();
        System.out.println("The next emergency is " + nextEmergency + ".");
    }
    private void remove()       //remove an emergency from the stack after completing it
    {
        String completedEmergency = myStack.pop();
        String nextEmergency = myStack.peek();
        System.out.println(completedEmergency + " has been completed and removed from the emergency tracker. The next emergency you need to complete is " + nextEmergency + ".");
    }
    private void printHowMany()     //print the remaining emergencies
    {
        System.out.println(myStack);
    }
    private void panic()        //exit the emergency tracker
    {
        myStack.clear();
        System.out.println("The list of emergencies has been cleared.");
    }
    private void printMenu()        //print the menu of commands
    {
        System.out.println("Please enter one of the following commands: ");
        System.out.println("ADD <Emergency Name> (Add an emergency)");
        System.out.println("PEEK (Print out the next emergency without removing it");
        System.out.println("REMOVE (Take the next emergency off the list)");
        System.out.println("HOWMANY (Print how many emergencies are left)");
        System.out.println("PANIC (Clear the list of emergencies)");
    }
}
