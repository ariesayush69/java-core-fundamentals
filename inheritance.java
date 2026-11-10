class calcu
{
    public int add(int a ,int b)
    {
        return a+b;
    }
    public int sub(int a ,int b)
    {
        return a-b;
    }
}
public class inheritance
{
    public static void main(String[] args){
        calcu obj = new calcu();
        int r1 = obj.add(4,3);
        int r2 = obj.sub(10,9);
        
        System.out.println(r1 + " " + r2);
    }
}