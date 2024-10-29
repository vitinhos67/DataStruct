public class AVLTree<T extends Comparable<T>> implements Insertable<T> {
    private Node root;

    public AVLTree() {
    }

    private int height(Node node) {
        return node == null ? 0 : node.height;
    }

    private int max(int a, int b) {
        return Math.max(a, b);
    }

    private Node rightRotation(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        return x;
    }

    private Node leftRotation(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        return y;
    }

    private int balanceFactor(Node node) {
        return node == null ? 0 : height(node.left) - height(node.right);
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
        } else {
            return node;
        }

        node.height = 1 + max(height(node.left), height(node.right));
        int balance = balanceFactor(node);

        if (balance > 1 && value.compareTo(node.left.value) < 0) return rightRotation(node);
        if (balance < -1 && value.compareTo(node.right.value) > 0) return leftRotation(node);
        if (balance > 1 && value.compareTo(node.left.value) > 0) {
            node.left = leftRotation(node.left);
            return rightRotation(node);
        }
        if (balance < -1 && value.compareTo(node.right.value) < 0) {
            node.right = rightRotation(node.right);
            return leftRotation(node);
        }

        return node;
    }

    public boolean search(T value) {
        return searchRecursive(root, value);
    }

    private boolean searchRecursive(Node node, T value) {
        if (node == null) return false;
        if (node.value.equals(value)) return true;
        return value.compareTo(node.value) < 0 ? searchRecursive(node.left, value) : searchRecursive(node.right, value);
    }

    public T firstElement() {
        Node current = root;
        while (current != null && current.left != null) {
            current = current.left;
        }
        return current != null ? current.value : null;
    }

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
        int height;

        Node(T value) {
            this.value = value;
            left = right = null;
            height = 1;
        }
    }
}
