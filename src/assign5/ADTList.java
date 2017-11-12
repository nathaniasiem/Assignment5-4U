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
    public void add(int index,int item){
        //if there is room in the stack
        if (numItems<List.length){
            //put item on the stack
        List[numItems]=item;
        numItems++;
        }else{
            //make more room
            int[] temp = new int[List.length*2];
            //copy items over
            for(int i=0;i<List.length;i++){
                temp[i]=List[i];
            }
            //stack becomes new array
            List=temp;
            //add item
           List[numItems]=item;
            numItems++;
        }
        
    }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
