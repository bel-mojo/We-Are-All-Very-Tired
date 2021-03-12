package reviewclass3;

public class LogicalOperators2 {

	public static void main(String[] args) {
		
int num=10;
if (num>=0) {
	if (num<=100) {
		System.out.println("0-100");
	}
}else {
	System.out.println("Out of range");
}
if (num>=0 && num<=100) {
	System.out.println("0-100");
}else {
	System.out.println("Out of range");
}

	}

}
