
public class Pen  {

        private Point position;

        public Pen(){
            position=new Point();
        }
        public void moveTo(Point z){
            System.out.println("Pen moved to"+z);
            position=z; //one opt
        }
        public void lineTo (Point z){
            System.out.println("Drawing line from "+position+" to "+z);
            position.set(z.getX(), z.getY()); //second opt
        }
        public void display(){
            System.out.println("Pen is at ("+position.getX()+","+position.getY()+")");
        }
        public void setPosition(Point p){
            this.position=p;
        }
        public Point getPosition() {
            return position;
        }

}
