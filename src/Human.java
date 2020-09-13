public class Human {
    Head head=new Head(1);
    Leg leg=new Leg(3);
    Hand hand=new Hand(6);

}
class Head{
    Head(double a){
        headLength=a;
    }
    double headLength;
}
class Leg{
    Leg(double a){
        legLength=a;
    }
    double legLength;
}
class Hand{
    Hand(double a){
        handLength=a;
    }
    double handLength;
}
