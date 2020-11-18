package daily_assignments.assign9;

import java.util.Scanner;

public class LaptopPrice {

	public static void main(String[] args) {
		
		double price = 0.0;
		
		System.out.println("enter screen size: 13.3 / 15.0  / 17.3");
		Scanner scan = new Scanner(System.in);
		String screenSize = scan.nextLine();
		
		switch(screenSize) {
		case "13.3":
			price+=200;
			break;
		case "15.0":
			price+=300;
			break;
		case "17.3":
			price+=400;
			break;
			default:
				System.out.println("invalid size");
		}System.out.println(price);
		System.out.print("enter  your cpu type: i3 / i5 /i7");
		String cpu = scan.nextLine();
		if( cpu.equals("i3")) {
			price+=150;
			
		}else if(cpu.equals("i5")) {
			price+=250;
		}else if(cpu.equals("i7")) {
			price+=350;
		}System.out.println(price);
		
		System.out.println("enter RAM size");
		int ram = scan.nextInt();
		int ramPrice= (ram/4)*50;
		price=price+ramPrice;
		
		System.out.println(price);
		
		System.out.print("enter  your storage type: ssd/hdd");
		scan.nextLine();
		String storage = scan.nextLine();
		if( storage.equals("ssd")) {
			price+=100;
			
		}else if(storage.equals("hdd")) {
			price+=50;
		}System.out.println(price);
		System.out.println();
		System.out.print("enter  your screen resolution FullHD / 4K");
		
		String res = scan.nextLine();
		if( res.equals("FullHD")) {
			price+=100;
			
		}else if(res.equals("4K")) {
			price+=200;
		
		}System.out.println("laptop price is: "+price);
		
		
		

	}

}
