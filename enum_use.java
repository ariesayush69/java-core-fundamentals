enum Status {
Running,Failed ,Pending,Success;
}

public class enum_use
{ 
    public static void main(String[] args) {
        int i=5;
        Status s = Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal());
        Status[] ss = Status.values();
        for (Status sss : ss)
        {
        System.out.println(sss+" : "+sss.ordinal());
    }
  }
}
