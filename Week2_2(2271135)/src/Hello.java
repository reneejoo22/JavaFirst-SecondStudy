//2-1
public class Hello {	//hello 이름의 클래스 선언

	public static int sum(int n, int m) {	//두 수를 합치는 메소드(함수)
		return n+m;
	}
	
	public static void main(String[]args) {	//main 메소드
		
		int i = 20;
		int s;
		char a;
		
		s = sum(i,10);	//sum() 메소드 호출>>20이랑 10 입력 받아서 30이됨 s는
		a = '?';
		
		System.out.println(a);	//출력후 다음 행으로 이동
		System.out.println("Hello");
		System.out.println(s);
	}
}
