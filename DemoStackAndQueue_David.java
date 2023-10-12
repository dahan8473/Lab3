package LA3Q1;
import java.sql.SQLOutput;
import java.util.Scanner;
public class DemoStackAndQueue_David {

    public static void header() {
        System.out.println("=======================================================\n" +
                "Lab Exercise 3-Q1\n" +
                "Prepared By: David Liu\n" +
                "Student Number: 251306044\n" +
                "Goal of this Exercise:Creating and Utilizing Generic Data Structures (stack and queue)!\n" +
                "=======================================================");
    }
    //Displays footer information for the end of the exercise
    public static void footer() {
        System.out.println("=======================================================\n" +
                "Completion of Lab Exercise 3-Q1 is successful!\n" +
                "Goodbye and thank you for checking my work! - David Liu\n" +
                "=======================================================");
    }

    // Scanner for user input
    public static Scanner scanner = new Scanner(System.in);
    // Default constructor
    public DemoStackAndQueue_David(){
    }
    // Perform stack operations: push, pop, exit
    public static void stackDemo(DavidArray davidArray) {
        char stackChoice;
        while (true) { // A loop to continuously provide options until user decides to exit
            if (davidArray.getSize() == 0) {
                System.out.println("\nYou have an empty stack : []");
            }
            System.out.println("\nStack Operations Menu: \na. Push\nb. Pop\nc. Exit\nEnter your choice: ");
            stackChoice = scanner.next().charAt(0);

            switch (stackChoice) {
                case 'a': // Push operation
                    System.out.println("Let's push a data-item into the stack....");
                    System.out.print("Enter the year: ");
                    int year = scanner.nextInt();
                    System.out.print("Enter the name: ");
                    scanner.nextLine();  // Consume newline left-over from nextInt
                    String name = scanner.nextLine();
                    // Add a new Pair object (with year and name) to the end of the davidArray
                    davidArray.addAtLastIndex(new Pair<>(year, name));
                    System.out.println("Element pushed: " + davidArray.toString());
                    break;
                case 'b': // Pop operation
                    System.out.println("Let's pop a data-item");
                    if (davidArray.getSize() > 0 ) {
                        //Removes last index (LIFO)
                        Pair elementPop = davidArray.removeFromLastIndex();
                        System.out.print(elementPop.toString() + " is removed! ");
                        System.out.println("The current stack: " + davidArray.toString());
                    } else {
                        System.out.println("FYI: The stack is empty!");
                    }
                    break;
                case 'c': // Exit
                    System.out.println("Ending Stack-demo! Goodbye!.");
                    return;
                default:// Handle invalid choices
                    System.out.println("Invalid Choice");
            }

        }
    }
    public static void queueDemo(DavidArray davidArray){


        char queueChoice;
        while (true){
            if (davidArray.getSize() == 0) {
                System.out.println("\nYou have an empty queue : []");
            }
            System.out.println("\nQueue Operations Menu: \na. Enqueue\nb. Dequeue\nc. Exit\nEnter your choice: ");
            queueChoice = scanner.next().charAt(0);

            switch (queueChoice) {
                case 'a': // Enqueue operation
                    System.out.println("Let's enqueue a data-item....");
                    System.out.print("Enter the year: ");
                    int year = scanner.nextInt();
                    System.out.print("Enter the name: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();

                    davidArray.addAtLastIndex(new Pair<>(year, name));
                    System.out.println("The current queue: " + davidArray.toString());
                    break;
                case 'b': // Dequeue operation
                    System.out.println("Let's dequeue a data-item");
                    if (davidArray.getSize() > 0) {
                        //FIFO
                        Pair elementDequeue = davidArray.removeFromFirstIndex();
                        System.out.print(elementDequeue.toString() + " is dequeued!");
                        System.out.println("The current queue: " + davidArray.toString());
                    } else {
                        System.out.println("FYI: The queue is empty!");
                    }
                    break;
                case 'c': // Exit
                    System.out.println("Ending Queue-demo! Goodbye!.");
                    return;
                default:
                    System.out.println("Invalid Choice");
            }

        }

    }

    public static void main(String[] args) {
        header();
        DavidArray davidArray; // Create an array to use in stack or queue operations
        System.out.println("\nThis code performs a demo for Stack and Queue:");


        while (true){
            System.out.println("Main Demo-Menu: \n\t 1. Stack Demo \n\t 2. Queue Demo \n\t 3. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: //Stack operations
                    davidArray = new DavidArray();
                    stackDemo(davidArray);
                    break;
                case 2: //Queue Operations
                    davidArray = new DavidArray();
                    queueDemo(davidArray);
                    break;
                case 3: // Exit main menu
                    System.out.println("Goodbye!\n");
                    return;
                default:// handle invalid
                    System.out.println("Invalid choice, Please try again.");
            }

        }
    }
}
