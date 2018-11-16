package prob06;

import java.util.Scanner;

public class CarcApp2 {

	public static void main(String[] args) {
		int result=0;
		double d_result=0.0;
		String[] tokens = null;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.print(">>");
			String line = scanner.nextLine();

			if(line.indexOf("+") != -1) {
				tokens = line.split("\\+");
				for(int i =0; i<tokens.length; i++) {
					Add add = new Add();
					add.setValue(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
					result = add.calculate();
				}
				System.out.println(result);
			}
			else if(line.indexOf("-") != -1) {
				tokens = line.split("-");
				for(int i =0; i<tokens.length; i++) {
					Sub sub = new Sub();
					sub.setValue(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
					result = sub.calculate();
				}
				System.out.println(result);
			}
			else if(line.indexOf("*") != -1) {
				tokens = line.split("\\*");
				for(int i =0; i<tokens.length; i++) {
					Mul mul = new Mul();
					mul.setValue(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
					result = mul.calculate();
				}
				System.out.println(result);
			}
			else if(line.indexOf("/") != -1) {
				tokens = line.split("/");
				for(int i =0; i<tokens.length; i++) {
					Div div = new Div();
					div.setValue(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
					d_result = div.calculate();
				}
				System.out.println(d_result);
			}
			
		}
	
	}

}
