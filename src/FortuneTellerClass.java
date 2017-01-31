import java.util.Scanner;

public class FortuneTellerClass {

	public static void main(String[] args) {

		new FortuneTellerClass();
		boolean useFortuneTeller = true; // test at end to see if user would
											// like to
		Scanner scanner = new Scanner(System.in); // open input\

		String savings = "0"; // savings have
		String location = ""; // city will live
		String car = ""; // will drive

		do {
			System.out.println("What is your first name?");
			String firstNm = scanner.next().toLowerCase();
			System.out.println("What is your last name? ");
			String lastName = scanner.next().toLowerCase();
			System.out.println("How old are you? "); // age
			int age = scanner.nextInt();
			System.out.println("What month were you born? "); // month
			String month = scanner.next().toLowerCase();
			System.out.println(" How many sibling's do you have");
			int siblings = scanner.nextInt();
			System.out.println("Which of ROYGBIV is your favorite color");
			String Roygbiv = scanner.next().toLowerCase();

			switch (Roygbiv) {
			case "o":
				Roygbiv = "orange";
				car = "Yatch";
				break;

			case "y":
				Roygbiv = "yellow";
				car = "Airplane";
				break;
			case "r":
				Roygbiv = "red";
				car = "Truck";
				break;
			case "g":
				Roygbiv = "green";
				car = "XL Yatch";
				break;
			case "b":
				Roygbiv = "blue";
				car = "SUV";
				break;
			case "i":
				Roygbiv = "indigo";
				car = "Moped";
				break;
			case "v":
				Roygbiv = "violet";
				car = "Prius";
				break;
			}

			int limit = 150;
			String retire;
			for (age = 1; age <= limit; age++)
				// if number is not devisible by 2 it is odd
				if (age % 2 != 0)
					;
			{
				retire = "ten ";
			}
			if (age % 2 == 0)
				;
			{
				retire = "fifteen ";
			}

			String combined = firstNm.concat(lastName);
			String FirstLtrofMth = month.substring(0, 1).toLowerCase();
			String SecondLtrofMth = month.substring(1, 2).toLowerCase();
			String ThirdLtrofMth = month.substring(2, 3).toLowerCase();

			if (combined.contains(FirstLtrofMth))
				;
			{
				savings = "100,000,000$";
			}
			if (combined.contains(SecondLtrofMth))
				;
			{
				savings = "42$";
			}
			if (combined.contains(ThirdLtrofMth))
				;
			{
				savings = "130,800,100";
			}

			if (siblings == 1) {
				location = "Fiji ";
			} else if (siblings == 2) {
				location = "Columbus ";
			} else if (siblings <= 3) {
				location = "NYC ";
			} else if (siblings == 0) {
				location = "Tempe";
			}
			System.out.println(firstNm + " " + lastName + " will retire within " + retire + " years with " + savings
					+ " in the bank, a vacation home in " + location + " and a " + car + " to travel with. ");
		} while (useFortuneTeller);
		{
			String reply = scanner.next().toLowerCase();
			System.out.println("Would you like to try again?");
			useFortuneTeller = reply.equals("yes");
		}
		scanner.close();
	}
}
