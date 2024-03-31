import java.util.HashMap;

public class Map {
    public static void main(String []args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("John",25);
        map.put("Mary",30);
        map.put("Bob",20);
        
        System.out.println(map);

        Integer JohnAge = map.get("John");
        System.out.println("John's Age: "+JohnAge);

        map.remove("Bob");
        System.out.println(map);
        Boolean containsMary = map.containsKey("Mary");
        System.out.println("Does map contains the key - 'Mary'? "+containsMary);
        Boolean containsAge25 = map.containsValue(25);
        System.out.println("Does map contains the value - '25'? "+containsAge25);
    }
}
