package eiei;
import java.util.Scanner;
public class BMI {
	public static void main(String[] args) {
                Scanner s1=new Scanner(System.in);
		System.out.print("请输入身高：");
		float a=s1.nextFloat();
		System.out.print("请输入体重：");
		float b=s1.nextFloat();
		float c=b/a/a;
		System.out.printf("%.2f\n",c );
		if(c<18.5){
			System.out.println("过轻");	
		}
		else if(c>=18.5 && c<25) {
			System.out.println("正常");
		}
		else if(c>=25 && c<28) {
			System.out.println("过重");
		}
		else if(c>=28 && c<32) {
			System.out.println("肥胖");
		}
		else {
			System.out.println("非常肥胖");
		}
           }
}
