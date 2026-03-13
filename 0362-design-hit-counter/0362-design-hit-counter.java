class HitCounter {

    int[] times;
    int []  hits;
    int windowSize=300;
    public HitCounter() {
        times = new int[windowSize];
        hits = new int[windowSize];
    }
    
    public void hit(int timestamp) {
        int idx = timestamp % windowSize;
        if(times[idx] != timestamp){
            times[idx] = timestamp;
            hits[idx]=1; 
        }else{
            hits[idx]++;
        }
    }
    
    public int getHits(int timestamp) {
        int totalHits=0;
        for(int i=0; i< windowSize; i++){
            if(timestamp - times[i] < windowSize){
                totalHits +=hits[i];
            }
        }
        return totalHits;
    }
}

/**
 * Your HitCounter object will be instantiated and called as such:
 * HitCounter obj = new HitCounter();
 * obj.hit(timestamp);
 * int param_2 = obj.getHits(timestamp);
 */