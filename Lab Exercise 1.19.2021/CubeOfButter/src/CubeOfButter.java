/**
 * @(#)CubeOfButter.java
 *
 * CubeOfButter application
 *
 * @author 
 * @version 1.00 2021/1/19
 */
 
public class CubeOfButter {
    
    public static void main(String[] args) {
    	
    	double width, length, numCubes;
    	double footballArea, sideLength;
    	double area;
    	
    	//define width and length of football field in inches
    	width = 160.0 * 12.0;
    	length = 360.0 * 12.0;
    	
    	//Calculate area of football field in square inches
    	//Add code here
    	
    	//Initialize values for iinitial cube of butter
    	area = 1.0;
    	numCubes = 1.0;
    	sideLength = 1.0;
    	
    	//Iteratively calculate area until it exceeds the football field area
    	while (area < footballArea)
    	{
    		//Recalculate numCubes
    		numCubes *= 8.0;
    		
    		//Recalculate sideLength
    		sideLength /= 2.0;
    		
    		//Recalculate area
    		area = sideLength * sideLength * numCubes;
    	}
    	
    	//Calculate the side length in nanometers
    	sideLength = sideLength * 2.54e7;
    	
    	//Output the result
    	System.out.println("Number of cubes = " + numCubes);
    	System.out.println("Thickness of butter = " + sideLength + " nanometers");
    }
}

//Output
//Number of cubes = 5.9029581035870565E20
//Thickness of butter = 3.0279159545898438 nanometers