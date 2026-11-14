enum Laptop {
Macbook(2000),XPS(2200),Surface,ThinkPad(1800);

private int price;

private Laptop() // default constructor that if any of enum objects have no price specified it will return them a default price listed here 
{
  price=500;
}
//if we have mentioned the default constructor then we have to give default constructor otherwise if any enum object will not have any specified value then it will flag the error 
private Laptop(int price){
  this.price=price;
}

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class enum_use1
{ 
    public static void main(String[] args) {
       //Laptop lap = Laptop.Macbook;
       //System.out.println(lap+" : "+lap.getPrice());
       for(Laptop lap : Laptop.values())
       {
        System.out.println(lap + " : "+lap.getPrice());
       }
    }
}
