abstract class Computer // can use interface here also in place of abstarct class - interface Computer
{
   public abstract void code();// void code ();
}
class Laptop extends Computer // class Laptop implements Computer
{
 public void code()
 {
   System.out.println("code-compile-execute...");
 }
}
class Desktop extends Computer//class Desktop implements Computer
{
   public void code()
 {
   System.out.println("code-compile-execute-faster...");
 }
}
class developer 
{
 public void devapp(Computer lap)
 {
   lap.code();
 }
}
  public class interface_use1
{
   public static void main(String[] args) {
      Computer lap = new Laptop();
      Computer desk = new Desktop();

      developer ayush = new developer();
      ayush.devapp(lap);
      
   }
}