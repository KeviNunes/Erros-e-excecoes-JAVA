package exception;

import java.util.Scanner;

public class Throws {

	public static void main(String[] args) {
		
		System.out.print("Insira um valor decimal: ");
		
		try {
			double num = lerDouble();
			System.out.println("Você digitou: "+num);
		}
		catch (Exception e) {
			System.out.println("Entrada inválida");
			e.printStackTrace();
		}
		
	}
	
	public static double lerDouble() throws Exception {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble(); sc.close();
		return num;
	}
	
}