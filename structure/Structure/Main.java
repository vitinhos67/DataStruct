
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
                5. Pegar elemento do meio
                6. Todos
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
                break;
            case 4:
                insert();
                break;
            case 5:
                middleElement();
                break;
            case 6:
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

    private static void middleElement() {
        int size = (int) Utils.askNumber("Digite o tamanho para os vetores e árvores:");
        DataStructureComparison.compareGetMiddlePosition(size);

    }

    public static void first() {
        int numElements = (int) Utils.askNumber(null);
        System.out.println("Comparando o tempo de busca para o primeiro elemento");
        long startTime = System.currentTimeMillis();
        DataStructureComparison.compareQueryFromFirstElement(numElements);
        long endTime = System.currentTimeMillis();
        System.out.println("Tempo de execução para buscar o primeiro elemento: " + (endTime - startTime) + " ms");
    }

    public static void last() {
        int numElements = (int) Utils.askNumber(null);
        System.out.println("Comparando o tempo de busca para o último elemento");
        long startTime = System.currentTimeMillis();
        DataStructureComparison.compareQueryFromLastElement(numElements);
        long endTime = System.currentTimeMillis();
        System.out.println("Tempo de execução para buscar o último elemento: " + (endTime - startTime) + " ms");
    }

    public static void insert() {
        int numElements = (int) Utils.askNumber(null);
        System.out.println("Comparando tempos de inserção para " + numElements + " elementos:");

        int choise = (int) Utils.askNumber("[1] - Aleatoria \n[2] - Ordernada\n[3] -Inversamente Ordernada");

        switch (choise) {
            case 1:
                DataStructureComparison.compareStructures(numElements);
                break;
            case 2:
                DataStructureComparison.compareInsertionOrderning(numElements);
                break;
            case 3:
                DataStructureComparison.compareInsertionOrderningInvert(numElements);
                break;
            default:
                throw new AssertionError();
        }
    }

    public static void orderingAlgorithm() {
        int choise = (int) Utils.askNumber("[1] - Quick Sort \n[2] - Bubble Sort");

        int size = (int) Utils.askNumber("Digite o tamanho para os vetores e árvores:");

        Vector vector = new Vector(size);
        AVLTree<Integer> avlTree = new AVLTree<>();
        BinaryTree<Integer> binaryTree = new BinaryTree<>();

        vector.insertRandomElements(size);
        binaryTree.insertRandomElements(size);
        avlTree.insertRandomElements(size);

        switch (choise) {
            case 1:
                applyQuickSort(vector, avlTree, binaryTree);
                break;
            case 2:
                applyBubbleSort(vector, avlTree, binaryTree);
                break;
            default:
                System.out.println("Escolha inválida.");
                break;
        }
    }

    private static void applyQuickSort(Vector vector, AVLTree<Integer> avlTree, BinaryTree<Integer> binaryTree) {
        long startTime = System.currentTimeMillis();
        vector.quickSort();
        long endTime = System.currentTimeMillis();
        System.out.println("Tempo de execução do Quick Sort no vetor: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        avlTree.quickSort();
        endTime = System.currentTimeMillis();
        System.out.println("Tempo de execução do Quick Sort na AVL Tree: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        binaryTree.quickSort();
        endTime = System.currentTimeMillis();
        System.out.println("Tempo de execução do Quick Sort na Binary Tree: " + (endTime - startTime) + " ms");
    }

    private static void applyBubbleSort(Vector vector, AVLTree<Integer> avlTree, BinaryTree<Integer> binaryTree) {
        long startTime = System.currentTimeMillis();
        vector.bubbleSort();
        long endTime = System.currentTimeMillis();
        System.out.println("Tempo de execução do Bubble Sort no vetor: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        avlTree.bubbleSort();
        endTime = System.currentTimeMillis();
        System.out.println("Tempo de execução do Bubble Sort na AVL Tree: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        binaryTree.bubbleSort();
        endTime = System.currentTimeMillis();
        System.out.println("Tempo de execução do Bubble Sort na Binary Tree: " + (endTime - startTime) + " ms");
    }
}
