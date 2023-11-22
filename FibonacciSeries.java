package weekday.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		int firstNum=0;
		int secondNum=1;
		for(int i=1;i<=n;i++)
		{
			System.out.println(+firstNum);
			int nextNum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=nextNum;
			
		}
		

	}

}
