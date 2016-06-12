package implementations.custom;


/**
* Main class- to test HashMap functionality.
*/
public class HashMapCustomTest {
    
   public static void main(String[] args) {
          HashMapCustom<Integer, Integer> hashMapCustom = new HashMapCustom<Integer, Integer>();
          hashMapCustom.put(21, 12);
          hashMapCustom.put(25, 121);
          hashMapCustom.put(30, 151);
          hashMapCustom.put(33, 15);
          hashMapCustom.put(35, 89);

          System.out.println("value corresponding to key 21="
                       + hashMapCustom.get(21));
          System.out.println("value corresponding to key 51="
                       + hashMapCustom.get(51));

          System.out.print("Displaying : ");
          hashMapCustom.display();

          System.out.println("\n\nvalue corresponding to key 21 removed: "
                       + hashMapCustom.remove(21));
          System.out.println("value corresponding to key 51 removed: "
                       + hashMapCustom.remove(51));

          System.out.print("Displaying : ");
          hashMapCustom.display();

   }
}

/*Output

value corresponding to key 21=12
value corresponding to key 51=null
Displaying : {21=12} {25=121} {33=15} {30=151} {35=89}

value corresponding to key 21 removed: true
value corresponding to key 51 removed: false
Displaying : {25=121} {33=15} {30=151} {35=89} 

*/