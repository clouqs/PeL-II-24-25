/*
 
 */



public class IntSList {
    public static final IntSList NULL_INTLIST = new IntSList();

    //instance variables
    private final boolean empty;
    private final int first;
    private final IntSList rest;
    


/* constructor  */
public IntSList(){
    empty = true;
    first = 0;
    rest = null;
}
}