public class Main {
    public static void main(String[] args) {
        Pen picasso = new Pen();

        //let one point is p1
        Point p1= new Point();
        p1.set(2,2);

        //let second point is p2
        Point p2=new Point(4,8);

        Point p3= new Point(10,0);
        Point p4= p1.add(p3);
        // p4 = new Point(2 + 10, 2 + 0); // = new Point(12, 2) because .add() is returning an obj

        System.out.println("Point p4 = P1 + p3: " + p4);
        System.out.println("X value of p4: " + p4.getX());
        System.out.println("Y value of p4: " + p4.getY());


        Point p5=new Point(3,2);
        Point p6=p3.subtract(p5);

        System.out.println("Point p6 = P3 - p5: " + p4);
        System.out.println("X value of p6: " + p6.getX());
        System.out.println("Y value of p6: " + p6.getY());


        picasso.setPosition(p1); // pen is at 2,2
        picasso.lineTo(p2);      //now pen at (6,10) because the points are (2,2) & (4,8)
        picasso.moveTo(p2);      //pen at P2
        picasso.display();       //Shows geometry.Pen location
        System.out.println(picasso.getPosition());


    }
}