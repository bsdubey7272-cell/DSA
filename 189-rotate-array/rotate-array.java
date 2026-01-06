class Solution {
    public void rotate(int[] nums, int k) {
    //     int n=nums.length;
    //     k=k%n;
    //     if(k==0){
    //         return;
    //     }
    //     int left=0;
    //     int right=n-1;
    //     while(left<right){
    //         int temp=nums[left];
    //         nums[left]=nums[right];
    //         nums[right]=temp;
    //         left++;
    //         right--;

    //     }
    //     int low=0;
    //     int high=k-1;

    //    while(low<high){
    //     int tt=nums[low];
    //     nums[low]=nums[high];
    //     nums[high]=tt;
    //     low++;
    //     high--;
    //    }
    //    int ll=k;
    //    int hl=n-1;
    //    while(ll<hl){
    //     int tmp=nums[ll];
    //     nums[ll]=nums[hl];
    //     nums[hl]=tmp;
    //     ll++;
    //     hl--;
    //    }
    int n=nums.length;
    k=k%n;
    if(k==0){
        return;
    }
    reverse(nums,0,n-1);
    reverse(nums,0,k-1);
    reverse(nums,k,n-1);
        
    }
    public void reverse(int nums[],int left,int right){
        while(left<right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
        left++;
        right--;

        }
        
    }
}