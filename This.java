class Point {
    int x,y;



Point(int x,int y) {

    this.x = x;
    this.y = y;

}

void print() {
    System.out.println(x + " " + y);
}
}

public class This {
    
    public static void main(String[] args) {

        Point p1 = new Point(10, 20);
        Point p2 = new Point(5,15);

    }
    // p1.Point();
    // p1.print();

}
