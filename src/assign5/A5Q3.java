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
            if(numItems<word.length()){
                numItems++;
                letters[i]=word.charAt(i);
            }else{
                char[] temp = new char[letters.length*2];
                for (int j = 0; j < letters.length; j++) {
                    temp[j] = letters[j];
                }
                //Make the temp array equal the original array
                letters = temp;
                letters[i] = word.charAt(i);
                numItems++;
            }
            }
                 
            }
                   
             
             }
           
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
