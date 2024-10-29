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
}
