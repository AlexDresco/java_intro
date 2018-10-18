import java.util.ArrayList;
import java.util.Arrays;

// can you remember how to set up your main function?
public class ArraysTest {
public static void main(String[] args){

// declare an array of Strings and print it
String[] arr = new String[2];
arr[0] = "Hello";
arr[1] = "World";
System.out.println(Arrays.toString(arr));

// declare an array of integers and print it
int[] another = {1,2,3,5};
System.out.println(Arrays.toString(another));

// declare an ArrayList of integers, add numbers to it, and then print it

ArrayList<Integer> arrList = new ArrayList<Integer>();
arrList.add(1);
arrList.add(2);
System.out.println(arrList);
}
}
