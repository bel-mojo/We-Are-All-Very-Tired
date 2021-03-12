package reviewclass3;

public class LogicalOperators {
	public static void main(String[]args) {
		
		/*logical operators are used to combine multiple conditions in the same block
		 * 
		 */
		String day="Sunday";
		System.out.println("Relax its the weeknd dont blink otherwise its over");
		
		if ("sunday".equals(day)) {
			System.out.println("Relax its the weeknd dont blink otherwise its over");	
		}else if (day.equals("saturday")) {
			System.out.println("Relax its the weeknd dont blink otherwise its over");
		}else {
			System.out.println("I have to go to work");
		}
		if ("Sunday".equals(day)|| day.equals("saturday")) {
		System.out.println("Relax its the weeknd dont blink otherwise its over");
		}else {
			System.out.println("I have to work");
		}
		
		
	}

}
