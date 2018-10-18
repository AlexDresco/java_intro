// can you remember how to set up your main function?
public class JavaBuzz {
public static void main(String[] args){
  for (int num=0; num<=100 ; num++) {
    if (num % 15 == 0) {
      System.out.println("JavaBuzz");
    } else if (num % 3 == 0){
      System.out.println("Java");
    } else if (num % 5 == 0){
      System.out.println("Buzz");
    } else {
      System.out.println(num);
    }
  }
// "Java" if divisible by 3
// "Buzz" if divisible by 5
// "JavaBuzz" if divisible by 15
}
}
