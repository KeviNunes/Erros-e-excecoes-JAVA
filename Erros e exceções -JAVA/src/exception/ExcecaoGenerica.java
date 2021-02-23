package exception;

public class ExcecaoGenerica {

	public static void main(String[] args) {
		// Declaração dos arrays
		int[] num = {4,8,18,32,64,128};	// Array com os numeradores
		int[] deno = {2,0,4,8,0};		// Array com os denominadores
		
		for(int i=0; i<num.length; ++i) {
			
			try {
				// Realização da divisão entre os arrays
				System.out.println(num[i]+"/"+deno[i]+"="+(num[i]/deno[i]));
			}
			catch(Exception e) { // Exceção aritmética
				System.out.println(e.getMessage());
				e.printStackTrace();
			}	
		}
	}
}