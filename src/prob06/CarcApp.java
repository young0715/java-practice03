package prob06;

import java.util.Scanner;

public class CarcApp {

	public static void main(String[] args) {
		int result=0;
		double d_result=0.0;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.print(">>");
			String line = scanner.nextLine();

			//한자리 사칙연산(두자리 수로 안됨 )
			String[] tokens = line.split("");
			
			for(int i =0; i<tokens.length; i++) {
				switch(tokens[1]){
					case "+" : 
						Add add = new Add();
						add.setValue(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[2]));
						result = add.calculate();
						break;
					case "-" :
						Sub sub = new Sub();
						sub.setValue(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[2]));
						result = sub.calculate();
						break;
					case "*" :
						Mul mul = new Mul();
						mul.setValue(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[2]));
						result = mul.calculate();
						break;
					case "/" :
						Div div = new Div();
						div.setValue(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[2]));
						d_result = div.calculate();
						break;
					default :
						break;
				}
			}
			if(tokens[1] == "/") {
				System.out.println(d_result);
			}
			else {
				System.out.println(result);
			}
			
		}
	
	}

}
