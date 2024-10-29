import Structure.Utils.Utils;

interface Operators<T> {
    void insert(T value);
    T firstElement();
    T lastElement();
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

    private static long measureInsertionTime(Operators<Integer> structure, int[] data) {
        long start = System.nanoTime();
        for (int value : data) {
            structure.insert(value);
        }
        return System.nanoTime() - start;
    }

    private static long measureSearchFirstTime(Operators<Integer> structure) {
        long start = System.nanoTime();
        Integer firstElement = structure.firstElement();
        return System.nanoTime() - start;
    }

    private static long measureSearchLastTime(Operators<Integer> structure) {
        long start = System.nanoTime();
        Integer lastElement = structure.lastElement();
        return System.nanoTime() - start;
    }

}
