package practice;

public class LetterG {

	public static void main(String[] args) {

		int rows = 7;
		int cols = 6;

		for (int i = 1; i <= rows; i++) {

			for (int j = 1; j <= cols; j++) {

				if ((i == 1 && j > 1) ||              // top line
					(i == rows && j > 1) ||          // bottom line
					(j == 1 && i > 1 && i < rows) || // left line
					(i == 4 && j >= 4) ||            // middle line
					(j == cols && i >= 4 && i < rows)) { // right line

					System.out.print("* ");
				} else {
					System.out.println("  ");
				}
			}

		
		}
	}
}