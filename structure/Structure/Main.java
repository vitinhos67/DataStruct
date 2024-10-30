
import Structure.Utils.Utils;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Escolha uma operação:
                1. Pegar primeiro elemento
                2. Pegar último elemento
                3. Testar algoritmo de ordenação
                4. Medir tempo de inserção
                5. Todos
                """);

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                first();
                break;
            case 2:
                last();
                break;
            case 3:
                orderingAlgorithm();
            case 4:
                insert();
                break;
            case 5:
                all();
                break;
            default:
                throw new AssertionError();
        }
        scanner.close();
    }

    public static void all() {
        first();
        last();
        orderingAlgorithm();
        insert();
    }

    public static void first() {
        int numElements = (int) Utils.askNumber();
        System.out.println("Comparando o tempo de busca para o primeiro elemento");
        DataStructureComparison.compareQueryFromFirstElement(numElements);
    }

    public static void last() {
        int numElements = (int) Utils.askNumber();
        System.out.println("Comparando o tempo de busca para o ultimo elemento");
        DataStructureComparison.compareQueryFromLastElement(numElements);
    }

    public static void insert() {
        int numElements = (int) Utils.askNumber();
        System.out.println("Comparando tempos de inserção para " + numElements + " elementos:");
        DataStructureComparison.compareStructures(numElements);
    }

    public static void orderingAlgorithm() {

        int size = (int) Utils.askNumber();

        // Testando Vector
        Vector vector = new Vector(size);
        vector.insertRandomElements(size);

        System.out.println("Antes da ordenação:");
        vector.printArray();

        vector.bubbleSort();
        System.out.println("Após Bubble Sort:");
        vector.printArray();

        vector.insertionSort();
        System.out.println("Após Insertion Sort:");
        vector.printArray();

        // Testando AVLTree
        AVLTree<Integer> avlTree = new AVLTree<>();
        avlTree.insertRandomElements(size);

        System.out.println("Elementos da AVL em ordem:");
        System.out.println(avlTree.sortedElements());

        // Testando BinaryTree
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.insertRandomElements(size);

        System.out.println("Elementos da BinaryTree em ordem:");
        System.out.println(binaryTree.sortedElements());
    }


}
