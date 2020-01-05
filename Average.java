//Average progrm using Array
import java.util.Scanner;
class Demo
{
 public void average(int n,int a[])
 {
  int s=0,i;
  float f;
  for(i=0;i<n;i++)
  {
   s=s+a[i];
   }
   f=s/n;
   System.out.println("Average is "+f);
 }
}
class Average
{
 public static void main(String...arg)
 {
  int m,i;
  Scanner sc=new Scanner(System.in);
  m=sc.nextInt();
  int b[]=new int[m];
  for(i=0;i<m;i++)
  {
   b[i]=sc.nextInt();
  }
 Demo obj=new Demo();
 obj.average(m,b);
 }
}
  
