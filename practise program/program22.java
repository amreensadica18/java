public class Arrays {

   public static void main(String[] args) {
      // Summing all elements
        double[] myList = {1.9, 2.9, 3.4, 3.5};
      double total = 0;
      for (int i = 0; i < myList.length; i++) {
         total += myList[i];
      }
     System.out.println(total);
   }
    
}
