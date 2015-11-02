import java.util.Scanner;

public class MathLab {
	
	public static void main(String args[]){
		
		System.out.println("Math Lab - Number Conversion Program");
		
		//Next two lines are used in all versions.
		System.out.println("ABCD1234 Base-16 converts to " + BaseConverter.fromHexToBin("ABCD1234") + " in Base-2.\n");
		System.out.println("E12B47F5 Base-16 converts to " + BaseConverter.fromHexToBin("E12B47F5") + " in Base-2.\n");
		
		
		//The next two lines are used in the 90-point versions and above.
		//System.out.println("1011111011101111 Base-2 converts to " + BaseConverter.fromBinToDec("1011111011101111") + "in Base-10.\n");
		//System.out.println("11100100100110110 Base-2 converts to " + BaseConverter.fromBinToDec("11100100100110110") + " in Base-10.\n");
		
		// The next line is used in the 95-point versions and above.		
		// System.out.println("1011111011101111 Base-2 converts to " + BaseConverter.fromBinToHex("1011111011101111") + " in Base-16.\n");

		// The next line is used in the 100-point versions and above.		
		// System.out.println("11100100100110110 Base-2 converts to " + BaseConverter.fromBinToHex("11100100100110110") + " in Base-16.\n");
				
		// The next 3 lines are used in the 105 and 110-point versions.
		// System.out.println("1000 Base-10 converts to " + BaseConverter.fromDecToAny(1000,5) + " in Base-5.\n");
		// System.out.println("1000 Base-10 converts to " + BaseConverter.fromDecToAny(1000,8) + " in Base-8.\n");
		// System.out.println("200 Base-10 converts to " + BaseConverter.fromDecToAny(200,2) + " in Base-2.\n");
				
		// This last line is only used in the 110 point version.
		// System.out.println("48879 Base-10 converts to " + BaseConverter.fromDecToAny(48879,16) + " in Base-16.\n");
	}
}

class BaseConverter{
	
	public static String fromHexToBin(String hexNum)
	{
		String binNum = "";
		
		return binNum;
	}
	
	public static int fromBinToDec(String binNum)
	{
		int decNum = 0;
		
		return decNum;
	}
	
	public static String fromBinToHex(String binNum)
	{
		String hexNum = "";
		
		return hexNum;
	}
	
	public static String fromDecToAny(int decNum, int desiredBase)
	{
		String newNum = "";
		
		return newNum;
	}
}
