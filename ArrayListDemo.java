
import java.util.ArrayList;
public class ArrayListDemo {
  public static void main(String[] args) {
    ArrayList<String> name = new ArrayList<>();
    name.add("Apple");
    name.add("Banana");
    name.add("Cherry");
    System.out.println(name);
    name.add(1, "Orange");
    System.out.println(name); // specific position 

    name.add(0,"Biryani" );
    System.out.println(name); // At the beggnning


    // Remove 

    name.remove(0); // remove with index value 

    System.out.println(name.get(2));
    System.out.println(name );  // access only one value with index
    
    name .clear(); // clear all the element form the Array
    System.out.println(name );

  }
}
