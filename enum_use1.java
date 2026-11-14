enum Status {
Running,Failed ,Pending,Success;
}

public class enum_use1
{ 
    public static void main(String[] args) {
       Status s = Status.Running;
       // we can also use switch case here instead of if-else-if
       if(s== Status.Running)
       System.out.println("please wait");
       else if (s== Status.Success)
       System.out.println("congrats");
       else if(s== Status.Failed)
       System.out.println(" try again");
       else
       System.out.println(Status.Pending);
  }
}