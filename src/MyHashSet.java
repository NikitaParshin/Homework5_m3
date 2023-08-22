import java.util.HashMap;

public class MyHashSet<E> {
        HashMap<E, Object> map = new HashMap<>();

        private final static Object PRESENT = new Object();
        public boolean add(E e) {
                return map.put(e, PRESENT) == null;
        }
        public boolean remove(E e) {
                return map.remove(e) == PRESENT;
        }
        public boolean contains(E e) {
                return map.containsKey(e);
        }
        
        public int size() {
                return map.size();
        }
public static void main(String[] args) {
        MyHashSet<String> mySet = new MyHashSet<>();
        mySet.add("one");
        mySet.add("two");
        mySet.add("three");
        mySet.add("two");
        System.out.println(mySet.add("four"));
        System.out.println(mySet.size());
        System.out.println(mySet.contains("two"));
        System.out.println(mySet.remove("two"));
        System.out.println(mySet.contains("two"));
        System.out.println(mySet);
        }
}
