class Solution {
    public long removeZeros(long n) {
        String s = "" + n;
        long r = 0;

        for (char a : s.toCharArray()) {
            if (a != '0') {
                r = r * 10 + (a-'0');
            }
        }

        return r;
    }
}