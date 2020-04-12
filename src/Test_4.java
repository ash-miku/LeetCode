//LeetCode最长公共前缀
class Solution {
    public String longestCommonPrefix(String[] str) {
        if (str.length == 0) return "";
        String prefix = str[0];
        for (int i = 1; i < str.length; i++)
            while (str[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }
}

public class Test_4 {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};

        String out = (new Solution().longestCommonPrefix(str));

        System.out.print(out);
    }
}
