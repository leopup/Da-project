import java.util.Random;

package Randomness;

public class FINALY {
	public static void main(){
		Random box = new Random();
		int number;
		
		for(int counter=1; counter<=10; counter++){
			number = 1+box.nextInt(6);
			System.out.printIn(number + " ");
		}
		
	}

}
