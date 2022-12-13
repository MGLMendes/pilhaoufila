public class Pilha<T> {

    ItemListaEncadeada<T> primeiroItem;

    int tamanho = 0;

    public Pilha() {

    }

    public T addFirst(T dado) {

        if (primeiroItem == null){
            this.primeiroItem = new ItemListaEncadeada<>();
            primeiroItem.setDado(dado);
        } else {
            ItemListaEncadeada<T> item = new ItemListaEncadeada<>();
            item.setDado(dado);
            item.setProximo(primeiroItem);
            primeiroItem = item;
        }
        tamanho++;
        return dado;
    }

    public T getFirst() throws Exception {
        ItemListaEncadeada<T> item = primeiroItem;

        if (primeiroItem == null) {
            throw new Exception("Fila vazia");
        }

        if (primeiroItem.getProximo() != null) {
            primeiroItem = primeiroItem.getProximo();
        } else {
            primeiroItem = null;
        }
        return item.getDado();
    }

    public void printList() throws Exception {
        ItemListaEncadeada<T> item = primeiroItem;

        if(item == null) {
            throw new Exception("Pilha Vazia");
        }

        if (tamanho == 1) {
            System.out.println(item.getDado());
        }

        if (item != null) {
            while (item.getProximo() != null) {
                System.out.println(item.getDado());
                item = item.getProximo();
            }
            System.out.println(item.getDado()+"\n");
        }
    }



//    public static void main(String[] args) throws Exception {
//        Pilha<String> pilha = new Pilha<>();
//        pilha.addFirst("Pos 1");
//        pilha.addFirst("Pos 2");
//        pilha.addFirst("Pos 3");
//        pilha.addFirst("Pos 4");
//
//        pilha.printList();
//
//        System.out.println("Item retirado " + pilha.getFirst());
//        System.out.println("Item retirado " + pilha.getFirst());
//
//        pilha.printList();
//
//
//
//
//    }

}
