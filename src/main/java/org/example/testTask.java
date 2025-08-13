package org.example;

public class testTask {
    public static int solution(int[] A) {
        // Implement your solution here
        int smallestNumber = A[A.length - 1];
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1] && A[i] != smallestNumber) {
                smallestNumber = A[i];

            }
            if(smallestNumber < 0 ){
                smallestNumber = 0;
            }
        }
        System.out.println(smallestNumber + 1);
        return smallestNumber + 1 ;

    }


    static int[] a = {1, 3, 6, 4, 1, 2};
    static int[] b = {1, 2, 3};
    static int[] c = {-1, -3 };

    public static void main(String[] args) {
        solution(c);
    }
}

