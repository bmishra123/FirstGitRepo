package testclass;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		int a,b,c;
		a=2;
		b=3;
		c=sum(a,b);
		
		System.out.println(c);
		
		
		

	}
	
	public static int sum(int x,int y) {
		int result=add(x,y);
		return result;
		
	}
public static int add(int f,int h) {
	int sum=f+h;
	return sum;
	
}
}
