package Day12Patterns;

public class Pattern6 {

	public static void main(String[] args) {
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < 26; j++) {
				System.out.print((char) (97 + j) + " ");  //97 small a , 65 capital A
			}
			System.out.println();
		}

	}

}
