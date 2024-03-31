import java.util.*;

public class Set {
    public static void main(String []args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Bannana");
        set.add("Orange");
        set.add("Grape");
        set.add("Grape");

        System.out.println(set);

        Object Bannana = set.contains("Bannana");
        System.out.println("Contains Bannana?"+Bannana);
        set.remove("Orange");
        System.out.println(set);
        for(String fruit: set) {
            System.out.println(fruit);
        }
    }
}
