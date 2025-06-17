import java.util.ArrayDeque;
public class ArrayDequeFifo {
  public static void main(String[] args) {
    ArrayDeque<String> name = new ArrayDeque<>();
    name.add("Apple");
    name.add("Banana");
    name.add("Cherry");
    System.out.println(name);
    name.addFirst("Mango"); // insert element at the first
    System.out.println(name);
    name.addLast("Orange"); // insert element at the last
    System.out.println(name);
    name.remove(); // By default removes element from the beginning
    System.out.println(name);
    name.remove("Banana"); // remove specific element
    System.out.println(name);
    name.removeFirst(); // remove first element 
    name.pop(); // remove last element (LIFO operation)
    System.out.println(name);    
  }
  
}
