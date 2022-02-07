package prob1_31jan;

import java.util.Scanner;

public class Mainpage {

	public static void main(String[] args) {
		System.out.print("\nHotel Tariff Calculator\n" +
                "--------------------------------------------\n" +
                "1. Deluxe room\n" +
                "2. Deluxe Ac Room\n" +
                "3. Suite Ac Room\n" +
                
                "--------------------------------------------\n" +
                "Select a room type:\n");
		//object creation
		SuiteRoom s1 = new SuiteRoom(null,0,null,null,0);
		DeluxeSeaViewRoom d2 = new DeluxeSeaViewRoom();
		DeluxeRoom d1 = new DeluxeRoom();
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println("enter the hotel name");
		String b = input.next();
		d2.setHotelName(b);
		System.out.println("enter sqfeet");
		int c = input.nextInt();
		d2.setNumberOfSqFeet(c);
		System.out.println("Hastv or not");
		boolean d = input.nextBoolean();
		d2.setHasTv(d);
		System.out.println("Haswifi or not");
		boolean e = input.nextBoolean();
		d2.setHasWifi(e);
		//switch case
		switch(a) {
		case 1: 
			int f = d2.calculTarrif(c,d1.getratePerSqFeet(d2.isHasWifi()));
			System.out.println("room tarrif is"+f);
			break;
		
		case 2:
			int g = d2.calculTarrif(c,d2.getratePerSqFeet(d2.isHasWifi()));
			System.out.println("room tarrif is"+f);
			break;
		case 3:
			int h = d2.calculTarrif(c,d1.getratePerSqFeet(d2.isHasWifi()));
			System.out.println("room tarrif is"+f);
			break;
		default:
			System.out.println("invlaid input");
		}
	}
}
