class str_buffer{
    public static void main(String[] args) 
    {
    StringBuffer sb = new StringBuffer("ayush");
    sb.append(" kumar");
    System.out.println(sb);
    sb.deleteCharAt(7);
    System.out.println(sb);
    sb.insert(6, "JAVA ");
    System.out.println(sb);



    }
}