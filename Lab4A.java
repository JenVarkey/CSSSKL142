package Labs;
/**
 * Write a description of class Lab4 here.
 * 
 * @author Jennifer Varkey
 * @version 1/31/2025
 */


public class Lab4A {

    public static void main(String[] args) {

        countGrains();//integer overflow by day 32

        //test twoToThePowerOf with values 4 and 0
        twoToThePowerOf(4); // Should print "2 to the power of 4 is 16"
        twoToThePowerOf(0); // Should print "2 to the power of 0 is 1"
       numBackward(14141); //should print
       numBackward(987654321); //should print 123456789

    }

    /**
	 * countGrains
	 * 
     * Calculates the number of grains and prints out the result per lab instructions
     *
     * Output: "Day x and you got y grain(s) of rice for total of z grain(s)"
     * As the day increases, the amount of grains received will double.
     * However, an int value can only go up to 2147483647
     * at day 32, the amount of grains received goes over the max int value by 1, looping it around to a negative number
     * and adding this decreases the total amount of grains to -1, further increasing the grains loops the adding value to 0
     */
    public static void countGrains() {
        int sum = 0;
        int grains = 1;
        for(int i = 1; i <=64; i++){
            sum+=grains;
            System.out.println("Day " + i + " and you got " + grains + " grain(s) of rice for a total of " + sum + " grain(s).");
            grains*=2;
        }

    }

    /**
	 * twoToThePowerOf
	 * 
     * Calculates 2 to the power of a given exponent and prints the result
	 * 
     * @param exponent   int  The exponent to raise 2 to the power of
     */
    public static void twoToThePowerOf(int exponent) {
        //if exponent is 0, the number should be 1 and the loop should not print
        int num = 1;
        for (int i = 0; i<exponent;i++){
            num*=2;
        }
        //print result
        System.out.println("2 to the power of " + exponent + " is " + num);

    }

    /**
	 * numBackward
	 * 
     * Reverses the digits of a given integer, i.e. 12345 would become 54321 per lab instructions
     *
     * @param number   int  The number to be reversed
     */
    public static void numBackward(int number) {
        int ogNum = number;
        //create new number
        int backNum = 0;
        String strNum = number+"";
        int numLength = strNum.length();
        //keep loop running until all digits are reversed
       for(int i = 0; i < numLength; i++){
           int digit = number%10;
           if (backNum == 0){
               backNum = digit;
           } else {
               backNum*=10;
               backNum+=digit;
           }
           number/=10;
       }



        //print final number
        System.out.print("backward: " + backNum);

       if(backNum == ogNum) {
           System.out.println(", palindrome!");
       } else {
           System.out.println(", not palindrome!");
       }

    }

} // end class Lab4A
