package chapter3;

public class OperationEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10)< 10) && ((i = i+2)<10);	//논리곱에서 앞의 항이 거짓이면 뒷 항은 실행되지 않음
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1+10) > 10) || ((i=i+2) < 10);			//논리합에선 앞의 항이 참이면 뒷 항은 실행되지 않음
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}

}
