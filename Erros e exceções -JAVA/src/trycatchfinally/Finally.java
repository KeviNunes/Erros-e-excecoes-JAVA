package trycatchfinally;

public class Finally {

	public static void main(String[] args) {
		// Declaração dos arrays
		int[] num = {4,8,18,32,64,128};	// Array com os numeradores
		int[] deno = {2,0,4,8,0};	// Array com os denominadores
		
		for(int i=0; i<num.length; ++i) {
			
			try {
				// Realização da divisão entre os arrays
				System.out.println(num[i]+"/"+deno[i]+"="+(num[i]/deno[i]));
			}
			catch(ArithmeticException e) { // Exceção aritmética
				System.out.println("ERRO: Tentativa de divisão por zero");
			}
			catch(ArrayIndexOutOfBoundsException e1){ // Exceção de posicionamento de array
				System.out.println("ERRO: Tentativa de acessa uma posição inválida de um vetor");
			}
			catch(Throwable exe) {	// Exceção genérica
				System.out.println("Houve um erro");
			}
			finally{ // Codigo executado independentemente de erros ou exceções
				System.out.println("Terminando a execução do bloco try");
				System.out.println();
			}
			
		}
	}
}
