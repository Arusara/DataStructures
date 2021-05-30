package arrays;

import java.util.Scanner;

public class ArrayMain {

    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the the size of array ");
        int sizeOfArray = 5;

        Array array = new ArraysImpl();
        for (int i = 0; i < sizeOfArray; i++) {
           // System.out.println("Enter the element");
            //int ele = scanner.nextInt();
            array.insertAtEnd(i+1);
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

        /**
         * The output.
         *
         *
         * Enter the the size of array
         * The Elements are: [1, 2, 3, 4, 5, ]
         * The Elements are: [1, 2, 10, 3, 4, 5, ]
         * The Elements are: [1, 2, 3, 4, 5, ]
         * The Elements are: [1, 2, 3, 4, ]
         * The Elements are: [1, 2, 3, 4, 15, ]
         */
    }
}
