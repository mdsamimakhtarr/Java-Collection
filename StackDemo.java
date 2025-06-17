import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> name = new Stack<>();
        name.push("Apple");
        name.push("Banana");
        name.push("Cherry");
        System.out.println(name);

        name.pop();
        System.out.println(name); // remove the last element

        name.push("Orange");
        System.out.println(name); // add element at the last
    }
}