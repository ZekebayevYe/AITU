package models;
import java.util.ArrayList;
public class Shape {
//making an array that stores points
    ArrayList<Point> points = new ArrayList<>();

   //func or method that adding points
    public void addPoint(Point point){
        points.add(point);
    }

   //the name of method is actually dont need explain
    public double calculatePerimeter(){
        double peri=0;
        int size = points.size();

        for (int i = 0; i < size; i++) {
            Point destPoint= points.get(i);
            Point nextPoint =points.get((i+1)%size);

            peri+=destPoint.distance(nextPoint);

        }
        return peri;
    }

    public double getAverageSide(){
       int size= points.size();
        return calculatePerimeter()/size;
    }

    public  double getLongestSide(){
        double longSide=0;
        for (int i = 0; i < points.size(); i++) {
            Point destPoint= points.get(i);
            Point nextPoint =points.get((i+1)% points.size());
            double destSide=destPoint.distance(nextPoint);
            if(destSide>longSide){
                longSide=destSide;
            }

        }
        return longSide;
    }


}
