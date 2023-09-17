//2-11
import java.util.Scanner;

public class MutipleOfThree {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("수를 입력하세요");
		int number = in.nextInt();
		
		if(number%3==0)
			System.out.println("3의 배수입니다");
		else
			System.out.println("3의 배수가 아닙니다.");
		
		//scanner.close(); 작동 안함
	}
}
