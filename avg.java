import java.util.Scanner;

public class avg {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Tamil mark: ");
	int TM=sc.nextInt();
	System.out.print("Enter the English mark: ");
	int EM=sc.nextInt();
	System.out.print("Enter the Maths mark: ");
	int MM=sc.nextInt();
	System.out.print("Enter the Science mark: ");
	int SCM=sc.nextInt();
	System.out.print("Enter the Social mark: ");
	int SM=sc.nextInt();
	int total=TM+EM+MM+SCM+SM;
	float avg=((float)total/5);
	System.out.println("The Total mark is= "+total);
	System.out.println("The Percentage is= "+avg);
}
}