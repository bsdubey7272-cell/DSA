class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        int arr[]=new int[n*m];
        int idx=0;
        k=k%(n*m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[idx++]=grid[i][j];
            }
        }
        List<List<Integer>>ans  =new ArrayList<>();
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        int idxx=0;
        for(int i=0;i<n;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<m;j++ ){
                row.add(arr[idxx++]);
            }
            ans.add(row);

        }
        return ans;

        
    }
    public void reverse(int arr[],int left,int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }

    }
}