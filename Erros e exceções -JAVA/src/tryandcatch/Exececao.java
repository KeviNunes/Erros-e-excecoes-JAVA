package tryandcatch;

public class Exececao {

	public static void main(String[] args) {
		try {
			// Declaração de um vetor
			int[] vetor = new int[4];
			
			System.out.println("Antes da execeção");
			
			// Inserção de um valor em uma posição inexistente - EXCEÇÃO
			vetor[4]=10;
			
			System.out.println("Esse texto não será impresso");
			
		}catch(Exception e) {
			
			// Comparação da classe causadora do erro
			// com uma classe já esperada
			if(e.getClass() == ArrayIndexOutOfBoundsException.class)
				System.out.println("ERRO: Possição de vetor inválido");
		}
	}
}