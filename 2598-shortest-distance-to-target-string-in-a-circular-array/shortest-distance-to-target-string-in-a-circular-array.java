class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int mindist=Integer.MAX_VALUE;
        int n=words.length;
        for(int i=0;i<n;i++){
            if(words[i].equals(target)){
                int crrdistance=Math.abs(startIndex-i);
                int circulardistance=(n-crrdistance);
                mindist=Math.min(mindist,Math.min(crrdistance,circulardistance));
            }
        }
        return mindist==Integer.MAX_VALUE?-1:mindist;
        
    }
}