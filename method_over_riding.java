import javax.swing.SpringLayout;
class Calc
{
public int add(int n1,int n2)
{
    return n1+n2;
}
}
class AdvCalc extends Calc
{
    public int add(int n1,int n2)
    {
        return n1+n2+1; 
    }
}
public class method_over_riding{
    public static void main()
    {
    AdvCalc obj= new AdvCalc();
    int r1=obj.add(5,6);
    System.out.println(r1);
    }
}