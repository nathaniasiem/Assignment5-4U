/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class MyLinkedList {

    private IntNode head;
    private int numItems;

    public MyLinkedList() {
        head = null;
        numItems = 0;
    }

    /**
     *
     * @param num
     */
    public void add(int num) {
        //start at beginning of list
        IntNode node = head;
        //check to see if there is the first item
        if (node == null) {
            IntNode temp = new IntNode(num);
            head = temp;
        } else {
            //travel to the end
            while (node.getNext() != null) {
                //travel to the next node
                node = node.getNext();
            }
            //node is the last node in the the list
            //create the  new node
            IntNode temp = new IntNode(num);
            //insert it into the list
            node.setNext(temp);
        }
        //increase the size counter
        numItems++;
    }

    /**
     *
     * @param pos
     * @param num
     */
    public void add(int pos, int num) {
        //at the front of the list 
        if (pos == 0) {
            //create new node immed.
            IntNode temp = new IntNode(num);
            //the new node points to the starting node
            temp.setNext(head);
            //reassigning the head node
            head = temp;
            //adding at the end of the list
        } else if (pos == numItems - 1) {
            add(num);
            //anything else...
        } else {
            //start at the beginning
            IntNode node = head;
            //move to node before the insert
            for (int i = 0; i < pos - 1; i++) {
                node = node.getNext();

            }
            //@ node just before the insert
            IntNode temp = new IntNode(num);
            //create after link first!
            temp.setNext(node.getNext());
            //change node pointer
            node.setNext(temp);
        }
        //increase item counter
        numItems++;
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

    /**
     *
     * @param position
     * @return
     */
    public int get(int position) {
        IntNode node = head;
        //move the number of times
        for (int i = 0; i < position; i++) {
            node = node.getNext();
        }
        return node.getNum();

    }

    /**
     *
     * @param pos
     */
    public void remove(int pos) {
        //when removing at the start of the list
        if (pos == 0) {
            head = head.getNext();
        }else if(pos==numItems-1){
            //remove from the end
            IntNode node=head;
            //moving to the second last item
            for (int i = 0;i<numItems-1;i++){
                node=node.getNext();
            }
            //sever the link
            node.setNext(null);
        }else{
            IntNode node =head;
            for (int i=0;i<pos-1;i++){
                node.getNext();
            }
            IntNode toRemove = node.getNext();
            //its next node
            IntNode next = toRemove.getNext();
            //set all the links
            node.setNext(next);
            toRemove.setNext(null);
        }
        numItems--;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // testing
        MyLinkedList list =new MyLinkedList();
        list.add(2);   
        list.add(-5);
        list.add(0,13);
        list.remove(1);
        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
