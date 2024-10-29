public class Main {
    public static void main(String[] args) {
        int numElements = 1000;  // Número de elementos para inserir

        System.out.println("Comparando tempos de inserção para " + numElements + " elementos:");
        DataStructureComparison.compareStructures(numElements);
    }
}
