package mobility;

import java.awt.*;

public abstract class Mobile implements Ilocable{
    private Point location;//current Location
    private double totalDistance;//Distance the object traveled

    public Mobile(Point obj){
        this.location.setX(obj.getX());
        this.location.setY(obj.getY());

    }
}
