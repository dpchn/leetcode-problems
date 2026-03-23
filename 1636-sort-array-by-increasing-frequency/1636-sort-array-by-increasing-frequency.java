import java.util.Arrays;
class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freq = new HashMap();
        for(int n : nums){
            freq.put(n, freq.getOrDefault(n, 0)+1);
        }

        // 1. Convert int[] to Integer[] so we can use a Comparator
        Integer[] result = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        // 2. Sort with corrected logic
        Arrays.sort(result, (a, b) -> {
            int f1 = freq.get(a);
            int f2 = freq.get(b);
            
            if (f1 != f2) {
                return f1 - f2; // Ascending frequency
            }
            return b - a; // Descending value if frequency is same
        });

        return Arrays.stream(result).mapToInt(i -> i).toArray();

    }
}