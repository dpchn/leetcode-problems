class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[][]> result = new ArrayList();
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        for(int i=0; i< intervals.length; i++){
            if(result.isEmpty()){
                result.add(new int[]{intervals[i][0]});
            }
        }
    }
}