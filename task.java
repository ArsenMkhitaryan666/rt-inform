import java.util.HashMap;
import java.util.Map;

public class ElementCounter {
    public static Map<Integer, Integer> countElements(int[] array) {
        Map<Integer, Integer> elementCount = new HashMap<>();
        for (int num : array) {
            elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
        }
        return elementCount;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 3, 4, 5, 1, 5, 4};
        Map<Integer, Integer> result = countElements(inputArray);
        System.out.println(result);
    }
}
