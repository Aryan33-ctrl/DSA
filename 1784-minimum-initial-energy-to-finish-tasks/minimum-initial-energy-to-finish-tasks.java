import java.util.Arrays;

class Solution {
    public int minimumEffort(int[][] tasks) {
        
        Arrays.sort(tasks, (a, b) -> 
            (b[1] - b[0]) - (a[1] - a[0])
        );

        int energy = 0;
        int initial = 0;

        for (int[] task : tasks) {

            int actual = task[0];
            int minimum = task[1];

            if (energy < minimum) {
                initial += (minimum - energy);
                energy = minimum;
            }

            energy -= actual;
        }

        return initial;
    }
}