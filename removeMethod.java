import java.util.ArrayList;
class removeMethod{
  public static void main(String[] args) {
    ArrayList<String> fruits =new ArrayList<>();
    fruits .add("Apple");
    fruits .add("apple");
    fruits.add("Banana");
    System.out.println(fruits);

    fruits.remove("apple");
    System.out.println(fruits);

    ArrayList<Integer> list=new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    System.out.println(list);
   // list.remove(1); // it delete the index value Not the element
    // we want to remove the element We convert into the Wrapper class .

list.remove(Integer.valueOf(1));
System.out.println(list);

  }
}