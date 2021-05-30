package arrays;

import java.util.Scanner;

public class ArrayMain {

    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the the size of array ");
        int sizeOfArray = scanner.nextInt();

        Array array = new ArraysImpl();
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.println("Enter the element");
            int ele = scanner.nextInt();
            array.insertAtEnd(ele);
        }

        // printing the elements.
        array.print();

        // inserting
        array.insertElementAtGivenPos(10, 3);
        array.print();

        // deleting
        array.deleteElementAtGivenPos(3);

        array.print();
        array.deleteAtEnd();
        array.print();

        array.insertAtEnd(15);
        array.print();






    }
}
