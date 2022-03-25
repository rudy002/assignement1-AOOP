package mobility;

public class Point {
    private int x,y;

    static private final int maxX = 800;
    static private final int maxY = 600;
    public Point(int x, int y)
    {
        if(0<x && x<maxX)
            this.x=x;
        if(0<y && y<maxY)
            this.y=y;
    }


    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }


    public int getX()
    {
        return this.x;
    }
    public void setX(int x)
    {
        this.x = x;
    }
    public int getY()
    {
        return this.y;
    }
    public void setY(int y)

    {
        this.y = y;
    }
    public int getMaxX() {return maxX;}
    public int getMaxY() {return maxY;}
    public static boolean checkBoundaries(Point pointToCheck)
    {
        return pointToCheck.x <= 800 && pointToCheck.x >= 0 && pointToCheck.y <= 600 && pointToCheck.y >= 0;
    }


}
