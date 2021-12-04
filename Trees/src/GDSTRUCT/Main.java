package GDSTRUCT;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(89);
        tree.insert(84);
        tree.insert(67);
        tree.insert(84);
        tree.insert(29);
        tree.insert(23);
        tree.insert(19);
        tree.insert(59);

        tree.traverseInOrderDescending();
        System.out.println("Highest value: " + tree.getMax());
        System.out.println("Lowest value: " + tree.getMin());
        System.out.println(tree.get(67));
    }
}
