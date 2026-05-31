class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
       
        int n=asteroids.length;
        Arrays.sort(asteroids);
        
       for(int aster:asteroids){
        if(aster>mass){
            return false;
        }else if(mass>=1e5){
            return true;
        }
        mass+=aster;
       }
        return true;
    }
}