package week1.day2;
public class MyMobile {
	static char brandName = 'R';
	static short costMobile = 30000;
	static boolean isTouchScreen = true;
	static long number = 9888989998l;
	static float version = 3.45f;
public void makeCall() {
	System.out.println("makeCall");
	}
public void sendMsg() {
	System.out.println("sendMsg");
}
private void payBills() {
	System.out.println("payBills");
}
public static void main(String[]args) {
	System.out.println(brandName);
	System.out.println(costMobile);
	System.out.println(isTouchScreen);
	System.out.println(number);
	System.out.println(version);
	MyMobile obj=new MyMobile();
	obj.makeCall();
	obj.sendMsg();
	obj.payBills();
}
}