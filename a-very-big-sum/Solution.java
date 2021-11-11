import java.util.*;

public class Solution {
    public static void main(String[] args) {
        List<Long> arr = List.of(1L, 2L, 3L);

        System.out.println(aVeryBigSum(arr));
    }
    
    private static Long aVeryBigSum(List<Long> ar) {
        return ar.stream().reduce(0L,(a, b) -> a + b);
    }
}