class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> arr = new ArrayList();
        for(int i=1; i<=n; i++){
            arr.add(i);
        }

        return winner(arr, k, 0);
    }



    int winner(List<Integer> arr, int k, int index){
        if(arr.size()==1)
            return arr.get(0);

        index = (k+index-1)% arr.size();
        arr.remove(index);
        return winner(arr, k, index);
    }
}