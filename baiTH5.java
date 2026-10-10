import java.util.*;

class Point {
    private double x, y;

    public Point() {
        this.x = 0; 
        this.y = 0;
    }
    public Point(double x, double y) {
        this.x = x; 
        this.y = y;
    }
    public Point(Point p) {
        this.x = p.x; 
        this.y = p.y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public double distance(Point secondPoint){
        double dx = x - secondPoint.x , dy = y - secondPoint.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public static double distance(Point p1, Point p2 ){
        return p1.distance(p2);
    }
    @Override 
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

public class baiTH5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            Point c = new Point(sc.nextDouble(), sc.nextDouble());

            double cross = (b.getX() - a.getX()) * (c.getY() - a.getY()) - (b.getY() - a.getY()) * (c.getX() - a.getX());
            
            if (Math.abs(cross) < 1e-9) {
                System.out.println("INVALID");
            } else {
                double p = Point.distance(a, b) + Point.distance(b, c) + Point.distance(c, a);
                System.out.printf("%.3f\n", p);
            }
        }   
    }
}
