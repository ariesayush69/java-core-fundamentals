class calcu extends VeryAdvCalc
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
public class demo
{
    public static void main(String[] args){
        calcu obj = new calcu();
        int r1 = obj.add(4,3);
        int r2 = obj.sub(10,9);
        int r3 = obj.multi(4,3);
        int r4 = obj.divi(15,3);
        double r5 = obj.power(4,2);
       
        System.out.println(r1 + " " + r2+" "+r3+" "+r4+" "+r5);
    }
}
