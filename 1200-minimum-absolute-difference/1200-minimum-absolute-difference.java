class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList();
        //int min = findMinDiff(arr);
        int min = Integer.MAX_VALUE;
        for(int i=1; i<arr.length; i++){
            int currentDiff = arr[i] - arr[i-1];
            if(currentDiff <min){

                min = currentDiff;
                result.clear();
                result.add(List.of( arr[i-1], arr[i]));
            }else if(currentDiff==min){
                result.add(List.of( arr[i-1], arr[i]));
            }
           
        }
        return result;
    }


    int findMinDiff(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i=1; i<arr.length; i++){
            min = Math.min(min, arr[i] - arr[i-1]);
        }
        return min;
    }
}