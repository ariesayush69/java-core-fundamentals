class A extends Object 
{
public A()
    {
    super();
    System.out.println("in A");
    }
    public A(int n )
    {
    super();
    System.out.println("in  A int");
    }
}
class B extends A
{
public B()
{
    super();
System.out.println("in B");
}
public B(int n)
{
     super();
    System.out.println("in B int");
}
}
 
public class super_method
{
    public static void main()
    {
        B obj=new B(5);
    }
} 