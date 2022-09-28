import java.util.Scanner;
import java.text.DecimalFormat;

public class BillReceipt{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String formatter = "##,###,###.##";
        DecimalFormat df = new DecimalFormat(formatter);
		
		System.out.print("\n================================================================\n");
		System.out.print("\nBill Receipt for Electricity\n");
		System.out.print("\n================================================================\n");
		
		System.out.print("\nFirst Name of Consumer: ");
		String fname = input.next();
		System.out.print("Last Name of Consumer:  ");
		String lname = input.next();
		System.out.print("Account Number: ");
		String accno = input.next();
		System.out.print("Date of charge: ");
		String dateC = input.next();
		System.out.print("Current Kwh used: ");
		double consume = input.nextDouble();
		System.out.print("Previous Kwh used: ");
		double consume2 = input.nextDouble();

		double past = 12.89 * consume ;
		double tax2 = past * 0.007;
		double pastbill = past + tax2;

		double num1 = 13.89 * consume;
		double tax = num1 * 0.007;
		double totalD = num1 + tax;

		double gen1 = 1.8876579 * consume;
		double tran1 = 0.9987 * consume;
		double totalgen = gen1 + tran1;

		double totalall = totalD + totalgen;

		System.out.print("\n===============================================================\n");
		System.out.print("Official Receipt Report");
		System.out.print("\n===============================================================\n");

		System.out.println("\nAcount Number:                                   "+accno);
		System.out.println("Consumer Name:                                     "+fname+" "+lname);
		System.out.println("Current Electricity:                               "+consume+"kWh");
		System.out.println("Previous Electricity:                              "+consume2+"kWh");
		System.out.println("Previous Payment (13.89 per kW)h:                  "+df.format(pastbill));
		

		System.out.print("\n________________________________________________________________\n");

		System.out.println("\nDistribution Charge	                           ");
		System.out.println(" Residential rate month of:                        "+dateC);
		System.out.println(" Charge at 13.89 per kWh:                          "+df.format(num1));
		System.out.println(" Tax 0.7%:                                         "+df.format(tax));

		System.out.println("\nTotal Distribution Charges                      P"+df.format(totalD));

		System.out.println("\nGeneration Charge & Transmission for "+dateC);
		System.out.println(" Generation Charge at 1.8876579 per kWh:           "+df.format(gen1));
		System.out.println(" Transmission Charge at 0.9987 per kWh:            "+df.format(tran1));

		System.out.println("\nTotal Generation & Transmission charges         P"+df.format(totalgen));
		
		System.out.print("\n________________________________________________________________\n");
		
		System.out.print("\n===============================================================\n");
		System.out.println("\nAmount balance                                  P"+df.format(totalall));
		System.out.print("\n===============================================================\n");










		

		








	}
}