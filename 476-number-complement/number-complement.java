class Solution {
    public int findComplement(int num) {
        String s=Integer.toBinaryString(num);
        StringBuilder ans=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='0'){
                ans.append('1');
            }else{
                ans.append('0');
            }
        }
        return Integer.parseInt(ans.toString(), 2);

        
    }
}