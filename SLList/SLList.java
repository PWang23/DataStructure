public class SLList {
    /**
     * Private variables and methods can only be accessed
     * by code inside the same .java file
     *
     * Declaring a nested class as static means that methods
     * inside the static class can not access any of the
     * members of the enclosing class.
     */
    private static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
            //System.out.println(size);
        }
    }

    private IntNode sentinel;
    private int size;

    public SLList(){
        sentinel = new IntNode(0,null);
        size = 0;
    }

    public SLList(int x){
        sentinel = new IntNode(0,null);
        sentinel.next = new IntNode(x,null);
        size = 1;
    }

    /** Adds an item to the front of the list. */
    public void addFirst(int x){
        sentinel.next = new IntNode(x,sentinel.next);
        size++;
    }

    /** Retrieves the front item from the list. */
    public int getFirst(){
        return sentinel.next.item;
    }

    /** Adds an item to the front of the list. */
    public void addLast(int x){
        size++;
        IntNode p = sentinel;

        /* Advance p to the end of the list. */
        while (p.next != null){
            p = p.next;
        }
        p.next = new IntNode(x,null);
    }

    /** Returns the size of the list starting at IntNode p. */
    /*
    private static int size(IntNode p){
        if (p.next == null){
            return 1;
        }
        return 1 + size(p.next);
    }
    */

    public int size(){
        return size;
    }
}
