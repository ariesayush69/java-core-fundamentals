class A
{
   public void show()
   {
      System.out.println("in A show");
   }
}

  public class Anonymous_class
{
   public static void main(String[] args) {
     A obj = new A()
     {
     public void show() // ANONYMOUS CLASS - it is inner class overriding of show method so a class in made but without any name 
   {
      System.out.println("in new show");
   }
     };
     obj.show();

   }
}