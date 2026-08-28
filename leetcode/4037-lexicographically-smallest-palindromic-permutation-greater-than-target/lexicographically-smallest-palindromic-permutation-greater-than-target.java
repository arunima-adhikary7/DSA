class Solution {

    public String lexPalindromicPermutation(String s, String target) {

        int n = s.length();

        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Check whether palindrome is possible
        int odd = 0;
        int middle = -1;

        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1) {
                odd++;
                middle = i;
            }
        }

        if (odd > 1) {
            return "";
        }

        // Frequency of characters in left half
        int[] half = new int[26];

        for (int i = 0; i < 26; i++) {
            half[i] = freq[i] / 2;
        }

        int halfLen = n / 2;

        /*
         * We try to construct the smallest possible left half.
         */
        StringBuilder left = new StringBuilder();

        for (int pos = 0; pos < halfLen; pos++) {

            boolean chosen = false;

            for (int c = 0; c < 26; c++) {

                if (half[c] == 0) {
                    continue;
                }

                // Try character c
                half[c]--;
                left.append((char) ('a' + c));

                /*
                 * Build the maximum possible palindrome
                 * after this choice.
                 */
                String candidate = buildMaximumPalindrome(
                        left,
                        half,
                        middle
                );

                if (candidate.compareTo(target) > 0) {

                    chosen = true;
                    break;
                }

                // Undo
                left.deleteCharAt(left.length() - 1);
                half[c]++;
            }

            if (!chosen) {
                return "";
            }
        }

        // Build final answer
        StringBuilder ans = new StringBuilder();

        ans.append(left);

        if (middle != -1) {
            ans.append((char) ('a' + middle));
        }

        ans.append(new StringBuilder(left).reverse());

        String result = ans.toString();

        return result.compareTo(target) > 0 ? result : "";
    }


    private String buildMaximumPalindrome(
            StringBuilder left,
            int[] half,
            int middle) {

        /*
         * Copy the current left part.
         */
        StringBuilder temp = new StringBuilder(left);

        /*
         * Add all remaining characters in DESCENDING order.
         *
         * This gives the largest possible left half.
         */
        for (int c = 25; c >= 0; c--) {

            for (int k = 0; k < half[c]; k++) {
                temp.append((char) ('a' + c));
            }
        }

        StringBuilder palindrome = new StringBuilder();

        palindrome.append(temp);

        if (middle != -1) {
            palindrome.append((char) ('a' + middle));
        }

        palindrome.append(new StringBuilder(temp).reverse());

        return palindrome.toString();
    }
}