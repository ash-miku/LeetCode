//leetcode整数反转
class Solution_1 {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}

public class Test_1 {
    public static void main(String[] args) {
        int ret = new Solution_1().reverse(987654321);

        String out = String.valueOf(ret);

        System.out.print(out);
    }
}