// Lab1a.java
// This short class has several bugs for practice.
// Authors: Carol Zander, Rob Nash, Clark Olson, you
public class Lab1a {

    public static void main(String[] args) {
        compareNumbers(4);
        calculateDistance();
        
        /*
         * 
         * Nyoooommmm
         */
    }
    
    public static void compareNumbers(int numInput) {
        int firstNum = 5;
        int secondNum = numInput;
        System.out.println( "Sum is:" + (firstNum + secondNum));
        System.out.println( "Difference is: " + (firstNum - secondNum));
        System.out.println( "Product is: " + firstNum * secondNum );
    }
    
    public static void calculateDistance() {
        int velocity = 10; //miles-per-hour
        int time = 2; //hours
        int distance = velocity * time;
        System.out.println( "Total distance is: " + distance);
    }
}
