public class HelloWorld
{
  public static final String MESSAGE = "Hello World";
  
  public static void main(String[] argv)
  {
    HelloWorld hw = new HelloWorld();
    System.out.println(hw.getMessage());
  }
  
  public String getMessage()
  {
    return MESSAGE;
  }
};
