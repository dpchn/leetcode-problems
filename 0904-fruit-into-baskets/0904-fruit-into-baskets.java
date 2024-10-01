class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> basket = new HashMap();
        int max = 0, i = 0, j = 0, currentTotalFruits = 0;

    while (j < fruits.length) {
        int fruit = fruits[j];
        basket.put(fruit, basket.getOrDefault(fruit, 0) + 1);
        currentTotalFruits++; 
        // If the basket contains more than 2 types of fruits, shrink the window.
        while (basket.size() > 2) {
            int prevFruit = fruits[i++];
            basket.put(prevFruit, basket.get(prevFruit) - 1);
            currentTotalFruits--; 
            
            if (basket.get(prevFruit) == 0) {
                basket.remove(prevFruit);
            }
        }
        max = Math.max(max, currentTotalFruits);
        j++;
    }
        return max;
    }
}