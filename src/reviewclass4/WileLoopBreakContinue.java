package reviewclass4;

public class WileLoopBreakContinue {

	public static void main(String[] args) {
		int i=10;
		while (i<15) {
			System.out.println("Infinity");
			if (i<15) {
				break;
			}else {
				System.out.println("Hi");
			}
			i++;
		}
System.out.println("After the loop");
	}

}
