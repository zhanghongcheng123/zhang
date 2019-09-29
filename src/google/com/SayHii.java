public class SayHii{
	public static void main(String[] args){
		//System.out.println("Say Hii");
		sayHii(sum());
	}
	public static void sayHii(int sum){
		System.out.println("Say Hii"+sum);
	}
	public static int sum(){
		int sum=0;
		for(int i=0;i<=100;i++){
			sum+=i;
		}
		return sum;
	}
}