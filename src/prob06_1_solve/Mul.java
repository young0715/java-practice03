package prob06_1_solve;

public class Mul {
	private int lValue;
	private int rValue;
	
	public int getlValue() {
		return lValue;
	}

	public void setlValue(int lValue) {
		this.lValue = lValue;
	}

	public int getrValue() {
		return rValue;
	}

	public void setrValue(int rValue) {
		this.rValue = rValue;
	}
	
	public int calc() {
		return lValue * rValue;
	}
}
