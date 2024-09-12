class Solution {
    public int largestRectangleArea(int[] heights) {
        int nsr[] = findNSR(heights );
        int nsl[] = findNSL(heights );
        int largestArea =0;
        for(int i=0; i< heights.length; i++){
            int area =  nsr[i] - nsl[i]-1; //-1 becuase need remove current one
            //System.out.print(area+" ");
            largestArea = Math.max(largestArea, area*heights[i]);
        }

        // System.out.println();
        // for(int i=0; i< heights.length; i++){
        //     System.out.print(nsr[i]+" ");
        // }
        // System.out.println();
        // for(int i=0; i< heights.length; i++){
        //     System.out.print(nsl[i]+" ");
        // }
        return largestArea;
    }


    int[] findNSR(int[] heights ){
        Stack<Integer> stack = new Stack();
        int len = heights.length;
        int res[] = new int[len];
        int c=len-1;
        for(int i=len-1; i>=0; i--){
            while(stack.size()>0 && heights[stack.peek()]>= heights[i])
                stack.pop();
            
            if(stack.size()==0){
                res[c--] = len; //Why becuase after this no element present
            }else{
               res[c--] = stack.peek(); 
            }
            stack.push(i);
        }
        return res;
    }


    int[] findNSL(int[] heights ){
        Stack<Integer> stack = new Stack();
        int len = heights.length;
        int res[] = new int[len];
        int c=0;
        for(int i=0; i<len; i++){
            while(stack.size()>0 && heights[stack.peek()]>= heights[i])
                stack.pop();
            
            if(stack.size()==0){
                res[c++] = -1;
            }else{
               res[c++] = stack.peek(); 
            }
            stack.push(i);
        }
        return res;
    }
}