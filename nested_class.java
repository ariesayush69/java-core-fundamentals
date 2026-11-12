class A
{
   void show()
   {
      System.out.println("in show");
   }
    class B //{static class B} - when you make psvm object calling for it to be like - {A.B obj1 = new A.B();}
   {
      void config()
      {
      System.out.println("in config");
       }
}
}

public class nested_class
{
   public static void main(String[] args) {
       A obj = new A();
       obj.show();
       
      // A.B obj1 = new A.B(); // then you should make the inner class static
       A.B obj1= obj.new B(); // when you dont make the inner class static 
       obj1.config();

   }
}