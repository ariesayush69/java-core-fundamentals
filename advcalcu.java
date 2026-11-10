class advacalcu extends calcu
{
    public int multi(int a ,int b)
    {
        return a*b;
    }
    public int divi(int a ,int b)
    {
        return a/b;
    }
}
public class advcalcu
{
    public static void main(String[] args){
        advacalcu obj = new advacalcu();
        int r1 = obj.add(4,3);
        int r2 = obj.sub(10,9);
        int r3 = obj.multi(4,3);
        int r4 = obj.divi(15,3);
        System.out.println(r1 + " " + r2+" "+r3+" "+r4);
    }
}
