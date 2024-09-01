import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (num % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(nums);
    }

    public static void task2() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (num % 2 != 0) {
                iterator.remove();
            }
        }
        Set<Integer> numsWithoutDuplicates = new HashSet<>(nums);
        System.out.println(numsWithoutDuplicates);
    }

    public static void task3() {
        List<String> words = Arrays.asList("один", "два", "два", "три", "три", "три");
        Set<String> uniqueWords = new HashSet<>(words);
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }

    public static void task4() {
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> duplicates = new HashMap<>();
        int i = 1;
        for (String string : strings) {
            if (duplicates.containsKey(string)) {
                duplicates.put(string, duplicates.get(string) + 1);
            } else {
                duplicates.put(string, i);
            }
        }
        System.out.println(duplicates);
    }
}
