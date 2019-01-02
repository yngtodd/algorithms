/*************************************************************************
 *  Compilation:  javac Bag.java
 *  Execution:    java Bag < input.txt
 *
 *  A generic bag or multiset, implemented using a linked list.
 *
 *************************************************************************/

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item>
{
    private int N;
    private Node first;

    private class Node
    {
        Item item;
        Node next;
    }

    public Bag()
    {
       first = null;
       N = 0;
    }

    public boolean isEmpty()
    { 
        return first == null; 
    }

    public int size()
    {
        return N;
    }

    public void add(Item item)
    {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }

    public Iterator<Item> iterator()
    { 
        return new ListIterator(); 
    } 

    private class ListIterator implements Iterator<Item>
    {
        private Node current = first;

        public boolean hasNext()
        { 
            return current != null; 
        }

        public void remove() { }

        public Item next()
        {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
