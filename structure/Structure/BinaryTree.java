import Structure.Utils.Utils;
import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T extends Comparable<T>> implements Operators<T> {
    private Node root;

    public BinaryTree() {
    }

    @Override
    public void insert(T value) {
        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node node, T value) {
        if (node == null)
            return new Node(value);

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
        if (node == null)
            return false;
        if (node.value.equals(value))
            return true;

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

    public T middleElement() {
        return root != null ? root.value : null;
    }

    public void inOrderTraversal(Node node, List<T> list) {
        if (node != null) {
            inOrderTraversal(node.left, list);
            list.add(node.value);
            inOrderTraversal(node.right, list);
        }
    }

    public List<T> sortedElements() {
        List<T> sortedList = new ArrayList<>();
        inOrderTraversal(root, sortedList);
        return sortedList;
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
