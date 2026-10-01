
class Solution {
    public boolean isValid(String s) {
        int n = s.length();

        if (n % 2 == 1){ 
            return false;
        }

        char[] st = new char[n];
        int head = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st[head++] = ')';

            } else if (ch == '[') {
                st[head++] = ']';

            } else if (ch == '{') {
                st[head++] = '}';

            } else {
                if (head == 0) {
                    return false;
                }
                if (st[--head] != ch) {
                    return false;
                }
            }
        }
        return head == 0;
    }
}