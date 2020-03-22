import java.util.ArrayList;
import java.util.List;

public class Problem {

    List<Operator> allOperators = new ArrayList<Operator>();
    Condition statingCondition;

    public Problem()
    {
        statingCondition = new Condition();
        for(int i=0;i<4;i++)
        {
            for (int j=0;j<4;j++)
            {
                for(int k=1;k<13;k++)
                {
                    allOperators.add(new Operator(i,j,k));
                }
            }
        }
    }

    public List<Operator> getAllOperators() {
        return allOperators;
    }

    public void setAllOperators(List<Operator> allOperators) {
        this.allOperators = allOperators;
    }

    public Condition getStatingCondition() {
        return statingCondition;
    }

    public void setStatingCondition(Condition statingCondition) {
        this.statingCondition = statingCondition;
    }
}
