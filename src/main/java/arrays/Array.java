package arrays;

public interface Array {

    boolean insertAtEnd(int x);
    boolean deleteAtEnd();
    boolean insertElementAtGivenPos(int x, int pos);
    boolean deleteElementAtGivenPos(int pos);
    void print();
}
