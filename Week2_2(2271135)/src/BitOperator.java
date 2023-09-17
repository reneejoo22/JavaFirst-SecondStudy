//2주차_예제2-9

public class BitOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short a = (short)0x55ff;
		short b = (short)0x00ff;
		
		//비트 논리 연산
		System.out.println("[비트연산결과]");
		System.out.printf("%04x\n",(short)(a&b));	//비트 and_ 11일때만 참
		System.out.printf("%04x\n",(short)(a|b));	//비트 or_ 00제외 전부 참
		System.out.printf("%04x\n",(short)(a^b));	//비트 xor_ 01이거나 10일때만 참
		System.out.printf("%04x\n",(short)(~a));	//비트 not_
		
		
		byte c = 20;
		byte d = -8;
	
		System.out.println("[시프트 연산 결과]");
		System.out.println(c<<2);
		System.out.println(c>>2);
		System.out.println(d>>2);
		System.out.printf("%x\n",(d>>>2));
		
		/*
		second sample
		*/
	}

}
