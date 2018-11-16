package prob02;

import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Goods[] a = new Goods[3]; 
		
		for(int i=0; i<a.length; i++) {
			System.out.print("입력 : ");
			String line = scanner.nextLine();
			String[] infos = line.split(" ");
			
			System.out.println(infos[0] + "(가격:" + 
							   infos[1] + " 원)이 " + 
							   infos[2] + "개 입고 되었습니다.");
		}
		
		scanner.close();

	}

}
