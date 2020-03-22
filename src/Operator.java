public class Operator implements Cloneable{

    private int row;
    private int col;
    private int value;

    public Operator(int row,int column, int value)
    {
        if(row >= 0 && row <=4 && column >=0 && column <=4)
        {
            if (value <= 12 && value >= 1)
            {
                this.row = row;
                this.col = column;
                this.value = value;
            }
        }
    }

    public Operator()
    {
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getValue() {
        return value;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString()
    {
        return "row:" + row + " colomn: " + col + " value: " + value + "\n";
    }

    protected Object clone(){
       Operator temp  = new Operator();
       temp.setCol(col);
       temp.setRow(row);
       temp.setValue(value);
       return temp;
    }
}
