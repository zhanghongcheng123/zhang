/**
* Descripton: Aligning Output of the 99 Multiplication Table
* Author:     Yang
* Date:       2019-9-18
*/
public class Multiplication{
	public static void main(String[] args){
		int i;
		int j;
		for(i = 1;i <= 9;i++){
			for(j = 1;j <= i;j++)
				System.out.print(i+"*"+j+"="+i*j+"  ");
			System.out.print("\n");
		}
	}
}