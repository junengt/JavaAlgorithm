package algorithm.javaalgorithm.twopointer;

import java.util.ArrayList;

/**
 * 설명
 * 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
 * 두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
 * 세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
 * 네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
 * 각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.
 *
 * 출력
 * 오름차순으로 정렬된 배열을 출력합니다.
 */
public class TwoPointer {

    public ArrayList<Integer> solution(int n, int[] arr, int n2, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while (p1 < n && p2 < n2) {
            if (arr[p1] < arr2[p2]) {
                answer.add(arr[p1++]);
            } else {
                answer.add(arr2[p2++]);
            }
        }
        while (p1 < n) {
            answer.add(arr[p1++]);
        }
        while (p2 < n2) {
            answer.add(arr2[p2++]);
        }
        return answer;
    }
}
