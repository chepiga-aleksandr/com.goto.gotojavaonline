package Practice5.Task3;

public class BinaryTree {

    private Node head;

    public void add(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            addToTree(head, value);
        }
    }

    private void addToTree(Node node, int value) {
        if (value - node.getKey() < 0) {
            if(node.getLeft() == null) {
                node.setLeft(new Node(value));
            } else addToTree(node.getLeft(), value);
        } else {
            if(node.getRight() == null) {
                node.setRight(new Node(value));
            }
        }
    }

    public boolean contains(int value) {
        Node current = head;

        while (current != null) {
            int result = current.getKey() - value;

            if (result > 0) {
                current = current.getLeft();
            } else if (result < 0) {
                current = current.getRight();
            } else
                break;
        }

        return current != null;
    }
}
