import java.util.HashMap;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        String name1 = "Vasaj";
        String name12 = "Vasja";
        String name2 = "Alex";
        String name3 = "Marina";

        Student st1 = new Student("st1", 42);
        Student st12 = new Student("st1", 42);
        Student st2 = new Student("st2", 22);
        Student st3 = new Student("st3", 12);

        TreeMap<Student, Integer> tMap = new TreeMap<>();
        HashMap<Student, Integer> hMap = new HashMap<>();

        //3539963
        System.out.println(st1.hashCode());

        hMap.put(st1, 11111);

//        st1.setName("student");

        System.out.println(st12.hashCode());

        System.out.println(hMap.get(st12));


//        byte [] arr = new byte[2];
//        arr[0] = 1;
//        arr[1] = 2;
//
//        byte [] arr2 = new byte[2];
//        arr[0] = 1;
//        arr[1] = 2;
//
//        HashMap<String, Integer> map = new HashMap<>();
//
//        map.put(name1, 11111);
////        map.put(st2, name2);
////        map.put(st3, name3);\82426431
//
//        System.out.println(map.get(name12));
//
//        System.out.println(name1 == name12);
    }
}
