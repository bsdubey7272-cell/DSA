class Solution {
    public int bitwiseComplement(int n) {
        String ans=Integer.toBinaryString(n);
        StringBuilder result=new StringBuilder();
        for(int i=0;i<ans.length();i++){
            if(ans.charAt(i)=='1'){
               result.append('0');
            }
            else {
               result.append('1');
            }
        }
        return  Integer.parseInt(result.toString(),2);

        
    }
}