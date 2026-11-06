class method_static{
    String name;
    int price;
    static String brand;
    
    /*void print()
    {
        System.out.println(name+" "+price+" "+brand);
    }*/
    public static void print1(method_static obj)
    {
        System.out.println(obj.name+" "+obj.price+" "+brand);
    }
    public static void main(String[] args) 
    {
    
    method_static obj1= new method_static();
    obj1.name="oppo";
    obj1.price=14000;
    variable_static.brand="Smartphone";
    

    method_static obj2= new method_static();
    obj2.name="vivo";
    obj2.price=18000;
    method_static.brand="Smartphone";
    

    method_static.brand="Phone";
  method_static.print1(obj1);
   method_static.print1(obj2);
     //obj1.print();
    // obj2.print();
    }
}
