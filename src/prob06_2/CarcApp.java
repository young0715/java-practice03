package prob06_2;

import java.util.Scanner;

//강사님께서 푼 코드
public class CarcApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			//1. 입력
			System.out.print(">>");
			String line = scanner.nextLine();
			String[] tokens = line.split(" ");

			int lValue = Integer.parseInt(tokens[0]);
			int rValue = Integer.parseInt(tokens[2]);

			//2. 처리	 //연산 객체 arith 생성
			Arith arith = null;
			switch (tokens[1]) {
				case "+": {
					arith = new Add();
					break;
				}
				case "-": {
					arith = new Sub();
					break;
				}
				case "*": {
					arith = new Mul();
					break;
				}
				case "/": {
					arith = new Div();
					break;
				}
				case "%" : {
					arith = new Mod();
					break;
				}
				default: {
					System.out.println("지원하지 않는 연산 입니다.");
					break;
				}
			}
			
			//3. 출력
			if(arith == null) {
				System.out.println("지원하지 않는 연산 입니다.");
				return;
			}

			arith.setlValue(lValue);
			arith.setrValue(rValue);
			System.out.println(">>" + arith.calc());
		}
	}
}

