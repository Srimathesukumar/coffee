//ATM application program
import java.util.Scanner;
class Demo
{
 public void insert()
 {
 boolean a=true;
 Scanner o=new Scanner(System.in);
 a=o.nextBoolean();
 if(a==true)
 System.out.println("Card is inserted");
 else
 System.out.println("card is not inserted");
 }
 public void pin()
 {
  int n,g,b=0,s=0;
  Scanner p=new Scanner(System.in);
  n=p.nextInt();
  g=n; 
  while(n!=0)
  {
   s=s*10;
   s=s+n%10;
   n=n/10;
   }
  System.out.println("reverse pin no:"+s);
  while(s!=0)
  {
   b=b*10;
   b=b+s%10;
   s=s/10;
   }
  System.out.println("obtained pin no:"+b);
  if(g==b)
  {
  System.out.println("valid");
  System.out.println("1. Withdraw"+"\t"+"2. Change pin"+"\n"+"3. Link Aadhar"+"\t"+"4. Balance Enquiry"+"\n"+"5. Deposit money");
  }
  else
  {
  System.out.println("Give valid pin number");
  }
 }
 public void withdraw()
 {
  int m,n=50000;
  Scanner q=new Scanner(System.in);
  m=q.nextInt();
  System.out.println("Rs. "+m);
  if(m<50000)
  System.out.println("collect money");
  else
  System.out.println("There is no sufficient money");
  }
 public void changepin()
 {
  int o,g;
  Scanner ie=new Scanner(System.in);
  o=ie.nextInt();
  g=ie.nextInt();
  System.out.println("Enter recent pin no: "+g);
  System.out.println("Enter new pin no: "+o);
  g=o;
  }
}
class Atm
{
 public static void main(String...arg)
 {
  Demo v=new Demo();
  v.insert();
  v.pin();
  int r;
  Scanner er=new Scanner(System.in);
  r=er.nextInt();
  switch(r)
  {
   case 1:
    v.withdraw();
    break;
   case 2:
    v.changepin();
    break;
   }
 }
}

