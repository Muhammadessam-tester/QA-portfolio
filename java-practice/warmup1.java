import java.util.Arrays;

public class warmup1 {
    //1.The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        boolean sleepIn = true;
        if (weekday == true && vacation == false) {
            return false;
        } else {
            return sleepIn;
        }
    }
//--------------------
//2.We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == bSmile) {
            return true;
        } else {
            return false;
        }
    }
//--------------------
//3.Given two int values, return their sum. Unless the two values are the same, then return double their sum

    public static int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b) * 2;
        } else {
            return a + b;
        }
    }
//--------------------
//4.Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21

    public static int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }
//--------------------
//5.We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble

    public static boolean parrotTrouble(boolean talking, int hour) {
        if (talking == true && (hour < 7 || hour > 20)) {
            return true;
        } else {
            return false;
        }
    }

    //--------------------
//6.Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more
    public static boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        } else {
            return false;
        }
    }

    //--------------------
//7.Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal
    public static boolean sameFirstLast(int[] nums) {
        if (nums.length >= 1 && nums[0] == nums[nums.length - 1]) {
            return true;
        } else {
            return false;
        }
    }

    //--------------------
//8.Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}
    public static int[] makePi() {
        int[] pi = {3, 1, 4};
        return pi;
    }

    //--------------------
//9.Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more
    public static boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    //--------------------
//10.Given an array of ints , return the sum of all the elements
    public static int sum3(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum = num + sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("1. " + sleepIn(true, false));      //expected: false
        System.out.println("2. " + sleepIn(true, true));      //expected: true
        System.out.println("3. " + monkeyTrouble(true, false));   //expected: false
        System.out.println("4. " + monkeyTrouble(true, true));   //expected: true
        System.out.println("5. " + sumDouble(5, 8));                      //expected: 13
        System.out.println("6. " + sumDouble(5, 5));                      //expected: 20
        System.out.println("7. " + diff21(20));                              //expected: 1
        System.out.println("8. " + diff21(21));                              //expected: 0
        System.out.println("9. " + diff21(22));                              //expected: 2
        System.out.println("10. " + parrotTrouble(true, 6));        //expected: true
        System.out.println("11. " + parrotTrouble(true, 7));        //expected: false
        System.out.println("12. " + parrotTrouble(true, 20));       //expected: false
        System.out.println("13. " + parrotTrouble(true, 21));       //expected: true
        System.out.println("14. " + firstLast6(new int[]{2, 3, 8, 6}));          //expected: true
        System.out.println("15. " + Arrays.toString(makePi()));                  //expected: [3 , 1 ,4]
        System.out.println("16. " + commonEnd(new int[]{2, 3, 5, 7}, new int[]{8, 6, 4, 7}));    //expected: true
        System.out.println("17. " + sum3(new int[]{2, 4, 6}));                   //expected: 12


    }
}
