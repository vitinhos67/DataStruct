
import Structure.Utils.Utils;
import java.util.Scanner;

interface Operators<T> {

    void insert(T value);

    T firstElement();

    T lastElement();

    T middleElement();

    void insertRandomElements(int num);

    String getName();
    default void insertRandomElementsWithExludeValue(int size, int exclude) {}
    default void insertAtFirst(int num) {}
    default void insertAtIndex(int position, int num) {}

}
public class DataStructureComparison {

    public static void compareStructures(int numElements) {
        int[] data = Utils.generateData(numElements);

        Vector vector = new Vector(numElements);
        long vectorInsertTime = measureInsertionTime(vector, data);

        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        long binaryTreeInsertTime = measureInsertionTime(binaryTree, data);

        AVLTree<Integer> avlTree = new AVLTree<>();
        long avlTreeInsertTime = measureInsertionTime(avlTree, data);

        System.out.println("Vector Insert Time: " + vectorInsertTime + " ns");
        System.out.println("BinaryTree Insert Time: " + binaryTreeInsertTime + " ns");
        System.out.println("AVLTree Insert Time: " + avlTreeInsertTime + " ns");
    }

    public static void compareInsertionOrderning(int numElements) {
        Vector vector = new Vector(numElements);
        insertionOrderning(vector, numElements);

        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        insertionOrderning(binaryTree, numElements);

        AVLTree<Integer> avlTree = new AVLTree<>();
        insertionOrderning(avlTree, numElements);
    }

    public static void compareInsertionOrderningInvert(int numElements) {
        Vector vector = new Vector(numElements);
        insertionOrderningInvert(vector, numElements);

        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        insertionOrderningInvert(binaryTree, numElements);

        AVLTree<Integer> avlTree = new AVLTree<>();
        insertionOrderningInvert(avlTree, numElements);
    }

    private static void insertionOrderning(Operators<Integer> strucutre, int num) {
        long start = System.nanoTime();
        for (int i = 0; i < num; i++) {
            strucutre.insert(i);
        }
        System.out.println(strucutre.getName() + " Insert Time: " + (System.nanoTime() - start) + " ns");
    }

    private static void insertionOrderningInvert(Operators<Integer> strucutre, int num) {
        long start = System.nanoTime();
        for (int i = num; i != 0; i--) {
            strucutre.insert(i);
        }
        System.out.println(strucutre.getName() + " Insert Time: " + (System.nanoTime() - start) + " ns");
    }

    public static void compareQueryFromFirstElement(int numElements) {

        Vector vector = new Vector(numElements);
        long vectorInsertTime = measureSearchFirstTime(vector);

        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        long binaryTreeInsertTime = measureSearchFirstTime(binaryTree);

        AVLTree<Integer> avlTree = new AVLTree<>();
        long avlTreeInsertTime = measureSearchFirstTime(avlTree);

        System.out.println("Vector Insert Time: " + vectorInsertTime + " ns");
        System.out.println("BinaryTree Insert Time: " + binaryTreeInsertTime + " ns");
        System.out.println("AVLTree Insert Time: " + avlTreeInsertTime + " ns");

    }

    public static void compareQueryFromLastElement(int numElements) {

        Vector vector = new Vector(numElements);
        long vectorInsertTime = measureSearchLastTime(vector);

        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        long binaryTreeInsertTime = measureSearchLastTime(binaryTree);

        AVLTree<Integer> avlTree = new AVLTree<>();
        long avlTreeInsertTime = measureSearchLastTime(avlTree);

        System.out.println("Vector Insert Time: " + vectorInsertTime + " ns");
        System.out.println("BinaryTree Insert Time: " + binaryTreeInsertTime + " ns");
        System.out.println("AVLTree Insert Time: " + avlTreeInsertTime + " ns");

    }

    public static void compareGetMiddlePosition(int num) {
        Vector vector = new Vector(num);
        insertRandomElements(vector, num);
        long vectorInsertTime = measureSearchMiddle(vector);

        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        insertRandomElements(binaryTree, num);
        long binaryTreeInsertTime = measureSearchMiddle(binaryTree);

        AVLTree<Integer> avlTree = new AVLTree<>();
        insertRandomElements(avlTree, num);
        long avlTreeInsertTime = measureSearchMiddle(avlTree);

        System.out.println("Vector Insert Time: " + vectorInsertTime + " ns");
        System.out.println("BinaryTree Insert Time: " + binaryTreeInsertTime + " ns");
        System.out.println("AVLTree Insert Time: " + avlTreeInsertTime + " ns");

    }

    public static void compareSearchToValue(int size, int value, int position, int inexistentValue) {

        Vector vector = new Vector(size);
        if(inexistentValue == 1) {
            switch (position) {
                case 1:
                    insertOnFisrtPosition(vector, value);
                    break;
                case 2:
                    insertOnLastPosition(vector, value);
                    break;
                case 3:
                    insertOnRandomPosition(vector, value);
                    break;
                default:
                    break;
            }
        }

        insertRandomElementsWithExludeValue(vector, size - 1, value);

        long start = System.nanoTime();
        vector.sequentialSearch(value);
        long vectorInsertTime = System.nanoTime() - start;

        System.out.println("Vector search Time: " + vectorInsertTime + " ns");
    }
    private static void insertOnFisrtPosition(Operators<Integer> structure, int data) {
        structure.insertAtFirst(data);
    }

    private static void insertOnLastPosition(Operators<Integer> structure, int data) {
        structure.insert(data);
    }

    private static void insertOnRandomPosition(Operators<Integer> structure, int data) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a posição:");
        int position = scanner.nextInt();
        structure.insertAtIndex(position, data);
        scanner.close();
    }

    private static long measureInsertionTime(Operators<Integer> structure, int[] data) {
        long start = System.nanoTime();
        for (int value : data) {
            structure.insert(value);
        }
        return System.nanoTime() - start;
    }

    private static long measureSearchFirstTime(Operators<Integer> structure) {
        long start = System.nanoTime();
        structure.firstElement();
        return System.nanoTime() - start;
    }

    private static long measureSearchLastTime(Operators<Integer> structure) {
        long start = System.nanoTime();
        structure.lastElement();
        return System.nanoTime() - start;
    }

    private static long measureSearchMiddle(Operators<Integer> structure) {
        long start = System.nanoTime();
        structure.middleElement();
        return System.nanoTime() - start;
    }

    private static void insertRandomElements(Operators<Integer> structure, int num) {
        structure.insertRandomElements(num);
    }

    private static void insertRandomElementsWithExludeValue(Operators<Integer> structure, int size, int exclude) {
        structure.insertRandomElementsWithExludeValue(size, exclude);
    }
}
