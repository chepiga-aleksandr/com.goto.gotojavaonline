package Task3;

public class Node {

    private Node right;
    private Node left;
    private int key;

    public Node(int k) {
        key = k;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public int getKey() {
        return key;
    }

    @Override
    public String toString() {
        return String.valueOf(key);
    }
}

