import java.util.Scanner;

public static void main(){
	Scanner scNr = new Scanner(System.in);
	int inTime = 0;
	int secTime = 0;
	int minTime = 0;
	int hourTime = 0;
	
	System.out.println("Type intial number.");
	inTime = scNr.nextint();
	
	secTime = inTime % 60;
	minTime = inTime / 60;
	hourTime = minTime / 60;
	minTime = minTime % 60;
	
	System.out.println("Here are the hours, mins, and secs: " + hoursTime + minTime + secTime);
}