interface  A
{
 void show();
 void config();
}
class B implements A
{
   public void show()
   {
      System.out.println("in show");
   }
   public void config()
   {
      System.out.println("in config");
   }
}
  public class interface_use
{
   public static void main(String[] args) {
      A obj;
      obj = new B();
      obj.show();
      obj.config();
      
   }
}