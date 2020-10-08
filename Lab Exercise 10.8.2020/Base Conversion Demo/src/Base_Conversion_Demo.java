/**
 * @(#)Base_Conversion_Demo.java
 *
 * Base_Conversion_Demo application
 *
 * @author 
 * @version 1.00 2020/10/8
 */
 
public class Base_Conversion_Demo {
    
    public static void main(String[] args) {
    	
    	int binary, octal, hex, decimal;
    	String sbin, soct, shex, wierd;
    	decimal = 42;
    	
    	//convert decimal value to different base
    	sbin = Integer.toBinaryString(decimal);
    	soct = Integer.toOctalString(decimal);
    	shex = Integer.toHexString(decimal);
    	
    	//print results as strings
    	System.out.println(decimal + " = " + sbin + " base 2");
    	System.out.println(decimal + " = " + soct + " base 8");
    	System.out.println(decimal + " = " + shex + " base 16");
    	
    	//Turn strings back to numbers that are base 10
    	binary = Integer.parseInt(sbin, 2);
    	octal = Integer.parseInt(soct, 8);
    	hex = Integer.parseInt(shex, 16);
    	
    	//print results as numbers
    	System.out.println(binary);
    	System.out.println(octal);
    	System.out.println(hex);
    }
}
