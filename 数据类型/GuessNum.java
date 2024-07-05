import java.util.*;


public class GuessNum {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		Random ran = new Random ();
		int ranNum = ran.nextInt(100)+100;
		while (true) {
			int num = scan.nextInt();
			if (num == ranNum) {
				System.out.println("bingo~");
				break;
			}
			else if (num < ranNum) {
				System.out.println("small!");
			}else if (num > ranNum) {
				System.out.println("big!");
			}
		}
	}
}