class variable_static{
    String name;
    int price;
    static String brand;
    
    void print()
    {
        System.out.println(name+" "+price+" "+brand);
    }
    public static void main(String[] args) 
    {
    
    variable_static obj1= new variable_static();
    obj1.name="oppo";
    obj1.price=14000;
    variable_static.brand="Smartphone";
    

    variable_static obj2= new variable_static();
    obj2.name="vivo";
    obj2.price=18000;
    variable_static.brand="Smartphone";
    

    variable_static.brand="Phone";
  
  obj1.print();
  obj2.print();
    }
}