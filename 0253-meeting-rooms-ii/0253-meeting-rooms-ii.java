class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        PriorityQueue<Integer> que = new PriorityQueue();

        for(int i=0; i< intervals.length; i++){
            if(que.isEmpty()){
                que.add(intervals[i][1]);
                continue;
            }else if(que.peek()<= intervals[i][0]){
                que.remove();
            }
            que.add(intervals[i][1]);
        }
        return que.size();

    }
}