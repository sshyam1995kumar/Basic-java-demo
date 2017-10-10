package advclassdesign;

public class AbsClassDemo {

public static void main(String arg[]){
Shape s1=new Circle();
Circle c=new Circle();
System.out.println("area of circle:"+c.calcArea());
s1.display();
Square s=new Square();
System.out.println("area of square:"+s.calcArea());
s1.display();
}
}