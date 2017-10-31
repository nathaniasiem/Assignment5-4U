/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class IntNode {
    
    private int item;
    private IntNode next;
    /**
     * 
     * @param num 
     */
    public IntNode (int num){
        item=num;
        next=null;
    }
    /**
     * Returns the number stored in the 
     * @return stored number
     */
    public int getNum(){
        return item;
    }
    /**
     * Returns the node that comes after
     * @return The next node
     */
    public IntNode getNext(){
        return next;
    }
    /**
     * Sets the node that comes after
     * @param node the node to point to
     */
    public void setNext(IntNode node){
        next=node;
    }
    
}
