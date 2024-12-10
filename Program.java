package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		double[] vectA = new double[n];
		double[] vectB = new double[n];
		System.out.println("Digite os valores do vetor A:");
		
		for (int i = 0; i < n; i++) {
			vectA[i] = sc.nextDouble();
			
		}
		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < n; i++) {
			vectB[i] = sc.nextDouble();
			
		}
		System.out.println("VETOR RESULTANTE:");
		for (int i = 0; i < n; i++) {
			double c = vectA[i] + vectB[i];
			System.out.printf("%.0f%n",c);
		}
		
		sc.close();
		
	}
}
