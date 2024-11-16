import Structure.Utils.Utils;

interface Operators<T> {
    void insert(T value);
    T firstElement();
    T lastElement();
    T middleElement();
    void insertRandomElements(int num);
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

    public static  void compareGetMiddlePosition(int num) {
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
}
