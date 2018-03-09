import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class W9D5Coding {
	/**
	 * 
	 * @author Jawahar G  
     * Version 1.0       2018-03-05 computing for the square, square root, cube root for the given error term. 
     *
	 */
	
	public static void main(String args []) {
		System.out.println("Program designed and runned by  Jawahar");
		System.out.println("");
		System.out.println("");
		Scanner keyboard = new Scanner(System.in);         // Initialized scanner class
		System.out.println("Enter the 1 st measured value");
		double Measured1 = keyboard.nextDouble();           // reading first measured value from input.
		System.out.println("Enter the 1 st Error value");
		double Error1 = keyboard.nextDouble();              // reading first Error value from input.
		keyboard.close(); 
		
		
		//code for square
		double power2 = Math.pow(Measured1, 2);
		double valueErrorFraction = Error1/Math.abs(Measured1);
		double ErrorTerm2 = (2)*valueErrorFraction*Math.abs(power2);
		System.out.println("The Square  of the error term  "+ Measured1+"± "+ Error1+ "     =    "+ power2+"  ±  "+ getSignificant(ErrorTerm2,1));
		System.out.println("");
		//code for square root
		double power1 =  Math.sqrt(Measured1);
		double ErrorTerm1 = (0.5)*valueErrorFraction*Math.abs(power1);
		System.out.println("The Square root of the error term  "+ Measured1+"± "+ Error1+ "     =    "+ power1+"  ±  "+ getSignificant(ErrorTerm1,1));
		System.out.println("");
		// code for cube root
		
		double power= Math.cbrt(Measured1);
		double ErrorTerm= Math.abs(0.33333333333333333333333333333333)*valueErrorFraction*Math.abs(power);
		System.out.println("The cube root of the error term  "+ Measured1+"± "+ Error1+ "     =    "+ power+"  ±  "+ getSignificant(ErrorTerm,1));
	}
		 // significant method
		public static String getSignificant(double value, int sigFigs) {
			MathContext mc = new MathContext(sigFigs, RoundingMode.DOWN);
			BigDecimal bigDecimal = new BigDecimal(value, mc);
			return bigDecimal.toPlainString();
		}


}