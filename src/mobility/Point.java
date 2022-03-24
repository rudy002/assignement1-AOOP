package mobility;

public class Point {
    private int x,y;

    public Point(int x, int y){
        if(x >= 0 && x<= 800 && y >= 0 && y<= 600){
            this.x = x;
            this.y = y;
        }
    }
    public int getX(){return x;}
    public int getY(){return y;}
    public void setX(int xx){this.x = xx;}
    public void setY(int yy){this.x = yy;}

}
