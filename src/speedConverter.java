
public class speedConverter {
	
	public static long toMilesPerHour(double kilometersPerHour) {
		if(kilometersPerHour <0) {
			return -1;
		}
//		long milePerHour = Math.round(kilometersPerHour/1.609);
//		return milePerHour;
		return Math.round(kilometersPerHour/ 1.609);
	}
	public static void printConversion(double kilometersPerHour) {
		if(kilometersPerHour <0) {
			System.out.println("Invalid Value");
		}else {
			long milesPerHour = toMilesPerHour(kilometersPerHour);
			System.out.println(+kilometersPerHour +
					"Km/h= "+ milesPerHour +
					"mi/h");
		}
	}

}
	
	
	
	
	
	
	
	
	
	 
//	public static long toMilesPerHour(double kilometersPerHour) {
//		if (kilometersPerHour < 0 ) {
//			return -1;
//		}
//		
////		long milesPerHours = Math.round(kilometersPerHour/1.609);
////		return milesPerHours;
//		
//		//or 
//		return Math.round(kilometersPerHour/1.609);
//	
//		
//	}
//	public static void printConversion(double kilometersPerHours) {
//		
//		if (kilometersPerHours <0) {
//			System.out.println("invalid value");
//		}else {
//			long milesPerHours = toMilesPerHour(kilometersPerHours);
//			System.out.println(kilometersPerHours +
//					"km/h= " + milesPerHours +
//					 "mi/h");
//		}
//		
//	}
//}
