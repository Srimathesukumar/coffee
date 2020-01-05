//Online Shopping with proper authentication 
import java.util.Scanner;
import java.util.Random;
class Debit
{ 
  String n,dn,dp,cv;
  static Scanner s=new Scanner(System.in);
  static String name="Sri";
  static String dcn="1234567890";
  static String dcp="3456";
  static String cvv="567";
  
 void payment()
 {
 
  dn=s.nextLine();
  dp=s.nextLine();
  cv=s.nextLine();
  
  if((name.equals(n))&&(dcn.equals(dn))&&(dcp.equals(dp))&&(cvv.equals(cv)))
  {
    System.out.println("TRANSACTION SUCESSFULLY");
    System.out.println(name+"\n"+dcn+"\n"+dcp+"\n"+cvv);
  }
  
 }
 void payment(String dcp,String cvv)
 {
  dp=s.nextLine();
  cv=s.nextLine();
  int otp;
  Random o=new Random();
  otp=o.nextInt();
  if((dcp.equals(dp))&&(cvv.equals(cv)))
  {
   System.out.println("TRANSACTION SUCESSFULLY");
   System.out.println(dcp+"\n"+cvv+"\n"+otp);
   }
 }
}
 class OnlineShop
{
 public static void main(String...arg)
 {
  String a,b;
  Scanner sc=new Scanner(System.in);
  a=sc.nextLine();
  b=sc.nextLine();
  Debit p=new Debit();
  System.out.println("ENTER USER ID");
  
  p.payment();
  p.payment(a,b);
 }
}
  
