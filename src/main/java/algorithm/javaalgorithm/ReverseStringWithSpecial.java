package algorithm.javaalgorithm;

public class ReverseStringWithSpecial {
    public String solution(String str) {
        String answer = "";
        char[] c = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(c[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(c[rt])) {
                rt--;
            } else {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(c);
        return answer;
    }
}
