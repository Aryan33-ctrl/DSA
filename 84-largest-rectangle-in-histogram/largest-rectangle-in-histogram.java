class Solution {

    public int largestRectangleArea(int[] heights) {

        Stack<Integer> st = new Stack<>();

        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {

            int currHeight;

            if (i == n) {
                currHeight = 0;
            } else {
                currHeight = heights[i];
            }

            while (!st.isEmpty() &&
                   currHeight < heights[st.peek()]) {

                int height = heights[st.pop()];

                int right = i;

                int left;

                if (st.isEmpty()) {
                    left = -1;
                } else {
                    left = st.peek();
                }

                int width = right - left - 1;

                int area = height * width;

                if (area > maxArea) {
                    maxArea = area;
                }
            }

            st.push(i);
        }

        return maxArea;
    }
}