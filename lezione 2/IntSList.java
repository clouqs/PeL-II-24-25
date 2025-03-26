public class IntSList {
    public static final IntSList NULL_INTLIST = new IntSList();

    // Variabili di istanza
    private final boolean empty;
    private final int first;
    private final IntSList rest;

    /* Costruttore per la lista vuota */
    public IntSList() {
        empty = true;
        first = 0;
        rest = null;
    }

    /* Costruttore per una lista non vuota */
    public IntSList(int first, IntSList rest) {
        this.empty = false;
        this.first = first;
        this.rest = rest;
    }

    /* Metodo per controllare se la lista è vuota */
    public boolean isNull() {
        return empty;
    }

    /* Restituisce il primo elemento della lista */
    public int car() {
        if (this.isNull()) {
            throw new IllegalStateException("car() called on empty list");
        }
        return first;
    }

    /* Restituisce il resto della lista */
    public IntSList cdr() {
        if (this.isNull()) {
            throw new IllegalStateException("cdr() called on empty list");
        }
        return rest;
    }

    /* Aggiunge un elemento in testa alla lista */
    public IntSList cons(int e) {
        return new IntSList(e, this);
    }

    /*calcolo lunghezza  */
    public int length(){
        int len = 0;
        IntSList r = this;
        while (!r.isNull()){
            len++;
            r = r.cdr();
        }
        return len;
    }

    /*list ref - esercizio */
    public int listRef(int k){
        if (k == 0){
            return car();
        } else {
            return cdr().listRef(k-1);
        }
    }
 /* list append */
    public IntSList append(IntSList t){
        if (this.isNull()){
            return t;
        } else {
            return cdr().append(t).cons(car());
        }
    }
    /*list reverse */
    public IntSList reverse(){
        IntSList rev = NULL_INTLIST;
        IntSList s = this;
        while (!s.isNull()){
            rev = rev.cons(s.car());
            s = s.cdr();
        }
        return rev;
    }

    /* Rappresentazione in stringa della lista */
    public String toString() {
        if (this.isNull()) {
            return "()";
        } else {
            String s = "(" + this.car();
            IntSList r = cdr();
            while (!r.isNull()){
                s = s + " " + r.car();
                r = r.cdr();
            }
            return s + ")";
        }
    }

    /* Test */
    public static void main(String[] args) {
        IntSList list = new IntSList().cons(1).cons(2).cons(3);
        System.out.println(list); // Output atteso: (3 2 1)
    }
}
