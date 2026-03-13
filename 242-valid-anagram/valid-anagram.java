class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char arr[]=s.toCharArray();
        Arrays.sort(arr);
        String news=new String(arr);
        char nums[]=t.toCharArray();
        Arrays.sort(nums);
        String tt=new String(nums);
        return tt.equals(news);
    }
}