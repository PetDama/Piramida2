import java.util.Scanner;

public class Piramida2 {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Piramida2(sc);
	}
	
	public static void Piramida2(Scanner sc) {
		System.out.println("Introduceti numarul de randuri: ");
		int a = sc.nextInt();
		int b = 1;
		for(int i=1; i<=a; i++) {
			for(int j=1; j < a-i+1; j++) {
				System.out.print(" ");
			}
		for(int k=1; k<=b; k++) {
			System.out.print(b + " ");
		}
		System.out.println(" ");
		b++;
		}
	}
}