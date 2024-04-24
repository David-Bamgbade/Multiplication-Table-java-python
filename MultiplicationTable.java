public class MultiplicationTable {
	public static void main(String[] args) {

       int result = 0;
       int counter = 0;
       int count = 0;

	for (counter = 1; counter <= 12; counter++) {
	
		for (count = 1; count <= 12; count++) {
      	
        		result = counter * count;            
           
        		System.out.printf("%s * %s = %d\t", counter, count, result);
		}
        System.out.print("\n"); 
	} 


}
}