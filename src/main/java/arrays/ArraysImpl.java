package arrays;

public class ArraysImpl implements Array {

    private static int[] a = new int[100];
    private static int size = 0;


    /**
     * Default constructor.
     */
    ArraysImpl() {
    }

    public boolean addElement(int element) {
        if (size < a.length) {
            a[size++] = element;
            return true;
        }
        return false;
    }


    public boolean insertAtEnd(int x) {
        if (size < a.length) {
            a[size++] = x;
            return true;
        }
        return false;
    }

    public boolean deleteAtEnd() {
        size--;
        return true;
    }

    public boolean insertElementAtGivenPos(int x, int pos) {
        if (pos<=0 || pos>a.length) {
            return false;
        }
        // moving all the
        for (int i=size-1;i>=pos-1;i--) {
            a[i+1] = a[i];
        }
        a[pos-1] = x;
        size++;
        return true;
    }

    public boolean deleteElementAtGivenPos(int pos) {

        if (pos<=0 || pos>size) {
            return false;
        }

        for(int i=pos-1;i<size;i++) {
            a[i] = a[i+1];
        }
        size--;
        return true;
    }

    public void print() {
        System.out.print("The Elements are: [");
        for (int i=0;i<size;i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.print("]\n");
    }
}
