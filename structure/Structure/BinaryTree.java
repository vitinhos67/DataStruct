public class BinaryTree {
    Node root;

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node node, int value) {
        if (node == null) return new Node(value);

        if (value < node.value) node.left = insertRecursive(node.left, value);
        else if (value > node.value) node.right = insertRecursive(node.right, value);

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
