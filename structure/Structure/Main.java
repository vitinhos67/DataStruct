public class Main {
    public static void main(String[] args) {
        int numElements = 1000;
        System.out.println("Comparando tempos de inserção para " + numElements + " elementos:");
        DataStructureComparison.compareStructures(numElements);

        System.out.println("Comparando o tempo de busca para o primeiro elemento");
        DataStructureComparison.compareQueryFromFirstElement(numElements);

        System.out.println("Comparando o tempo de busca para o ultimo elemento");
        DataStructureComparison.compareQueryFromLastElement(numElements);

    }
}
