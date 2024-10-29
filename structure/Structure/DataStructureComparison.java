
import java.util.Random;


public class DataStructureComparison {
    private static final Random random = new Random();

    public static int[] generateData(int numElements) {
        int[] data = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            data[i] = random.nextInt();
        }
        return data;
    }


}
