    public static void main(String[] args) {
        
        ListaEnlazada L = new ListaEnlazada();
        L.insertarAlInicio(7);
        L.add_tail(5);
        L.add_tail(3);
        L.add_tail(8);
        
        Nodo temp =L.getHead();
        while(temp.siguiente!= null){
            System.out.println(temp.clave);
            temp = temp.siguiente;
        }
    }
}
