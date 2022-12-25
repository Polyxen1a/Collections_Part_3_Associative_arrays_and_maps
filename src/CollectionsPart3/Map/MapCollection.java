package CollectionsPart3.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static java.util.List.of;
import static jdk.internal.org.jline.utils.Colors.s;

public class MapCollection {
    private static final Map<String, Integer> strMap = new HashMap<>();

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    private static void test1() {
        addNumberToMap("строка ", 1);
        addNumberToMap("строка ", 2);
        addNumberToMap("строка 2", 3);
        addNumberToMap("строка 2", 4);

        for (Map.Entry<String, Integer> stringIntegerEntry : strMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " : " + stringIntegerEntry.getValue());
        }
    }

    private static void addNumberToMap(String строка, int i) {
    }

    private static void test2() {
        Map<String, List<Integer>> listMap = new HashMap<>();
        listMap.put("string1", List.of(10, 11, 12));
        listMap.put("string2", List.of(200, 201, 202));
        listMap.put("string3", List.of(300, 301, 303));
        listMap.put("string4", List.of(600, 612, 718));
        listMap.put("string5", List.of(800, 811, 819));

        Map<String, Integer> listMap1 = new HashMap();
        for (Map.Entry<String, Integer> stringIntegerEntry : listMap1.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + sumElements(stringListEntry.getValue));
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : listMap1.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " : " + stringIntegerEntry.getValue());
        }
    }

    public static void test3() {
        Map<Integer, String> someNumbers = new LinkedHashMap<>();
        someNumbers.put(1, "one");
        someNumbers.put(2, "two");
        someNumbers.put(3, "three");
        someNumbers.put(4, "four");
        someNumbers.put(5, "five");
        someNumbers.put(6, "six");

        for (Map.Entry<Integer, String> integerStringEntry : someNumbers.entrySet()) {
            System.out.println(integerStringEntry.getKey() + " : " + integerStringEntry.getValue());
        }
        public static void addNumberToMap (String s, Integer i);
        if (strMap.containsKey(s) && strMap.containsValue(i)) {
            throw new RuntimeException(strMap + " ключ уже есть и значения совпадают");
        }
        strMap.put(s, i);
    }

        public static Integer sumElements (List < Integer > list) {
            Integer sum = 0;
            for (Integer element : list) {
                sum += element;
            }
            return sum;
        }

    }
