import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyAplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\erazz\\IdeaProjects\\untitled\\Assignment 1\\src\\source.txt");

        Scanner sc = new Scanner(file);
        Shape shape = new Shape();
        Point destPoint = null;
        Point PrevPoint = null;

        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            Point point = new Point(x, y);

            shape.addPoint(point);

            if (PrevPoint != null) {
                double distance = PrevPoint.distance(point);
            } else {
                destPoint = point;
            }

            //Updating the previous point to the current point
            PrevPoint = point;
        }
        if (PrevPoint != null && destPoint != null) {
            double distance = PrevPoint.distance(destPoint);
        }
        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.getAverageSide());
        System.out.println(shape.getLongestSide());

    }
}

