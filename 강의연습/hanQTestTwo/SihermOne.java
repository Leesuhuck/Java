package hanQTestTwo;

public class SihermOne {
	
	static String AhYes 	= "훗";
	static String ResultSum = "";

	public static void main (String[] arsg) {
		
		dehagi(AhYes,5);
		
		System.out.println(AhYes + ResultSum);
		
	}
	
	public static void dehagi(String uaakStr, int suaakk) {
		
		String iGeMo 	= uaakStr;
		int aiGo 		= suaakk;
		
		ResultSum 		= iGeMo+aiGo; 
		
	}
}
