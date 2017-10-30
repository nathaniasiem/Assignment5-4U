/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class Array_Stack {

    //store all of the integers on the stack
    private int[] stack;
    
    //keep track of how many items?
    private int numItems;
    
    public Array_Stack(){
        //create constructor for the stack with array of 10 spots
        stack = new int[10];
        numItems=0;
    }
    
    public void push(int item){
        //if there is room in the stack
        if (numItems<stack.length){
            //put item on the stack
        stack[numItems]=item;
        numItems++;
        }else{
            //make more room
            int[] temp = new int[stack.length*2];
            //copy items over
            for(int i=0;i<stack.length;i++){
                temp[i]=stack[i];
            }
            //stack becomes new array
            stack=temp;
            //add item
            stack[numItems]=item;
            numItems++;
        }
        
    }
    public int pop(){
        //get the top item on the stack
        int item = stack[numItems-1];
        //one less item
        numItems--;
        //gives back item
        return item;
    }
    
    public int size(){
     return numItems;   
    }
    
    public int peek(){
        return stack [numItems-1];
    }
    
    public boolean isEmpty(){
        return numItems ==0;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create empty stack
        Array_Stack stack = new Array_Stack();
        System.out.println("Empty: " + stack.isEmpty());
        stack.push(12);
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Size: " + stack.size());
        int item= stack.pop();
        System.out.println("Popped item: " + item);
        //test adding lots of items
        for (int i=0;i<100;i++){
        stack.push(i);
    }
        System.out.println("Size: " + stack.size());
        System.out.println("Peek: " + stack.peek());
    }
}
