public class Patterns{  

 public static void main(String []args){  

        int i,j,num=5;  

   for(i=1;i<=num;i++){

      for(j=num;j>=1;j--){ 

          if(j!=i)  

           System.out.print(j);  

          else  

           System.out.print("*");  

   }  

   System.out.println("");  

   }

 }

}
