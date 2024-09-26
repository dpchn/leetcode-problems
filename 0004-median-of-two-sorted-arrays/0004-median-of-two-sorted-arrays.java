class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList();
        int i=0, j=0, len1= nums1.length, len2 =nums2.length;
        while(i< len1 && j < len2){
            if(nums1[i]<nums2[j]){
                list.add(nums1[i++]);
            }else{
                list.add(nums2[j++]);
            }
        }

        while(i< len1){
            list.add(nums1[i++]);
        }

        while(j< len2){
            list.add(nums2[j++]);
        }

        double median;
        if(list.size()%2==0){
            int mid = list.size()/2;
            median = (list.get(mid)+ list.get(mid-1))/2.0;
        }else{
            median = list.get(list.size()/2);
        }
        
        return median;
    }
}