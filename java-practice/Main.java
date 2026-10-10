import java.util.Arrays;

public class Main {

    //Calculating even numbers
    public static int sumEven(int[] nums) {
        int sumEvenOnly = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                sumEvenOnly = sumEvenOnly + num;
            }
        }
        return sumEvenOnly;
    }
    //Identifying even numbers
    public static void evenNums(){
        for (int i = 0; i < 10 ; i++) {
            if ( i % 2 == 0){
                System.out.println( i + " : even");
            }else
                System.out.println( i );
        }
    }

    public static void main(String[] args) {

        User user = new User("muhammad","muhammad@test.com");
        System.out.println("name : " + user.getName() + "\nemail : " + user.getEmail() );

        System.out.println("1. " + Warmp1.sleepIn(true, false));      //expected: false
        System.out.println("2. " + Warmp1.sleepIn(true, true));      //expected: true
        System.out.println("3. " + Warmp1.monkeyTrouble(true, false));   //expected: false
        System.out.println("4. " + Warmp1.monkeyTrouble(true, true));   //expected: true
        System.out.println("5. " + Warmp1.sumDouble(5, 8));                      //expected: 13
        System.out.println("6. " + Warmp1.sumDouble(5, 5));                      //expected: 20
        System.out.println("7. " + Warmp1.diff21(20));                              //expected: 1
        System.out.println("8. " + Warmp1.diff21(21));                              //expected: 0
        System.out.println("9. " + Warmp1.diff21(22));                              //expected: 2
        System.out.println("10. " + Warmp1.parrotTrouble(true, 6));        //expected: true
        System.out.println("11. " + Warmp1.parrotTrouble(true, 7));        //expected: false
        System.out.println("12. " + Warmp1.parrotTrouble(true, 20));       //expected: false
        System.out.println("13. " + Warmp1.parrotTrouble(true, 21));       //expected: true
        System.out.println("14. " + Array1.firstLast6(new int[]{2, 3, 8, 6}));          //expected: true
        System.out.println("15. " + Arrays.toString(Array1.makePi()));                  //expected: [3 , 1 ,4]
        System.out.println("16. " + Array1.commonEnd(new int[]{2, 3, 5, 7}, new int[]{8, 6, 4, 7}));    //expected: true
        System.out.println("17. " + Array1.sum3(new int[]{2, 4, 6}));                   //expected: 12
        System.out.println(Array1.sameFirstLast(new int[]{2, 3, 4, 2}));           //expected: true
        System.out.println(sumEven(new int[]{2, 3, 4, 6 , 8}));                   //expected: 20
        evenNums();
    }
}
