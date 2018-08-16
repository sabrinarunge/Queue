import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TaskHelper
{
    Queue<String> myQueue = new LinkedList<>();     //create a new queue for a task helper

    public static void main(String[] args)
    {
        TaskHelper myTaskHelper = new TaskHelper();
        myTaskHelper.run();

    }

    private void run()
    {
        System.out.println("Welcome to my task helper!\n");
        printMenu();

        Scanner in = new Scanner(System.in);

        boolean exit = false;

        do
        {
            System.out.println("Enter your command.");      //get command from user
            String commandLine = in.nextLine();
            String[] words = commandLine.split(" ");

            String command = words[0].toUpperCase();

            switch (command)        //modify the queue based on user commands
            {
                case "ADD":
                    try
                    {
                        String taskOne = words[1];
                        String taskTwo = words[2];
                        String taskThree = words[3];
                        addTask(taskOne, taskTwo, taskThree);
                    }
                    catch (Exception e)
                    {
                        System.out.println("Please enter a valid command.");
                    }
                    break;
                case "PEEK":
                    try
                    {
                        int numberOfTasks = Integer.parseInt(words[1]);
                        peek(numberOfTasks);
                    }
                    catch (Exception e)
                    {
                        System.out.println("Please enter a valid command.");
                    }
                    break;
                case "REMOVE":
                    try
                    {
                        int numberOfTasks = Integer.parseInt(words[1]);
                        removeTask(numberOfTasks);
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
                case "FLEE":
                    try
                    {
                        flee();
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

    private void addTask(String taskOne, String taskTwo, String taskThree)       //add tasks to the list
    {
        myQueue.add(taskOne);
        myQueue.add(taskTwo);
        myQueue.add(taskThree);
        System.out.println(taskOne + ", " + taskTwo + ", and " + taskThree + " have been added to the task helper.");
    }
    private void peek(int numberOfTasks)     //peek at the next tasks
    {
        String nextTask = myQueue.peek();
        Integer[] newArray = null;
        newArray = myQueue.toArray(new Integer[myQueue.size()]);



        System.out.println("The next tasks are " + nextTask + ".");
    }
    private void removeTask(int numberofTasks)       //remove the first tasks from the list
    {
        String completedTask = myQueue.remove();
        System.out.print(completedTask + " has been completed and removed from the task helper. ");
        String nextTask = myQueue.peek();
        System.out.println("The next task is " + nextTask + ".");
    }
    private void printHowMany()     //print the remaining tasks
    {
        System.out.println(myQueue);
    }
    private void flee()     //exit the task helper
    {
        myQueue.clear();
        System.out.println("The task helper has been cleared! Enjoy avoiding your responsibilities.");
    }
    private void printMenu()        //print the commands the user can enter
    {
        System.out.println("Please enter one of the following commands: ");
        System.out.println("ADD <Task Name> <Task Name> <Task Name> (To add a task to the list)");
        System.out.println("PEEK <Number of Tasks> (To print out the next task without removing it)");
        System.out.println("REMOVE <Number of Tasks> (To declare that the task at the front of the queue has been completed)");
        System.out.println("HOWMANY (To print out how many tasks remain)");
        System.out.println("FLEE (To clear the list)");
    }
}
