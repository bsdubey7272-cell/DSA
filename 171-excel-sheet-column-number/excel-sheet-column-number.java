class Solution {
    public int titleToNumber(String column) {
        int n=column.length();
        int sum=0;
        int power=0;
        for(int i=n-1;i>=0;i--){
            int tmp=column.charAt(i)-64;
            sum+=(int)Math.pow(26,power++)*tmp;
        }
        return sum;
    }
}