public class Fila<T> {

    ItemListaEncadeada<T> primeiroItem;
    ItemListaEncadeada<T> ultimoItem;

    int tamanho = 0;

    public Fila() {

    }

    public T addLast(T dado) {

        if (ultimoItem == null){
            this.primeiroItem = new ItemListaEncadeada<>();
            primeiroItem.setDado(dado);
            ultimoItem = primeiroItem;
        } else {
            ItemListaEncadeada<T> item = new ItemListaEncadeada<>();
            item.setDado(dado);
            ultimoItem.setProximo(item);
            ultimoItem = item;
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

    public T remove(int posicao) throws Exception {
        if (posicao < 0 || posicao >= tamanho) {
            throw new Exception("Posição negativa ou maior que o tamanho da lista");
        }

        if (posicao == 0){
            T dado = primeiroItem.getDado();
            primeiroItem = primeiroItem.getProximo();
            return dado;
        }

        ItemListaEncadeada<T> itemAnterior = null;
        ItemListaEncadeada<T> itemAtual = itemAnterior.getProximo();

        if (itemAtual == ultimoItem) {
            ultimoItem = itemAnterior;
            itemAnterior.setProximo(null);
        } else {
            itemAnterior.setProximo(itemAtual.getProximo());
        }

        return itemAtual.getDado();
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
//        Fila<String> fila = new Fila<>();
//        fila.addLast("Pos 1");
//        fila.addLast("Pos 2");
//        fila.addLast("Pos 3");
//        fila.addLast("Pos 4");
//
//        fila.printList();
//
//        System.out.println("Item retirado " + fila.getFirst());
//
//        fila.printList();
//
//
//
//
//    }

}
