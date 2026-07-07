class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;
        int sum = 0;

        String s = String.valueOf(n);

        for (char c : s.toCharArray()) {
            if (c != '0') {
                int digit = c - '0';
                x = x * 10 + digit;
                sum += digit;
            }
        }

        return x * sum;
    }
}