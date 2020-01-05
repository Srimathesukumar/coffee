//Circle and Cylinder program
import java.util.Scanner;
class Circle
{
    double area(int r)
    {
	  double area_c=(3.14*r*r);
	   return area_c;
    }
}
class Cylinder extends Circle
{
public static void main(String...arg)
{
Scanner sc=new Scanner(System.in);
int radius=sc.nextInt();
Cylinder round=new Cylinder();
double a=round.area(radius);
int h=sc.nextInt();
double g=a*h;
System.out.println("volume of cyclinder"+g);
}
}
