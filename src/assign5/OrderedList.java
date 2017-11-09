/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assign5;

/**
 *
 * @author simon7323
 */
public class OrderedList {

    private IntNode1 head;
    private int numItems;
/**
 * identifies the start of the list
 */
    public OrderedList() {
        head = null;
        numItems = 0;
    }
/**
 * 
 * @return the number of items at the start
 */
    public boolean isEmpty() {
        return numItems == 0;
    }
    /**
     * 
     * @return  the number of items in the list
     */
    public int size() {
        return numItems;
    }
    /**
     * 
     * @param position
     * @return 
     */
    public int get(int position) {
        IntNode1 node = head;
        //move the number of times
        for (int i = 0; i < position; i++) {
            node = node.getNext();
        }
        return node.getNum();

    }
    
    /**
     * 
     * @param num 
     */
    public void add(int num) {
        //begins from the top of the list
        IntNode1 node = head;
        //check to see if there is the first item
        //then sets 
        if (node == null) {
            IntNode1 temp = new IntNode1(num);
            head = temp;
        } else {
            //travel to the end
            while (node.getNext() != null) {
                //travel to the next node
                node = node.getNext();
            }
            //node is the last node in the the list
            //create the  new node
            IntNode1 temp = new IntNode1(num);
            //insert it into the list
            node.setNext(temp);
        }
        //increase the size counter
        numItems++;
    }
}
