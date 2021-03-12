package reviewclass4;

public class NesteForLoop3 {
public static void main(String[] args) {
	for (int i=0; i<5; i=i+1) {
		System.out.println("Outer Loop");
		for (int j=0;i<5; j=j-i) {
			//          WHEN WE WILL BE ENTERING THE LOOP THESE 2 STAEMENTS WILL BE EXECuTED j=0;i<5
			// After that all of the code inside the loop will be executed and the j=j-i and the condition will be
			// checked i<5; after that 
			// j=j-i
			//i<5;
			System.out.println(i+" "+j);
			i++;
		}
	}
	System.out.println("i");
}
}
