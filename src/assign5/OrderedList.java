/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign5;

/**
 *
 * @author candy
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
     * @return the number of items in the list
     */
    public int size() {
        return numItems;
    }

    /**
     *
     * @param index
     * @return the number in the specific position on the list
     */
    public int get(int index) {
        IntNode1 node = head;
        //move the number of times
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node.getNum();

    }

    /**
     *
     * @param num
     */
    public void add(int num) {
        //start at beginning of list
        //create local variables 
        //@node = the beginning of the list
        IntNode1 node = head;
        //@temp =  temporary storage of the item to help enable swap
        IntNode1 temp = new IntNode1(num);
        //check to see if there is the first item
        if (node == null) {
            head = temp;
            //compares the number to a number in the list
            //if less than set the number to be the front of the list
        } else if (num < head.getNum()) {
            //do a swap
            IntNode1 sNum = head;
            head = temp;
            head.setNext(sNum);
            //checks for the next number
            //sets it in the temp variable for further comparisons
        } else if (node.getNext() == null) {
            node.setNext(temp);
            //travel to the end
        } else {
            //when the next node is less than the number given
            //loop runs until it is false
            while (node.getNext().getNum() < num) {
                //travel to the next node
                node = node.getNext();
                //condition when user reaches the end of the list
                if (node.getNext() == null) {
                    break;
                }
            }
        }
        //insert it into the list
        node = node.getNext();
        temp.setNext(node);
        node.setNext(temp);
        //increase the size counter 
        numItems++;
    }

    public void remove(int num) {
        //create local variables
        //@crnt-variable to store the number on top of the list
        //@prev-variable to store the previous number
        IntNode1 crnt = head;
        IntNode1 prev = null;
        //when the list has no items , return null
        if (numItems == 0) {
            //when the number indicated is equal to the top number 
        } else if (num == crnt.getNum()) {
            //when there is a number, go through the list
            while (crnt != null) {
                crnt = crnt.getNext();
                //when the head and the number match
                if (crnt.getNum() == num && crnt == head) {
                    //set the value to equal the next value on the list
                    head = head.getNext();
                    //when the head isn't the same as the number
                } else if(crnt.getNum()!=num && crnt!=head) {
                   //set the previous number with 
                    prev.setNext(crnt.getNext());
                    //make the previous number match the head
                        prev = crnt;
                    //make the current head to become the value after that
                        crnt = crnt.getNext();
                    }
        }
        //decreases the number of the items on the 
        numItems--;
    }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create variable to test
        OrderedList test = new OrderedList();
        test.add(10);
        test.add(4);
        test.add(12);
        test.add(20);
        test.add(1);
        test.add(4);

        for(int i =0;i<test.size()+1;i++){
            System.out.println(test.get(i));
        }
    }
}

