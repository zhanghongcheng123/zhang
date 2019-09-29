/**
* Descripton: Enter the number of layers of the pyramid to print the pyramid pattern
* Author:     chun
* Date:       2019-9-16
*/
import java.util.Scanner;

public class Pyramid{
 
    public static void main(String[] args){
  
    System.out.print("请输入金字塔的层数:");
  
    Scanner scan = new Scanner(System.in);
  
    int n = scan.nextInt();
  
    for(int i = 1;i <= n;i++){
       for(int j = 1;j <= n-i;j++){
        System.out.print(" ");
    }
    for(int j = 1;j <= i*2-1;j++){
     System.out.print("*"); 
    }
    System.out.print("\n"); 
    }
    scan.close();
    }
}