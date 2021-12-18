import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero");
		int m = sc.nextInt();

		for (int i = 0; i < m; i++) {
			if (i % 2 == 1 && i != 1 || i == 2) {
				System.out.println(i);
			}

		}
		sc.close();
	}

}
