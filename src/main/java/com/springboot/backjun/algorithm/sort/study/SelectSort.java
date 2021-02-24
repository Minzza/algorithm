package com.springboot.backjun.algorithm.sort.study;

public class SelectSort {
    public static void main(String[] args) {
        int[] values = {5, 3, 8, 2, 10, 9, 4, 1};

        // 1.처음 loop에서 비교 대상을 선택한.
        for (int i = 0; i < values.length - 1; i++) {
            int minIndex = i;
            int temp = 0;
            // 2. 두번쨰 loop에서 비교 대상에 대해 나머지 값들을 비교한다.
            for(int j = i + 1; j < values.length; j++){
                // 3. 가장 작은 값의 인덱스값을 저장한다.
                if(values[j] < values[minIndex]){
                    minIndex = j;
                }
            }
            // 4. 비교 대상과 가장 작은 수와 바꿔준다.
            temp = values[i];
            values[i] = values[minIndex];
            values[minIndex] = temp;
        }

        // 5. 확인.
        for(int i=0; i < values.length; i++){
            System.out.println(values[i]);
        }
    }
}

