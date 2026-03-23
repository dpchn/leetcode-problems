class Solution {
    // public int shipWithinDays(int[] weights, int days) {
    //     Arrays.sort(weights);
    //     int sum =0;
    //     for(int n: weights){
    //         sum +=n;
    //     }

    //     int avg = sum / days;
    //     int nearestSum=0;

    //     for(int n: weights){
    //         nearestSum +=n;
    //         if(nearestSum > avg)
    //             return nearestSum;
    //     }

    //     return nearestSum;

    // }


    public int shipWithinDays(int[] weights, int days) {
        int low=0, high =0;
        for(int w : weights){
            if(low < w){
                low = w;
            }
            high +=w;
        }

        while(low < high){
            int mid = (high + low)/2;
            if(canShip(mid,weights, days)){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }


    boolean canShip(int capacity, int[] weights, int days){
        int shipNeed=1;
        int currentLoad = 0;
        for(int w : weights){
            if(currentLoad + w > capacity){
                shipNeed++;
                currentLoad=0;
            }
            currentLoad +=w;
        }
        return shipNeed <= days;
    }
}