package methodoverloading;

public class methodoverloading {
	double add(int x,double y) {
		return(x+y);
		
	}
	double add(double x,int y) {
		return(x+y);
		
	}
	double add(double x,int y,float z) {
		return(x+y+z);
	}
public static void main(String[]args) {
	int a=5;
	double b= 7.5;
	float c = 4.5f;
	double result;
	 methodoverloading obj = new  methodoverloading();
	 result=obj.add(a, b);
	 System.out.println("addition is:"+result);
	 result=obj.add(b, a);
	 System.out.println("addition is:"+result);
	 result=obj.add(b,a,c);
	 System.out.println("addition is:"+result);
	
}
}


	
