//Single Inheritance with super keyword polymer program
class SNSpolymers
{
void polythene()
{
int a=100000;
String oldconame="SNS POLYMERS";
System.out.println("old Company name is:"+oldconame);
System.out.println("Number of old employees is:"+a);
}
}
class Bestpolymers extends SNSpolymers
{
void polythene()
{
super.polythene();
int b=200000;
String newconame="BEST POLYMERS";
System.out.println("new Company name is:"+newconame);
System.out.println("Number of new employees is:"+b);
}
public static void main (String args[])
{
Bestpolymers t=new Bestpolymers();
t.polythene();
}
}




