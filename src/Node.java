import java.util.ArrayList;
import java.util.List;

public class Node implements Cloneable{

    private Condition condition;
    private Node parent;
    private List<Operator> operators =  new ArrayList<Operator>();
    private Operator creator;

    public Node(Condition condition, Node parent, List<Operator> operators, Operator creator) throws CloneNotSupportedException {
        this.condition = (Condition) condition.clone();
        this.operators.addAll(operators);
        this.parent = parent;
        if (creator != null)
        {
            this.creator = (Operator) creator.clone();
        }
    }

    public Operator removeOperator()
    {
        return operators.remove(0);
    }

    public Condition getCondition() {
        return condition;
    }

    public Node getParent() {
        return parent;
    }

    public List<Operator> getOperators() {
        return operators;
    }

    public Operator getCreator() {
        return creator;
    }

    public void setOperators(List<Operator> operators) {
        this.operators = operators;
    }

    public List<Operator> getResult(Node node)
    {
        List<Operator> temp  = new ArrayList<>();
        for (Node i = node;node.getParent()!=null;i=i.getParent())
        {
            temp.add(i.getCreator());
        }
        return temp;
    }

    public Condition use(Condition condition,Operator operator) throws CloneNotSupportedException {
        Condition temp = (Condition) condition.clone();
        temp.getTable()[operator.getRow()][operator.getCol()] = operator.getValue();
        return temp;
    }

    private boolean contains(Operator o, Condition condition)
    {
        boolean ret = false;
        for (int i=0;i<4;i++)
        {
            for(int j=0; j<4;j++)
            {
                if (condition.getTable()[i][j] == o.getValue())
                    ret = true;
            }
        }
        return ret;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean usable(Operator o, Condition c)
    {
        if (o.getValue()!=-1)
        {
            if (c.getTable()[o.getRow()][o.getCol()] == 0 && !contains(o,c))
            {
                return true;
            }
            else
            {
                return false;
            }
        }else {
            return false;
        }
    }

    public List<Operator> useableOperator(Condition c)
    {
        List<Operator> ret = new ArrayList<>();
        for (Operator i:operators)
        {
            if (usable(i,c))
                ret.add(i);
        }
        return ret;
    }
}
