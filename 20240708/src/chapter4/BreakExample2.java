package chapter4;

public class BreakExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		int num =0;
		
		for(num=0; ; num++) {
			sum += num;
			if(sum>=100)
				break;
		}
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
	}

}
