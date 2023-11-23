package weekday.day2;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elements1= {1,4,3,2,8,6,7};
		int e1=0, e2=0, missingno;
		for(int i=0;i<7;++i)
		{
			e1=e1+elements1[i];
			
		}
		System.out.println("The Missing Element is:");
		for(int j=1;j<=8;j++)
		{
			e2=e2+j;
		}
		missingno=e2-e1;
		System.out.println(missingno);
	}

}
