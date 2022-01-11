package cursor_education_JB;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Map<String, Integer> map = new HashMap<>();
        map.put("Student1", 1);
        map.put("Student2", 2);
        map.put("Student3", 3);
        map.put("Student4", 4);
        map.put("Student5", 5);
        System.out.println(map);
        System.out.println(map.get(1));
//        System.out.println(map.get(null));
        System.out.println(map.containsKey(3));
//        System.out.println(map.containsKey(6));
        System.out.println(map.keySet());
        System.out.println(map.values());
        for (Map.Entry<String,Integer> intergerStringEntry : map.entrySet()) {
            System.out.println(intergerStringEntry);
        }
//            for (Map.Entry<Integer, String> value : map.entrySet()) {
//                System.out.println(value.getValue());
//            }



        Map<Integer, List<Integer>> map2 = new HashMap<>();
        map2.put(1, List.of(1,2,3,4,5,6,8,10,15));
        System.out.println(map2);

        Map<String, String> map3 = new HashMap<>();
        map3.put("name","Ivan");
        map3.put("age","33");
        map3.put("Listname","Ivanov");
        System.out.println(map3);

        Map<String, String> map4 = new HashMap<>();
        map4.put("name","Vali");
        map4.put("age","30");
        map4.put("Listname","Ivanova");
        map4.put("Mail","XX@YY");
        System.out.println(map4);

        List<Map<String,String >> lisMap = new ArrayList<>();

        lisMap.add(map3);
        lisMap.add(map4);
        System.out.println(lisMap);

        map.replace("ddd",2);
        System.out.println(map);
        System.out.println(map.get(888));
        System.out.println(map.getOrDefault("1111",2));

        map.remove(2);
        System.out.println(map);

        Map<Integer,Integer> map5 = new HashMap<>();


    }
}