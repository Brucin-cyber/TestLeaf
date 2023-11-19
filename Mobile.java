package weekday.day1;

public class Mobile {

	public void makeCall()
	{
		String mobileModel = "Samsung 420";
		float mobileWeight = 2.5f;
		System.out.println("Mobile Model: "+mobileModel);
		System.out.println("Mobile Weight: "+mobileWeight);
	}
	public void sendMsg()
	{
		boolean isFullCharged=true;
		int mobileCost=8000;
		System.out.println("Mobile Charging: "+isFullCharged);
		System.out.println("Mobile Cost: " +mobileCost);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is my Mobile\n");
		Mobile mc=new Mobile();
		mc.makeCall();
		mc.sendMsg();
	}

}
