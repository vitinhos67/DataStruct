package Structure.Utils;

import java.util.Random;
import java.util.Scanner;

public class Utils {
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);
    public static int[] generateData(int num) {
        int[] data = new int[num];
        for (int i = 0; i < num; i++) {
            data[i] = random.nextInt();
        }
        return data;
    }

    public static int randomNumber(int qtd) {
        Random random = new Random();
        return random.nextInt(qtd);
    }

    public static long askNumber(String message) {

        if(message == null) {
            message = "Digite a quantidade:";
        }

        System.out.print(message);
        return scanner.nextLong();
    }
}
