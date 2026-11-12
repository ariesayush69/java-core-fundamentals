abstract class Car
{
public abstract void drive();
  
public void playmusic()
{
   System.out.println("play music");
}
}

class WagnonR extends Car{

   public void drive()
   {
      System.out.println("Driving...");
   }
}

public class abstract_use
{
   public static void main(String[] args) {
       Car obj = new WagnonR();
       obj.drive();
       obj.playmusic();
   }
}