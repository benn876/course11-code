package org.fasttrackit.code.maps;

import org.fasttrackit.homework.StudentGrade;

import java.util.*;

public class MapsMain {
    public static void main(String[] args) {
        Map<String, Integer> test = new HashMap<>();
        test.put("test", 22);
        Map<String, Integer> nameToAge = new HashMap<>();
        nameToAge.put("George", 22);
        nameToAge.put("Ion", 22);
        nameToAge.put("Angela", 22);

        System.out.println(nameToAge);
        nameToAge.put("George", 22);
        nameToAge.put("George", 33);
        nameToAge.put("George", 44);
        nameToAge.put("George", 31);
        System.out.println(nameToAge);

        if (nameToAge.containsKey("George")) {
            System.out.println("George is in the map");
        }

        nameToAge.putAll(test);
        System.out.println(nameToAge);
        System.out.println(nameToAge.containsValue(55));
        nameToAge.putIfAbsent("Mark", 44);
        nameToAge.putIfAbsent("George", 44);
        System.out.println(nameToAge);

        nameToAge.remove("George");
        nameToAge.remove("Mark", 44);
        System.out.println(nameToAge);
        Set<Map.Entry<String, Integer>> entries = nameToAge.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        Map<String, List<Integer>> nameToMultipleAge = new HashMap<>();
        nameToMultipleAge.put("George", List.of(22, 33, 44, 31, 55));
        System.out.println(nameToMultipleAge);

        System.out.println(nameToMultipleAge.get("George"));
        nameToMultipleAge.put("Alex", new ArrayList<>());
        nameToMultipleAge.get("Alex").add(11);
        nameToMultipleAge.get("Alex").add(12);
        nameToMultipleAge.get("Alex").add(13);
        System.out.println(nameToMultipleAge);

        Map<Integer, StudentGrade> studentGradeMap = new HashMap<>();
        studentGradeMap.put(1, new StudentGrade("Mihai", "Mate", 10));

        System.out.println(nameToAge.keySet());
        System.out.println(nameToAge.values());
    }
}
