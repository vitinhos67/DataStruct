import Structure.Utils.Utils;
import java.util.ArrayList;

public class AVLTree<T extends Comparable<T>> implements Operators<T> {
    private Node root;
    private final String name = "AVLTree";
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

    // Bubble Sort baseado na comparação dos valores dos nós
    public void bubbleSort() {
        if (root == null) return;

        boolean swapped;
        do {
            swapped = false;
            Node current = root;
            while (current != null && current.right != null) {
                if (current.value.compareTo(current.right.value) > 0) {
                    T temp = current.value;
                    current.value = current.right.value;
                    current.right.value = temp;
                    swapped = true;
                }
                current = current.right;
            }
        } while (swapped);
    }

    public void quickSort() {
        quickSort(root, findMax(root));
    }
    
    public void quickSort(Node low, Node high) {
        // Modificando a condição de parada para evitar recursão infinita
        if (low != null && high != null && low != high && low != high.right && low != high.left) {
            Node pi = partition(low, high);
    
            quickSort(low, pi); // Ordena a subárvore à esquerda do pivô
            quickSort(pi.right, high); // Ordena a subárvore à direita do pivô
        }
    }
    
    private Node partition(Node low, Node high) {
        T pivot = high.value;
        Node i = low;
        Node j = low;
    
        while (j != high) {
            if (j.value.compareTo(pivot) <= 0) {
                T temp = i.value;
                i.value = j.value;
                j.value = temp;
                i = i.right;
            }
            j = j.right;
        }
    
        T temp = i.value;
        i.value = high.value;
        high.value = temp;
    
        return i;
    }
    
    private Node findMax(Node root) {
        Node current = root;
        while (current != null && current.right != null) {
            current = current.right;
        }
        return current;
    }

    @Override
    public void insert(T value) {
        root = insertRecursive(root, value);
    }

    public void insertRandomElements(int size) {
        for (int i = 0; i < size; i++) {
            int random = Utils.randomNumber(100);
            insert((T) Integer.valueOf(random));
        }
    }

    private Node insertRecursive(Node node, T value) {
        if (node == null)
            return new Node(value);

        if (value.compareTo(node.value) < 0) {
            node.left = insertRecursive(node.left, value);
        } else if (value.compareTo(node.value) > 0) {
            node.right = insertRecursive(node.right, value);
        } else {
            return node; // Evita duplicatas
        }

        node.height = 1 + max(height(node.left), height(node.right));
        int balance = balanceFactor(node);

        // Casos de rotação
        if (balance > 1 && value.compareTo(node.left.value) < 0)
            return rightRotation(node);
        if (balance < -1 && value.compareTo(node.right.value) > 0)
            return leftRotation(node);
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
        if (node == null)
            return false;
        if (node.value.equals(value))
            return true;
        return value.compareTo(node.value) < 0 ? searchRecursive(node.left, value) : searchRecursive(node.right, value);
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

    // Exibe a árvore em ordem
    public void printArray() {
        ArrayList<T> elements = new ArrayList<>();
        inOrderTraversal(root, elements);
        System.out.println(elements);
    }

    // Travessia in-order
    private void inOrderTraversal(Node node, ArrayList<T> elements) {
        if (node == null) return;
        
        inOrderTraversal(node.left, elements);  // Percorre a subárvore esquerda
        elements.add(node.value);               // Adiciona o valor do nó na lista
        inOrderTraversal(node.right, elements); // Percorre a subárvore direita
    }

    public String getName() {
        return name;
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
