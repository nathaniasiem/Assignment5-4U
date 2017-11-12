/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assign5;

/**
 *
 * @author simon7323
 */
public class ADTList {
    
 private int [] List;
 private int numItems;
 
 public ADTList(){
    List = new int[10];
    numItems = 0;
}
     public void add(int index, int num) {
        //at the front of the list 
        if (index == 0 && num==0) {
           List[0]=num;
            //adding at the end of the list
        }  else if (index<numItems){
            for (int i = numItems; i > index; i--) {
                List[i] = List[i - 1];
            }
            //add the number
            List[index] = num;
        }
        //increase item counter
        numItems++;
        if (numItems == List.length) {
            //create new array
            int[] temp = new int[List.length * 2];
            //copy contents of original array to new array
            for (int i = 0; i < List.length; i++) {
                temp[i] = List[i];
            }
            //point towards the new array
            List = temp;
        }
    }
        
         
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
