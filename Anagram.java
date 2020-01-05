//Check given String is Anagram or not
import java.util.Scanner;
import java.util.Arrays;
class Anagram
{
 public static void main(String...arg)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("ENTER THE FIRST STRING");
  String word1=sc.nextLine();
  word1=word1.toLowerCase();
  word1=word1.replaceAll(" ","");
  System.out.println(word1);

  System.out.println("ENTER THE SECOND STRING");
  String word2=sc.nextLine();
  word2=word2.toLowerCase();
  word2=word2.replaceAll(" ","");
  System.out.println(word2);

  char w1[]=word1.toCharArray();
  char w2[]=word2.toCharArray();
  Arrays.sort(w1);
  Arrays.sort(w2);
  System.out.println(w1);
  System.out.println(w2);

  int c=0,a,b;
  a=word1.length();
  b=word2.length();
  System.out.println(a+" "+b);
  if(a==b)
  {
   for(int i=0;i<a;i++)
   {
    if(w1[i]==w2[i])
    {
     c++;
    }
   }
   System.out.println(c);
   if(c==w1.length)
   {
    System.out.println("ANAGRAM");
   }
   else
   {
    System.out.println("NOT ANAGRAM");
   }
  }
  else
  {
   System.out.println("NOT ANAGRAM");
  }
 }
}
