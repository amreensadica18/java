//String reverse program using Scanner Class.
import java.util.*;
public class StringReverse{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        System.out.println("Reversed String is:"+reverse);
    }
}
