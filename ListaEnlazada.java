public class ListaEnlazada {    
    private Nodo head; 
    private int size; 
    
    public ListaEnlazada() {
        this.head = null; 
        this.size = 0; 
    }
    
    public void insertarAlInicio(int clave) {
        Nodo temp = new Nodo(clave);
        temp.siguiente = head;
        head = temp;
        size++;
    }
    
    public void add_tail(int key){   
     Nodo tail = new Nodo(key);
     if (head == null) 
         head = tail;
     
     else {
        Nodo temp = head;
        while (temp.siguiente != null)
            temp = temp.siguiente;
        temp.siguiente = tail;
     }
     
     tail.siguiente = null;
     size += 1;

    }
    public Nodo getHead(){
        return head;
    }
}

