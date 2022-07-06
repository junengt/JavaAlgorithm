package algorithm.javaalgorithm.array;

import java.util.ArrayList;

/**
 * 설명
 * N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
 * (첫 번째 수는 무조건 출력한다)
 *
 * 입력
 * 첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
 *
 * 출력
 * 자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
 */
public class BigNumber {
    public ArrayList<Integer> solution(int n, int[] array) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(array[0]);
        for (int i=1; i<n; i++) {
            if (array[i]> array[i-1]) {
                answer.add(array[i]);
            }
        }
        return answer;
    }
}
