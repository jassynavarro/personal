package Codes;
import java.util.Scanner;
public class Switch_Statements {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in); //Instantiation

		int month; //Variables
		int date;
		int year;
		
		System.out.print("Input a month as integer (1-12): "); 
		month = scan.nextInt();  // call of user
		
		System.out.print("Input a date as integer (1-31): "	);
		date = scan.nextInt(); 
		
		System.out.print("Input a year as integer: " 		);
		year = scan.nextInt(); 
		
		System.out.println(); //space
		
		switch(month) {
		
			case 1:
				System.out.println("Month: " + month);
				System.out.println("Date: "  + date	);
				System.out.println("Year: "  + 	year);
				System.out.println();
				System.out.println("January " + date + ", " + year);
				break;
			case 2:
				System.out.println("Month: " + month);
				System.out.println("Date: "  + date	);
				System.out.println("Year: "  + 	year);
				System.out.println();
				System.out.println("February " + date + ", " + year);
				if(date > 28) { //conditional statement for month with 28 days
					System.out.println("Invalid date");
				}
				break;
			case 3:
				System.out.println("Month: " + month);
				System.out.println("Date: "  + date	);
				System.out.println("Year: "  + 	year);
				System.out.println();
				System.out.println("March " + date + ", " + year);
				break;
			case 4:
				System.out.println("Month: " + month);
				System.out.println("Date: "  + date	);
				System.out.println("Year: "  + 	year);
				System.out.println();
				System.out.println("April " + date + ", " + year);
				if(date > 30) { //conditional statement for months with 30 days
					System.out.println("Invalid date");
				}
				break;
			case 5:
				System.out.println("Month: " + month);
				System.out.println("Date: "  + date	);
				System.out.println("Year: "  + 	year);
				System.out.println();
				System.out.println("May " + date + ", " + year);
				break;
			case 6:
				System.out.println("Month: " + month);
				System.out.println("Date: "  + date	);
				System.out.println("Year: "  + 	year);
				System.out.println();
				System.out.println("June " + date + ", " + year);
				if(date > 30) {
					System.out.println("Invalid date");
				}
				break;
			case 7:
				System.out.println("Month: " + month);
				System.out.println("Date: "  + date	);
				System.out.println("Year: "  + 	year);
				System.out.println();
				System.out.println("July " + date + ", " + year);
				break;
			case 8:
				System.out.println("Month: " + month);
				System.out.println("Date: "  + date	);
				System.out.println("Year: "  + 	year);
				System.out.println();
				System.out.println("August " + date + ", " + year);
				break;
			case 9:
				System.out.println("Month: " + month);
				System.out.println("Date: "  + date	);
				System.out.println("Year: "  + 	year);
				System.out.println();
				System.out.println("September " + date + ", " + year);
				if(date > 30) {
					System.out.println("Invalid date");
				}
				break;
			case 10:
				System.out.println("Month: " + month);
				System.out.println("Date: "  + date	);
				System.out.println("Year: "  + 	year);
				System.out.println();
				System.out.println("October " + date + ", " + year);
				break;
			case 11:
				System.out.println("Month: " + month);
				System.out.println("Date: "  + date	);
				System.out.println("Year: "  + 	year);
				System.out.println();
				System.out.println("November " + date + ", " + year);
				if(date > 30) {
					System.out.println("Invalid date");
				}
				break;
			case 12:
				System.out.println("Month: " + month);
				System.out.println("Date: "  + date	);
				System.out.println("Year: "  + 	year);
				System.out.println("");
				System.out.println("December " + date + ", " + year);
				break;
			default:
				System.out.println("Invalid"); //Month is invalid
				
			} if(date > 31 || date < 0) {System.out.println("Invalid date"); //conditional statement for dates more than 31
		
		}

			
			scan.close();
	}

} // can use a variable string monthWord
