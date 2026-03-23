class Solution {
    public int numberOfChild(int n, int k) {
        int fullLenght = 2*(n-1); // n-1 taking from 0 to n-1 and n-1 taking from n-1 to 0
        int rem = k%fullLenght; // Position of ball

        if(rem < n )
            return rem;
        else{
            return fullLenght - rem; //ball moving from n-1 to 0 in opposit direction
        }
    }
}