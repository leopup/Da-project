package somany;

public class compound {
	public static void main(){
		double amount;
		double principle = 10000;
		double rate = .01;
		
		for(int day=1;day<=20;day++){
			amount=principle*Math.pow(1+rate, day);
			System.out.println(day + "  " amount);
		}
	}

}
