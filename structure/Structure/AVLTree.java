public class AVLTree {
    Node root;

    private int height(Node node) {
        return node == null ? 0 : node.height;
    }

    private int max(int a, int b) {
        return (a > b) ? a : b;
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

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node node, int value) {
        if (node == null) return new Node(value);

        if (value < node.value) node.left = insertRecursive(node.left, value);
        else if (value > node.value) node.right = insertRecursive(node.right, value);
        else return node;

        node.height = 1 + max(height(node.left), height(node.right));

        int balance = balanceFactor(node);

        if (balance > 1 && value < node.left.value) return rightRotation(node);
        if (balance < -1 && value > node.right.value) return leftRotation(node);
        if (balance > 1 && value > node.left.value) {
            node.left = leftRotation(node.left);
            return rightRotation(node);
        }
        if (balance < -1 && value < node.right.value) {
            node.right = rightRotation(node.right);
            return leftRotation(node);
        }
        return node;
    }

    public boolean search(int value) {
        return searchRecursive(root, value);
    }

    private boolean searchRecursive(Node node, int value) {
        if (node == null) return false;
        if (node.value == value) return true;
        return value < node.value ? searchRecursive(node.left, value) : searchRecursive(node.right, value);
    }

    public int firstElement() {
        Node current = root;
        while (current != null && current.left != null) {
            current = current.left;
        }
        return current != null ? current.value : -1;
    }

    public int lastElement() {
        Node current = root;
        while (current != null && current.right != null) {
            current = current.right;
        }
        return current != null ? current.value : -1;
    }

    public int middleElement() {
        return root != null ? root.value : -1;
    }
}
