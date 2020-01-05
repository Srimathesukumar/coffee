//Types of blocks excecution
public class Block
{
 {
  System.out.println("block");
 }
static
{
 System.out.println("static block");
}
Block()
{
 System.out.println("constructor");
}
void show()
{
 System.out.println("Instance method");
}
static void display()
{
 System.out.println("static method");
}
public static void main(String...arg)
{
 Block o=new Block();
 display();
 o.show();
}
}
