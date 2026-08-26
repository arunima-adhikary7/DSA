class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        StringBuilder add = new StringBuilder();
        String ans = "";
        int count = 0;
        int j = 0;

        for (int i = 0; i < s.length(); i++) {

            add.append(s.charAt(i));

            if (s.charAt(i) == '1') {
                count++;
            }

            while (count == k) {

                String current = add.toString();

                if (ans.equals("") ||
                    current.length() < ans.length() ||
                    (current.length() == ans.length() &&
                     current.compareTo(ans) < 0)) {
                    ans = current;
                }

                if (add.charAt(0) == '1') {
                    count--;
                }

                add.deleteCharAt(0);
                j++;
            }
        }

        return ans;
    }
}