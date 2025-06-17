import java.util.LinkedList;
public class LinkListDemo {
  public static void main(String[] args) {
    LinkedList<String> name=new LinkedList<>();
    name.add("Samim");
    name.add("rahul");
    name.add("Gulu");
    for(String str:name){
      System.out.println(name );
    }

    name.addFirst("Dhoni");// insert element at the first
    System.out.println(name );

    name.addLast("Rohit "); // insert element at the Last
    System.out.println(name );

    name.remove(); // Bydefault remove element from the beginning
    System.out.println(name );

    name.remove(1); // remove element at the specific index 
    System.out.println(name );

    name.removeFirst();
    System.out.println(name ); // remove first element
  }
}
