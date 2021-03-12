package reviewclass4;

public class Recap {
public static void main(String[]args) {
	
	int i=10;
	
	i=10;
	System.out.println(" ++i"+(++i)); // First increment value then use it 
	System.out.println("i++ "+(i++));// First use the value then increment  // In the next sys.out. it will reflect
	
	System.out.println("---------------------------------");
	i=10;
	System.out.println(" --i"+(--i));
	System.out.println("i-- "+(i--));
	System.out.println(i);
	
	i=10;
	System.out.println(" ++i"+(++i+(++i)));
	System.out.println("i++ "+(i+++i++));
	
	
	
}
}
