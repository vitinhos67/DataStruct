
import Structure.Utils.Utils;

public class BinaryTree<T extends Comparable<T>> implements Operators<T> {

    private Node root;
    private final String name = "BinaryTree";

    public BinaryTree() {
    }

    @Override
    public void insert(T value) {
        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node node, T value) {
        if (node == null) {
            return new Node(value);
        }

        if (value.compareTo(node.value) < 0) {
            node.left = insertRecursive(node.left, value);
        } else if (value.compareTo(node.value) > 0) {
            node.right = insertRecursive(node.right, value);
        }

        return node;
    }

    public boolean search(T value) {
        return searchRecursive(root, value);
    }

    private boolean searchRecursive(Node node, T value) {
        if (node == null) {
            return false;
        }
        if (node.value.equals(value)) {
            return true;
        }

        return value.compareTo(node.value) < 0
                ? searchRecursive(node.left, value)
                : searchRecursive(node.right, value);
    }

    public void insertRandomElements(int size) {
        for (int i = 0; i < size; i++) {
            int random = Utils.randomNumber(100);
            insert((T) Integer.valueOf(random));
        }
    }

    @Override
    public T firstElement() {
        Node current = root;
        while (current != null && current.left != null) {
            current = current.left;
        }
        return current != null ? current.value : null;
    }

    @Override
    public T lastElement() {
        Node current = root;
        while (current != null && current.right != null) {
            current = current.right;
        }
        return current != null ? current.value : null;
    }

    @Override
    public T middleElement() {
        return root != null ? root.value : null;
    }

    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.value);
            inOrderTraversal(node.right);
        }
    }

    // Função para imprimir o array
    public void printArray() {
        System.out.println("Árvore em ordem (in-order traversal):");
        printArrayRecursive(root);
        System.out.println();
    }

    private void printArrayRecursive(Node node) {
        if (node != null) {
            printArrayRecursive(node.left);
            System.out.print(node.value + " ");
            printArrayRecursive(node.right);
        }
    }

    public void bubbleSort() {
        root = bubbleSortRecursive(root);
    }

    private Node bubbleSortRecursive(Node node) {
        if (node == null) {
            return null;
        }
        if (node.left != null && node.left.value.compareTo(node.value) > 0) {
            // Swap values
            T temp = node.value;
            node.value = node.left.value;
            node.left.value = temp;
            node.left = bubbleSortRecursive(node.left);
        }
        if (node.right != null && node.right.value.compareTo(node.value) < 0) {
            T temp = node.value;
            node.value = node.right.value;
            node.right.value = temp;
            node.right = bubbleSortRecursive(node.right);
        }
        return node;
    }

    public void quickSort() {
        root = quickSortRecursive(root);
    }

    private Node quickSortRecursive(Node node) {
        if (node == null) {
            return null;
        }
        node.left = quickSortRecursive(node.left);
        node.right = quickSortRecursive(node.right);

        // Partition the node
        if (node.left != null && node.left.value.compareTo(node.value) > 0) {
            T temp = node.value;
            node.value = node.left.value;
            node.left.value = temp;
        }
        if (node.right != null && node.right.value.compareTo(node.value) < 0) {
            T temp = node.value;
            node.value = node.right.value;
            node.right.value = temp;
        }
        return node;
    }

    public String getName() {
        return name;
    }

    private class Node {

        T value;
        Node left, right;

        Node(T value) {
            this.value = value;
            left = right = null;
        }
    }
}
