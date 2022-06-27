package algorithm.javaalgorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 설명
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
 *
 * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
 *
 * 출력
 * N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 */
public class ReverseString {

    public List<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
//        for (String x : str) {
//            StringBuilder tmp = new StringBuilder(x).reverse();
//            answer.add(String.valueOf(tmp));
//        }
        for (String x : str) { //str = good
            char[] s = x.toCharArray(); //s = good
            int lt = 0;
            int rt = x.length() - 1; //rt = 3
            while (lt < rt) {
                char tmp = s[lt]; //tmp = g // tmp = o
                s[lt] = s[rt]; //s[0] = s[3] // s[1] = s[2]
                s[rt] = tmp; //s[3] = g // s[2] = o
                lt++; //0 + 1 = 1 // 1 + 1 = 2
                rt--; //3 - 1 = 2 // 2 - 1 = 1 while 종료
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }
}
