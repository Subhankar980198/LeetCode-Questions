import java.util.Stack;

class Solution {

    class Pair {
        char ch;
        int freq;

        Pair(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }
    }

    public String removeDuplicates(String s, int k) {

        Stack<Pair> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (st.isEmpty()) {
                st.push(new Pair(c, 1));
                continue;
            }

            if (st.peek().ch != c) {
                st.push(new Pair(c, 1));
                continue;
            }

            Pair p = st.pop();

            if (p.freq < k - 1) {
                st.push(new Pair(c, p.freq + 1));
            }
            // else don't push back because frequency becomes k
        }

        StringBuilder res = new StringBuilder();

        while (!st.isEmpty()) {

            Pair p = st.pop();

            while (p.freq-- > 0) {
                res.append(p.ch);
            }
        }

        return res.reverse().toString();
    }
}