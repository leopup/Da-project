import java.util.Scanner;
public class Madlib {	
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		
		String mvmnt = "";
		String color = "";
		String animal = "";
		String scndAnimal = "";
		
		System.out.println("Type an action such as flying and press enter.");
		mvmnt = scnr.nextLine();
		System.out.println("Type a color and press enter.");
		color = scnr.nextLine();
		System.out.println("Type an animal and press enter.");
		animal = scnr.nextLine();
		System.out.println("Type another animal and press enter.");
		scndAnimal = scnr.nextLine();
		System.out.println("The animal of your creation is a " + mvmnt + " " + color + " " + animal + " " + scndAnimal);
		System.out.print("Nice one, very CRANE-ATIVE, AHAHAAHAHAHAHAHAHAHAHAAAAAAAAAAAAAAA");
		
		return;
	}
}