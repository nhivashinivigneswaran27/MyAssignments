package week1.day1;

public class Mobile 
{
	String mobileBrandName="Samsung";
	char mobileLogo='S';
	short noOfMobilePiece=4;
	int modelNumber=4543;
	long mobileImeiNumber=345981930849l;
	float mobilePrice=42000;
	boolean isDamaged=false;

public void makeCall() 
{

System.out.println("Mobile can be used for call");
}
public void makeMsg() {
	
System.out.println("Mobile can be used for message");
}

public static void main(String[] args) {
	
	Mobile action=new Mobile();
	action.makeCall();
	action.makeMsg();
	TwoWheeler splen=new TwoWheeler();
	System.out.println(action.mobileBrandName);
	System.out.println(action.mobileLogo);
	System.out.println(action.mobilePrice);
	System.out.println(action.modelNumber);
	System.out.println(action.mobileImeiNumber);
	System.out.println(action.mobilePrice);
	System.out.println(action.isDamaged);
	
}
	
}
