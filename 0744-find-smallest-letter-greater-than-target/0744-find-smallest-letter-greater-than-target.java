class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int ceil = findCeil(letters,  target);
        System.out.println(ceil);
        if(ceil==-1)
            return letters[ceil+1];
        return letters[ceil];
    }

    int findCeil(char[] letters, char target){
        int index =-1;
        int low=0, high = letters.length-1;
        while(low <=high){
            int mid = low +(high - low)/2;
            if(letters[mid]==target){
                index = (mid+1)%letters.length;
                low = mid+1;
            }
            if(letters[mid] <= target){
                low = mid+1;
            }else{
                if(index==-1){
                    index = mid;
                }else if(letters[index] > letters[mid]){
                    index = mid;
                }
                high = mid-1;
            }
        }
        return index;
    }
}