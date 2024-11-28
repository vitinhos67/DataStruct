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

    public void insertRandomElementsWithExcludeValue(int size, int exclude) {
        for (int i = 0; i < size; i++) {
            int random;
            do {
                random = Utils.randomNumber(100);
            } while (random == exclude); 
            insert((T) Integer.valueOf(random));
        }
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
        return root != null ? root.value : null; // Retorna a raiz como "meio"
    }

    public void inOrderTraversal() {
        System.out.println("Árvore em ordem (in-order traversal):");
        inOrderRecursive(root);
        System.out.println();
    }

    private void inOrderRecursive(Node node) {
        if (node != null) {
            inOrderRecursive(node.left);
            System.out.print(node.value + " ");
            inOrderRecursive(node.right);
        }
    }

    public int size() {
        return sizeRecursive(root);
    }

    private int sizeRecursive(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + sizeRecursive(node.left) + sizeRecursive(node.right);
    }

    public int height() {
        return heightRecursive(root);
    }

    private int heightRecursive(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(heightRecursive(node.left), heightRecursive(node.right));
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
