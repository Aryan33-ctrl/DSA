class Solution {
    public int countCharacters(String[] words, String chars) {

        // Store frequency of characters in chars
        int[] charsFreq = new int[26];

        for (char ch : chars.toCharArray()) {
            charsFreq[ch - 'a']++;
        }

        int ans = 0;

        // Check every word
        for (String word : words) {

            // Frequency array for current word
            int[] wordFreq = new int[26];

            for (char ch : word.toCharArray()) {
                wordFreq[ch - 'a']++;
            }

            boolean possible = true;

            // Compare frequencies
            for (int i = 0; i < 26; i++) {
                if (wordFreq[i] > charsFreq[i]) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                ans += word.length();
            }
        }

        return ans;
    }
}