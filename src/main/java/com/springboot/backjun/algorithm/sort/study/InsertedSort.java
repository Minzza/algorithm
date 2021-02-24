package com.springboot.backjun.algorithm.sort.study;

public class InsertedSort {

    public static void main(String[] args) {
        int[] values = {5, 3, 8, 2, 10, 9, 4, 1};

        // 1. 1번째 인덱스부터 삽입 대상을 선정.
        for (int i = 1; i < values.length; i++) {
            // 2. 삽입 대상을 따로 가지고 있는다.
            int target = values[i];
            // 3. 삽입 대상의 이전 인덱스부터 시작한다.
            int idx = i - 1;

            // 4. 인덱스는 0보다 커야한다. 그리고 삽입 대상보다 이전의 대상이 더 클 경우 바꿔야 한다.
            while (idx >= 0 && target < values[idx]) {
                // 5.자리를 바꿀 경우 삽입의 대상 자리부터 이전 인덱스의 값으로 채운다.
                values[idx + 1] = values[idx];
                // 6. 이전의 이전 인덱스 비교를 위해서.
                idx--;
            }
            // 7. 최종 자리에 삽입 대상 값을 넣어준다. 또는 변경이 없을 경우 그 자리 그대로 넣어준다.
            values[idx + 1] = target;
        }
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
}
