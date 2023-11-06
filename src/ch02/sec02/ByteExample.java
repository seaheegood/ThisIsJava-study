package ch02.sec02;

public class ByteExample {

	public static void main(String[] args) {
		byte var1 =  -128;
		byte var2 = 0;
		byte var3 = 127;
//		byte var4 = 128; // 컴파일 에러(Type mismatch: cannot convert from int to byte)
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
//		System.out.println(var4);
	}

}
