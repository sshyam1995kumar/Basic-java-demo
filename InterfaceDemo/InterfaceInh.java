package InterfaceDemo;

public class InterfaceInh extends MyBase implements i2 {
public double Circle_Circum(double r)
{
	return (2*pi*r*r);
}
public void methI2()	{
	System.out.println("call to methI2");
}
public void methI1()
{
	System.out.println("call to methI1");
}
public static void main(String arg[])
{
	InterfaceInh obj=new InterfaceInh();
	double ans=obj.Circle_Circum(4);
	System.out.println("circumference:"+ans);
	}
}
