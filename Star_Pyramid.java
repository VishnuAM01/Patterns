package patterns;
import java.util.*;

public class Star_Pyramid {
	public static void main(String[] args) {
		int height;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines or height required: ");
		height=sc.nextInt();
		
		for(int i=1;i<=height;i++) {
			int x=height-i;
			//Leading spaces in each line
			while(x>0) {
				System.out.print(" ");
				x--;
			}
			//Printing 2*i-1 stars ineach line
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			//new row
			System.out.println();
		}
		sc.close();
	}
}
