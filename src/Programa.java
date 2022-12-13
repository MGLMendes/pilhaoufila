import java.util.Scanner;

public class Programa {

     Pilha<Object> pilha = new Pilha();
     Fila<Object> fila = new Fila<>();

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Programa programa = new Programa();
        int menu;
        do {
            menu = programa.selecionarMenu(sc);
            switch (menu) {
                case 1:
                    programa.pilha(sc);
                    break;
                case 2:
                    programa.fila(sc);
                    break;
            }
        } while (menu != 3);
        System.out.println("Obrigado!");
        sc.close();
    }

    public int selecionarMenu(Scanner sc) throws Exception {
        this.pilha = new Pilha<>();
        this.fila = new Fila<>();
        System.out.println("Escolha qual estrutura você quer usar: ");
        System.out.println("1. Pilha");
        System.out.println("2. Fila");
        System.out.println("3. Sair");
        System.out.print("Digite um número: ");
        return sc.nextInt();

    }

    public void pilha(Scanner sc) throws Exception {
        System.out.println("Qual método você gostaria de usar? ");
        System.out.println("1. Adicionar");
        System.out.println("2. Remover");
        System.out.println("3. Listar");
        System.out.println("4. Sair");
        System.out.print("Escolha um número: ");
        int metodo = sc.nextInt();
        if (metodo != 4) {
            metodoEscolhido(metodo, sc, 1);

        } else{
            selecionarMenu(sc);
        }
        pilha(sc);
    }

    public void fila(Scanner sc) throws Exception {
        System.out.println("Qual método você gostaria de usar? ");
        System.out.println("1. Adicionar");
        System.out.println("2. Remover");
        System.out.println("3. Listar");
        System.out.println("4. Sair");
        System.out.print("Escolha um número: ");
        int metodo = sc.nextInt();
        if (metodo != 4) {
            metodoEscolhido(metodo, sc, 2);

        } else{
            selecionarMenu(sc);
        }
        fila(sc);
    }

    public void metodoEscolhido(int metodo, Scanner sc, int estrutura) throws Exception {
        if (estrutura == 1) {
            switch (metodo) {
                case 1:
                    System.out.println("O que você quer adicionar? ");
                    Object item = sc.next();
                    this.pilha.addFirst(item);
                    break;
                case 2:
                    item = this.pilha.getFirst();
                    System.out.println("Removendo item: " + item);
                    break;
                case 3:
                    this.pilha.printList();
                    break;
            }
        } else {
            switch (metodo) {
                case 1:
                    System.out.println("O que você quer adicionar? ");
                    Object item = sc.next();
                    this.fila.addLast(item);
                    break;
                case 2:
                    item = this.fila.getFirst();
                    System.out.println("Removendo item: " + item);
                    break;
                case 3:
                    this.fila.printList();
                    break;
            }
        }


    }
}
