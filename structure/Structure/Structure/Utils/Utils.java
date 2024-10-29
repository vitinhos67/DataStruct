package Structure.Utils;

import java.util.Random;

public class Utils {

    private static final Random random = new Random();
    public static int[] generateData(int num) {
        int[] data = new int[num];
        for (int i = 0; i < num; i++) {
            data[i] = random.nextInt();
        }
        return data;
    }
}
