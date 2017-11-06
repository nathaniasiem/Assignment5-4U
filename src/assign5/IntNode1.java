/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assign5;

/**
 *
 * @author simon7323
 */
public class IntNode1 {

    private int item;
    private IntNode1 next;

    /**
     *
     * @param num
     */
    public IntNode1(int num) {
        item = num;
        next = null;
    }

    /**
     * Returns the number stored in the
     *
     * @return stored number
     */
    public int getNum() {
        return item;
    }

    /**
     * Returns the node that comes after
     *
     * @return The next node
     */
    public IntNode1 getNext() {
        return next;
    }
    /**
     * Sets the node that comes after
     *
     * @param node the node to point to
     */
    public void setNext(IntNode1 node) {
        next = node;
    }
}
