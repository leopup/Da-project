import java.util.Scanner;

public class HealthData{
	public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
      int userAgeYears = 0;
      int userAgeDays  = 0;
		int userAgeHours = 0;
		int userAgeMinutes = 0;
		int userAgeSeconds = 0;
		int userHeartBeats = 0;
		int userCalorieIntake = 0;
      
      System.out.println("Enter your age in years: ");
      userAgeYears = scnr.nextInt();
      
      userAgeDays = userAgeYears * 365;
		userAgeHours = userAgeDays * 24;
		userAgeMinutes = userAgeHours * 60;
		userAgeSeconds = userAgeMinutes * 60;
		userHeartBeats = userAgeDays * 115200;
		userCalorieIntake = userAgeDays * 2640;

      System.out.println("You are " + userAgeDays + " days, " + userAgeHours + " hours, " + userAgeMinutes + " minutes and " + userAgeSeconds + " seconds old");
		System.out.println("Your heart has beated " + userHeartBeats + " times");
		System.out.println("You have eaten " + userCalorieIntake + " calories worth of food.");
      
      return;
   }
}