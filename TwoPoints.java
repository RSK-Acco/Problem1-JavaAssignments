package prob1;
import java.util.*;
public class TwoPoints {
	
	static int compute(int x,int y) {
		while(true) {
			if(x==y) break;
			x=(x+2)%12;
			y=(y+1)%12;
		}
		return (x==0?12:x);
	}
	
	public static void main(String[] args) {
		int x,y;
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter the Points to find the intercept: ");
		x=inp.nextInt(); y=inp.nextInt();
		System.out.print("The point at which they meet each other is: "+compute(x,y));

	}

}
