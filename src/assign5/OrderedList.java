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
    
    //create variables for the list
    private IntNode1 head;
    private int numItems;

    public void add(int num) {
     //start at the front of the list
        IntNode1 start = head;
        //check to see if there is the first item
        if (start == null) {
            IntNode1 temp = new IntNode1(num);
            head = temp;
        } else {
            //travel to the end
            while (start.getNext() != null) {
                //travel to the next node
                start = start.getNext();
            }
            //node is the last node in the the list
            //create the  new node
            IntNode1 temp = new IntNode1(num);
            //insert it into the list
            start.setNext(temp);
        }
        
    public get(int index){
        
        
    }
        //increase item counter
        numItems++;   
    }
    
    public void remove (int num){
        
        //decrease item counter
        numItems--;
    }
    

    /**
     *
     * @return
     */
    public int size() {
        return numItems;
    }

    /**
     *
     * @return
     */
    public boolean isEmpty() {
        return numItems == 0;
    }
}
