//String reverse program using StringBuilder()
import java.lang.*;
import java.io.*;
import java.util.*;
public class ReverseString {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String to reverse:");
        String str=sc.nextLine();
        StringBuilder input1 = new StringBuilder();
 // append a string into StringBuilder input1
        input1.append(str);
 // reverse StringBuilder input1.
        input1.reverse();
 // print reversed String.
        System.out.println(input1);
    }
}
