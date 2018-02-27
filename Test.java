
public class Test {
   public static void main(String[] args) {
      int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

      for(int x : numbers ) {
         if( x == 3 ) {
            continue;
         }
         System.out.print( x );
         System.out.print("\n");
      }
   }
}