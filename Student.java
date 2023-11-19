package weekday.day1;

public class Student {
	public void report()
	{
		String stdname = "Brucin";
		String clgname = "MCC";
		int rollno = 007;
		float mrkscd = 74.01f;
		float cgpa = 7.1f;
		System.out.println("Student Name: "+stdname);
		System.out.println("Enter Rollno: "+rollno);
		System.out.println("College Name: "+clgname);
		System.out.println("Marks Scored: "+mrkscd);
		System.out.println("CGPA: "+cgpa);
	}

	public static void main(String[] args) {
		Student repor =new Student();
		repor.report();
	}

}
