package week1.day2;

public class Calculator {
	
       public void add() {
    	   int a = 5;
    	   int b = 6;
    	   int c = 7;
    	   int sub = a+b+c;
    			   
    	   System.out.println("addition of a+b+c is " + sub);
       }
	  public void sub() {
		  int d = 33;
		  int e = 11;
		  int f = d-e;
		  
		  System.out.println("subtraction of d-e is " + f);
	  }
	  public void mul() {
		  double g = 450.892d;
		  double h = 7895.234d;
		  double i = g*h;
		  
		  System.out.println("multiplication of g*h is " + i); 
	  }
	  public void div() {
		  float j = 9.8f;
		  float k = 6.5f;
		  float l = j/k;
		  System.out.println("division of j/k is " + l);
	  }
}

