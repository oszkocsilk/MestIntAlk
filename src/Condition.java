public class Condition implements Cloneable{

    private int[][] table = {{-1,0,0,-1},{0,0,0,0},{0,0,0,0},{-1,0,0,-1}};

    public Condition(Condition condition)
    {
        this.table = condition.table;
    }

    public Condition(){}

    public Condition startingCondition()
    {
        return new Condition();
    }

    public boolean result()
    {
        int sum = 0;
        for (int i=0; i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                sum = sum + table[i][j];
            }
        }
        if(sum == 74)
        {
            //table[1][0]+table[1][1] + table[1][2] + table[1][3] =26;
            if(table[1][1] +  table [1][2] + table[2][1] + table[2][2] == 26 &&
                    table[0][1]+table[0][2] + table[3][1]+table[3][2] == 26 &&
                    table[1][0] + table[2][0] + table[2][3] + table[1][3] == 26 &&
                    table[0][1] + table[1][1] + table[2][1] + table[3][1] == 26 &&
                    table[0][2] + table[1][2] + table[2][2] + table[3][2] == 26 &&
                    table[1][0]+table[1][1] + table[1][2] + table[1][3] ==26)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    public void setTable( int[][] table)
    {
        this.table = table;
    }

    public int[][] getTable() {
        return table;
    }

    public void view() {
        for (int i=0;i<4;i++)
        {
            for (int j=0;j<4;j++)
            {
                System.out.print(" "+ table[i][j]);
            }
            System.out.println();
        }
    }
    protected Object clone(){
        Condition ret = new Condition();
        for(int i=0;i<4;i++){
            for (int j=0;j<4;j++)
            {
                ret.getTable()[i][j] = table[i][j];
            }
        }
        return ret;
    }
}