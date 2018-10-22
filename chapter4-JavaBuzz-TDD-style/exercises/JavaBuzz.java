// can you remember how to set up your main function?
public class JavaBuzz {
  public static void main(String[] args){}
    public static String javaBuzz(int num){
      String result = null;
      if (num % 15 == 0) {
        result = "JavaBuzz";
      } else if (num % 3 == 0){
        result = "Java";
      } else if (num % 5 == 0){
        result = "Buzz";
      } else {
        result = Integer.toString(num);
      }
      return result;
  }
}
// "Java" if divisible by 3
// "Buzz" if divisible by 5
// "JavaBuzz" if divisible by 15
