package patterns;

public class Pyramids {
	public static void main(String[] args) {
		int number = 10;
		int numberOfStars = 10;
		for (int row = 1; row <= number; row++) {
			for (numberOfStars = 1; numberOfStars <= row; numberOfStars++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = number; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
