public class Node {
    int value;
    Node left, right;
    int height;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
        this.height = 1;
    }
}
