class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        Map<String, List<Integer>> map = new HashMap();

        for(int i=0; i< wordsDict.length; i++ ){
            String word = wordsDict[i];
            if(!map.containsKey(word)){
                map.put(word, new ArrayList());
            }

            map.get(word).add(i);
        }


        int i=0, j=0, min=Integer.MAX_VALUE;
        if(map.containsKey(word1) && map.containsKey(word2)){
            List<Integer> list1 = map.get(word1);
            List<Integer> list2 =  map.get(word2);

            while(i< list1.size() && j< list2.size()){
                int diff = Math.abs(list1.get(i) - list2.get(j));
                min  = Math.min(diff, min);
                if(list1.get(i) < list2.get(j)){
                    i++;
                }else{
                    j++;
                }
            }
            return min;
        }

        return -1;

    }
}