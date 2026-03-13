class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int maxi=0;
        for(int ch:s.toCharArray()){
            if(ch=='(') {
                st.push('(');
                maxi=Math.max(maxi,st.size());

            }
            else if(ch==')'){
                if(!st.isEmpty()) st.pop();
            }
            
        
        }
        return maxi;
        
    }
}