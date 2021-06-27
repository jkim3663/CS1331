/**
 * Node class that allows elements to be contained in the object node.
 *
 * @param <T> generic form T
 * @author Jun Yeop Kim
 * @version 1.0
 */
public class Node<T> {
    private T data;
    private Node<T> next;

    /**
     * Constructor that takes in generic form data and node next.
     *
     * @param data data that will be added in generic form
     * @param next the next data from the previos one
     */
    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    /**
     * Constructor that takes in generic form data and makes the next node null.
     *
     * @param data data that will be added in generic form
     */
    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    /**
     * @return the data of node
     */
    public T getData() {
        return data;
    }

    /**
     * @return next of node
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     * Sets the value of next.
     *
     * @param next the next
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }

    /**
     * Sets the value of data.
     *
     * @param data the data
     */
    public void setData(T data) {
        this.data = data;
    }
}
