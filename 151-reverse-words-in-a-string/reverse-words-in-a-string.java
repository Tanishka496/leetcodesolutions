class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();

        int i = s.length() - 1;
        int end;

        while (i >= 0) {

            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0)
                break;

            end = i + 1;

            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            if (ans.length() > 0) {
                ans.append(" ");
            }
            ans.append(s.substring(i + 1, end));
        }

        return ans.toString();
    }
}