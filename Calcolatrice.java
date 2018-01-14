
public class Calcolatrice {

	public int ans;

	public Calcolatrice() {
		ans=0;

	}

	public int add(int a, int b) {
		return ans=a+b;
	}

	public int sub(int a, int b) {
		return ans=a-b;
	}

	//somma y resta el resultado anterior
	public int addAns(int a) {
		return ans+=a;
	}
	public int subAns(int a) {
		return ans-=a;
	}

	public int getAns() {
		return ans;
	}

	public int fullCal(int option , int op1, int op2) {
		int result=0;
		switch(option) {
		case 1:
			result=this.add(op1, op2);

			break;
		case 2:
			result=this.sub(op1, op2);

			break;
		default: 
			result=0;

		}
		return result;
	}

}
