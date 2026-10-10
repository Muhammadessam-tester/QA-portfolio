public class Array1 {

    //1.Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more
    public static boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        } else {
            return false;
        }
    }

    //--------------------
//2.Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal
    public static boolean sameFirstLast(int[] nums) {
        if (nums.length >= 1 && nums[0] == nums[nums.length - 1]) {
            return true;
        } else {
            return false;
        }
    }

    //--------------------
//3.Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}
    public static int[] makePi() {
        int[] pi = {3, 1, 4};
        return pi;
    }

    //--------------------
//4.Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more
    public static boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    //--------------------
//5.Given an array of ints , return the sum of all the elements
    public static int sum3(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum = num + sum;
        }
        return sum;
    }
}
