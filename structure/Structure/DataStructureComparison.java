import java.util.Random;
import java.util.Vector;

interface Insertable<T> {
    void insert(T value);
}

public class DataStructureComparison<T> {
    private static final Random random = new Random();

    public static void compareStructures(int numElements) {
        int[] data = generateData(numElements);

        // Cria e mede o tempo de inserção para cada estrutura de dados
        Vector<Integer> vector = new Vector<>(numElements);
        long vectorInsertTime = measureInsertionTime(new VectorInsertable(vector), data);

        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        long binaryTreeInsertTime = measureInsertionTime(binaryTree, data);

        AVLTree<Integer> avlTree = new AVLTree<>();
        long avlTreeInsertTime = measureInsertionTime(avlTree, data);


        System.out.println("Vector Insert Time: " + vectorInsertTime + " ns");
        System.out.println("BinaryTree Insert Time: " + binaryTreeInsertTime + " ns");
        System.out.println("AVLTree Insert Time: " + avlTreeInsertTime + " ns");
    }

    private static long measureInsertionTime(Insertable<Integer> structure, int[] data) {
        long start = System.nanoTime();
        for (int value : data) {
            structure.insert(value);
        }
        return System.nanoTime() - start;
    }

    private static int[] generateData(int num) {
        int[] data = new int[num];
        for (int i = 0; i < num; i++) {
            data[i] = random.nextInt();
        }
        return data;
    }
    static class VectorInsertable implements Insertable<Integer> {
        private final Vector<Integer> vector;

        public VectorInsertable(Vector<Integer> vector) {
            this.vector = vector;
        }

        @Override
        public void insert(Integer value) {
            vector.add(value);
        }
    }
}
