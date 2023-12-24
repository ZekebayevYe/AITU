package models;
public class Point {
    private double x;
    private double y;
     public Point(double x,double y){
    //stupid part i know but dont know how to do it without it
         this.x=x;
         this.y=y;
     }


    public String toString() {
        return x + ", " + y;
    }

    public double distance(Point dest) {
        double xDistance=this.x-dest.x;
        double yDistance=this.y-dest.y;

        return Math.sqrt(xDistance*xDistance+yDistance*yDistance);
    }
}
