class Solution {
    public int[] searchRange(int[] arr, int key) {
       
        int first=-1;
        int last=-1;
       
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
            first=i;
            break;
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==key){
                last= i;
                break;
            }
            
        }
       
        return new int []{first,last};
    }
}