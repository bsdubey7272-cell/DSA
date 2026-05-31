class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
       
        int n=asteroids.length;
        Arrays.sort(asteroids);
        long crrsum=mass;
        for(int i:asteroids){
             
            if(crrsum<i){
                return false;
                

               
            }
            crrsum+=i;
             
           

        }
        return true;
        
    }
}