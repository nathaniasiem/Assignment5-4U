/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assign5;

/**
 *
 * @author simon7323
 */
public class A5Q3 {
    
    //store the letters for words
    private char[] letters;
    
    //keep track of number of items
    private int numItems;

    public A5Q3 (){
        //create constructor to start the array
        letters= new char[1];
        numItems=0;
    }
        public boolean inLang(String word){
            //use a for loop to go through each letter
             for (int i = 0; i < word.length(); i++) {
            //when there is space to 
            if (numItems < letters.length) {
                //increase number of letters in the stack
                letters[i] = word.charAt(i);
                numItems++;
        }
             //Check if there is a dollar sign in the middle of the word
        if (letters[(numItems - 1) / 2] == '$') {
            //go thought hte positions of the array
            for (int i = 0; word.length >= i; i++) {
                //Break through the loop if the chars on each side of the word closing in, doesnt equal zero 
                if (letters[i] != letters[(numItems - 1) - i]) {
                    
                    break;
                }
                //Return true if the loop doesn't break 
                return true;
            }
        }
        //Return fals eif the loop does break
        return false;
    }

    }
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
