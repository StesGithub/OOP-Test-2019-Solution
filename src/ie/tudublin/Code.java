package ie.tudublin;

import processing.data.TableRow;

public class Code
{
    public int r;
    public int g;
    public int b;
    public int num;

    public Code(int r, int g, int b, int num)
    {
        this.r = r;
        this.g = g;
        this.b = b;
        this.num = num;
    }

    public Code(TableRow tr)
    {
        this(tr.getInt("r"), tr.getInt("g"), tr.getInt("b"), tr.getInt("num"));
    }
}