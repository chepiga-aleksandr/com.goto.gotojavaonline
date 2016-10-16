package Task3;

public class Runner {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.add(9);
        tree.add(7);
        tree.add(12);

        boolean contains = tree.contains(7);

        System.out.println(contains);
    }
}


