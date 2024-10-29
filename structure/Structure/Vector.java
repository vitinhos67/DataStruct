import Structure.Utils.Utils;
import java.util.Arrays;

interface Operators<T> {
    void insert(T value);
    T firstElement();
    T lastElement();
}

public class Vector implements Operators<Integer> {
    private int[] array;
    private int size;

    public Vector(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    @Override
    public void insert(Integer value) {
        if (size < array.length) {
            array[size++] = value;
        } else {
            System.out.println("Vector is full.");
        }
    }

    // Bubble Sort
    public void bubbleSort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void insertRandomElements(int size) {
        for (int i = 0; i < size; i++) {
            int random = Utils.randomNumber(100);
            insert(random);
        }
    }

    // Insertion Sort
    public void insertionSort() {
        for (int i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public int sequentialSearch(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int value) {
        Arrays.sort(array, 0, size);
        int left = 0;
        int right = size - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == value) return mid;
            if (array[mid] < value) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    @Override
    public Integer firstElement() {
        return size > 0 ? array[0] : -1;
    }

    @Override
    public Integer lastElement() {
        return size > 0 ? array[size - 1] : -1;
    }

    public int middleElement() {
        return size > 0 ? array[size / 2] : -1;
    }
    
    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
