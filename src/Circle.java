public class Circle {
    double r;
    double s;
    double lengthCircle;
    double s(){
        return r*r*Math.PI;
    }
    double lengthCircle(){
       return 2*r*Math.PI;
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getS() {

        return s;
    }
    public void setS(double s) {

        this.s = s;
    }
    public double getLengthCircle() {
        return lengthCircle;
    }

    public void setLengthCircle(double lengthCircle) {
        this.lengthCircle = lengthCircle;
    }

}
class CircleTest {
    public static void main(String[] args) {
        Circle one=new Circle(12);
        System.out.println(one.getR()+" "+ one.s()+" "+ one.lengthCircle());
    }
}
