//Check Armstrong number or not
import java.lang.Math;
import java.util.Scanner;
class Armstrong
{
 public static void main(String...arg)
 {
  int n,a,b;
  int c=0,s=0;
  double t;
  Scanner p=new Scanner(System.in);
  n=p.nextInt();
  a=n;
  int k=n;
  while(n!=0)
  {
   n=n/10;
   c++;
  }
 System.out.println(c);
 int count=0;
  while(a!=0)
  {
   System.out.println("count is "+count);
   b=a%10;
   t=Math.pow(b,c);
   System.out.println(t);
   s=(int)(s+t);
   a=a/10;
   count++;
   }
  System.out.println(s);
  System.out.println(a);
  if(s==k)
  System.out.println("Is am amstrong no");
  else
  System.out.println("Not an amstrong no");
  }
}
