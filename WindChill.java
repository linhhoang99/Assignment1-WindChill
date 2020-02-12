import java.util.Scanner;
public class WindChill {

	public static void main(String[] args) 
	{
		double temp, windSpeed, windChill;
		final String name = "Anh Tu Linh Hoang";
		
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		//Display header
		System.out.println("Wind Chill Calculator\n");
		
		//Get tempurature
		System.out.println("Enter the temperature in Fahrenheit (must be >= -45 and <= 40): ");
		temp = input.nextDouble();
		
		//Get the wind speed
		System.out.println("Enter the wind speed (must be >= 5 and <= 60): ");
		windSpeed = input.nextDouble();
		
		//Close Scanner
		input.close();
		 
		//Check the input number
		if ( !(temp>= -45 && temp <=40) || !(windSpeed >=5 && windSpeed <= 60)) 
			System.out.println("Invalid Input");
		else
		{
			//Calculate the wind chill
			windChill = 35.74 + 0.6215 * temp - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temp * Math.pow( windSpeed, 0.16);
		
			//Display result
			System.out.println("\nWind Chille tempurature: "+ windChill );
		}
		
		//Display programmer name
		System.out.println("\nProgrammer: " + name);
		
	}

}
