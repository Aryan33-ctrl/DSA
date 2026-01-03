class Solution {
    public int numOfWays(int n) {
        long MOD = 1_000_000_007;// ye mujhe pehli baar pata chala ye is liye use kiya hai jisse value error na aye kyunki hame boht bade bade answers milenge

        long diff = 6;  
        long same = 6;  

        for (int i = 2; i <= n; i++) {
            long newDiff = (diff * 2 + same * 2) % MOD;
            long newSame = (diff * 2 + same * 3) % MOD;

            diff = newDiff;
            same = newSame;
        }

        return (int)((diff + same) % MOD);
    }
}
