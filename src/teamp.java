import java.util.ArrayList;
import java.util.List;

public class teamp {

    public static void main(String[] args) throws CloneNotSupportedException {
        int[][] temnp = {{-1, 1, 2, -1}, {6, 4, 9, 7}, {5, 10, 3, 8}, {-1, 11, 12, -1}};
        Condition condition = new Condition();
        condition.setTable(temnp);
        System.out.println(condition.result());
        Problem p = new Problem();
        System.out.println(search(p));
    }

    private static boolean search(Problem p) throws CloneNotSupportedException {
        Node temp = new Node(p.getStatingCondition(), null, p.getAllOperators(), null);
        Node node = new Node(p.getStatingCondition(), null, temp.useableOperator(p.getStatingCondition()), null);
        while (true) {
            node.setOperators(node.useableOperator(node.getCondition()));
            if (node.getCondition().result()) {
                node.getCondition().view();
                System.out.println(result(node));
                return true;
            }
            if (!node.getOperators().isEmpty()) {
                Operator o = node.removeOperator();
                Condition newCondition = node.use(node.getCondition(), o);
                System.out.println(node.useableOperator(newCondition));
                node = new Node(newCondition, node, node.useableOperator(newCondition), o);
                System.out.println("New node was created");
            } else {
                if (node.getParent() != null) {
                    node = node.getParent();
                } else {
                    return false;
                }
            }
        }
    }

    private static List<Operator> result(Node node)
    {
        List<Operator> result = new ArrayList<>();
        while (node.getParent()!=null)
        {
            result.add(node.getCreator());
            node = node.getParent();
        }
        return result;
    }
}
