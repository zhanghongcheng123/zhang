import java.util.Scanner;

public class Call{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入你的年龄:");
		int age = scan.nextInt();
		int mean = age/15;
		switch(mean){
			case 0:
			System.out.print("小姐姐！");
			break;
			default:
			System.out.print("大姐姐！");
			break;
			}
			scan.close();
	}
}