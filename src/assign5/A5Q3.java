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

    public A5Q3() {
        //create constructor to start the array
        letters = new char[1];
        numItems = 0;
    }

    public boolean inLang(String word) {
        //use a for loop to go through each letter
        for (int i = 0; i < word.length(); i++) 
        {
            if (numItems < word.length()) {
                numItems++;
                letters[i] = word.charAt(i);
            } else {
                char[] temp = new char[letters.length * 2];
                for (int n = 0; n < letters.length; n++) {
                    temp[n] = letters[n];
                }
                //Make the temp array equal the original array
                letters = temp;
                letters[i] = word.charAt(i);
                numItems++;
            }
        }
        //create an if statement if there is a dollar sign in the middle of the word
        if (letters[(numItems - 1) / 2] == '$') {
            //go through the positions of the array
            for (int i = 0; i < letters.length; i++) {
                //check if the charcters on each side of the word closing in, doesn't equal to zero
                //then break the loop
                if (letters[i] != letters[(numItems - 1) - i]) {
                    break;
                }
                //return true when it doesn't meet a condition
                //indicates that the loop is not broken
                return true;
            }
        }
        //Return false when it meets a condition
        return false;
    }
    
public static void main(String[]args){
    A5Q3 test = new A5Q3();
     String word = "cat$tac";
System.out.println("In proper format: " + test.inLang(word));
}
}
