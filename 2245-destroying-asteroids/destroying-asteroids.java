class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {

        Arrays.sort(asteroids);
        long currentmass=mass;

        for(int x: asteroids){
            if(x<=currentmass){
                currentmass+=x;
            }else{
                return false;
                
            }
        }
        return true;

        
        
    }
}