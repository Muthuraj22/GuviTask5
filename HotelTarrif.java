package task5java;

import java.util.Scanner;

public class HotelTarrif {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int month = sc.nextInt();
		float rent = sc.nextFloat();
		int Totaldays = sc.nextInt();

		boolean isPeakSeason = false;
		
		switch(month) {
		case 4:
			isPeakSeason = true;
			break;
		case 5:
			isPeakSeason = true;
			break;
		case 6:
			isPeakSeason = true;
			break;
		case 11:
			isPeakSeason = true;
			break;
		case 12:
			isPeakSeason = true;
			break;
		
			default:
				isPeakSeason = false;
		}
		double TotalTariff = rent * Totaldays;
		
		if(isPeakSeason) {
			TotalTariff += TotalTariff *0.20;
		}
	System.out.printf("%.2f", TotalTariff);
		sc.close();
	}

}
