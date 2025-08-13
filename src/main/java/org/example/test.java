package org.example;

public class test {

    public static int[] rotateLeft3(int[] nums) {
        int element = nums[0];
        for (int i = 0; i < nums.length ; i++) {
         nums[i] =  nums.length -1;
        }


        for (int i = 0; i < nums.length ; i++) {
            System.out.print(nums[i]);
        }

        return  nums;

    }


    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        int[] array =  new int[nums.length];
        int first = nums[0];
        for (int i = nums.length - 1 ; i > 0; i--) {
            for (int j = 0; j < array.length ; j++) {
                array[j] = nums[nums.length - i];
            }
        } nums[nums.length -1 ] = first;

        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);

        }



        rotateLeft3(nums);;
    }
}
