class Solution {
    public boolean isPerfectSquare(int num) {
        // int left=0;
        // int right=num;
        // while(left<right){
        //     int mid=left+right/2;
        //     if(mid*mid!=num){
        //         return false;
        //     }
        //     left++;
        //     right--;
        // }
        // return true;
        // if(num==1) return true;
        // for(int i=1;i<num;i++){
        //     if(i*i==num){
        //         return true;
        //     }
        // }
        // return false;
        int left=1;
        int right=num;
        while(left<=right){
            long mid=left+(right-left)/2;
            if(mid*mid==num){
                return true;
            }
            if(mid*mid>num){
                right=(int)mid-1;
                
            }else{
                left=(int)mid+1;
            }
        }
        return false;

        
    }
}