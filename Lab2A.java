package Labs;
//Lab2A.java - revised
import java.util.Scanner; //Importing Scanner

public class Lab2A {
    public static void main(String[] args){

        // kelvins and temperaturePrinter tests
        System.out.println("\nTesting kelvins and temperaturePrinter: ");
        double f1 = 32.00;
        temperaturePrinter(f1, kelvins(f1));
        double f2 = 72.00;
        temperaturePrinter(f2, kelvins(f2));
        double f3 = 94.3;
        temperaturePrinter(f3, kelvins(f3));
        double f4 = 0.4;
        temperaturePrinter(f4, kelvins(f4));
        double f5 = -79;
        temperaturePrinter(f5, kelvins(f5));

        // secondTime tests
        System.out.println("\nTesting secondTime:");
        // TODO: Declare a scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input total seconds as an integer");
        
        int val = sc.nextInt();            
        secondTime(val);

        // inSeconds tests
        System.out.println("\nTesting inSeconds:");
        inSeconds(1, 5, 1); // Expect: 3901

        // Tests for inSeconds and secondTime
        inSeconds( 0, 2, 0 ); // output: 120
        secondTime( 9001 ); // output: 2:30:1
        inSeconds( 24, 0, 0 ); // output: 86400
        secondTime( 3600 ); // output: 1:00:00
        inSeconds( -1, 61, -60 ); // output: 0
    }

	// kelvins
     	// Converts a value in Fahrenheit to the corresponding value in Kelvins.
     	// f: the temperature in Farenheit
    public static double kelvins(double f) {
	    return (5.0/9)*(f-32) + 273.15;
    }
	
	// temperaturePrinter
     	// Prints the message "<f> F corresponds to <k> K"
	// f: the temperature in Farenheit
	// k: the temperature in Kelvins
    public static void temperaturePrinter(double f, double k) {
        //newline added to ensure next print statement prints to next line
        System.out.printf("%.2f F corresponds to %.2f K\n", f, k);
    }

    
     	// secondTime
     	// Converts from seconds to hour:minutes:seconds, and prints the
     	// result to the console.
	// seconds: the time in seconds
    public static void secondTime(int seconds){
        int originalTime = seconds;
        int minutes = seconds/60;
        seconds %= 60;
        int hours = minutes/60;
        minutes%=60;
        System.out.println(originalTime + " == " + hours + ":" + minutes + ":" + seconds);
    }
	
	// inSeconds
     	// This method converts from hours:minutes:seconds to seconds, and prints the
	// result to the console.
    public static void inSeconds(int hours, int minutes, int seconds){
        int totalTime = seconds + (minutes*60) + (hours*60*60);
        System.out.println(hours + ":" + minutes + ":" + seconds + " == " + totalTime);
    }

}
