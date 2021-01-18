package edu.kis.vh.nursery.list;

public class Node
{

    private int value;
    private Node prev;
    private Node next;

    public Node(int i)
    {
        value = i;
    }

    /**
     * @return the value
     */
    public int getValue()
    {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value)
    {
        this.value = value;
    }

    /**
     * @return the prev
     */
    public Node getPrev()
    {
        return prev;
    }

    /**
     * @param prev the prev to set
     */
    public void setPrev(Node prev)
    {
        this.prev = prev;
    }

    /**
     * @return the next
     */
    public Node getNext()
    {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Node next)
    {
        this.next = next;
    }

}
