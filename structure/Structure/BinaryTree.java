public class BinaryTree<T extends Comparable<T>> implements Operators<T> {
    private Node root;

    public BinaryTree() {
    }

    @Override
    public void insert(T value) {
        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node node, T value) {
        if (node == null) return new Node(value);

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
        if (node == null) return false;
        if (node.value.equals(value)) return true;

        return value.compareTo(node.value) < 0
                ? searchRecursive(node.left, value)
                : searchRecursive(node.right, value);
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

    private class Node {
        T value;
        Node left, right;

        Node(T value) {
            this.value = value;
            left = right = null;
        }
    }
}
