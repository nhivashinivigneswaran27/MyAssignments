package week1.day1;

public class TwoWheeler 
{
	int noOfWheels=6;
	short noOfMirrors=4;
     long chassisNumber=123456789453L;
	boolean isPunctured=true;
	String bikeName="Splender";
	double runningKM=40.56;
	
	public static void main(String[] args) 
	{
		TwoWheeler splen=new TwoWheeler();
		System.out.println(splen.noOfWheels);
		System.out.println(splen.noOfMirrors);
		System.out.println(splen.chassisNumber);
		System.out.println(splen.isPunctured);
		System.out.println(splen.bikeName);
		System.out.println(splen.runningKM);
		
	}

}
