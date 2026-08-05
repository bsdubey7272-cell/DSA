class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<n/2;i++ ){
             if(isvowel(s.charAt(i))){
                cnt1++;
            }

        }
        for(int i=n/2;i<n;i++){
             if(isvowel(s.charAt(i))){
                cnt2++;
            }

        }

        return cnt1==cnt2;
           
        
        
    }


    public boolean isvowel( char s){
        s=Character.toLowerCase(s);

        return s=='a'||s=='e'||s=='i'||s=='o'||s=='u';
    }
}