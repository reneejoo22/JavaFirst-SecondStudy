//2-5 +2-7
import java.util.Scanner;

public class ArthmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int time = scanner.nextInt();
		
		int second = time%60;
		int minute = (time/60)%60;
		int hour = (time/60)/60;
		
		System.out.print(time + "초는");
		System.out.print(hour + "시");
		System.out.print(minute + "분");
		System.out.println(second + "초");
		
		scanner.close();
		
		//2-7
		
		System.out.println('a'<'b');
		System.out.println(-1<0);
		System.out.println(3!=2);
		System.out.println(!(3!=2));
		
		System.out.println(" ");
		System.out.println((3>2)&&(4<5));
		System.out.println((3>2)||(4>5));
		System.out.println((3>2)^(4<5));	//서로 다른 값일때만 참>>예시 01, 10
	}

}
