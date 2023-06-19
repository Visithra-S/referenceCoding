
public class ConditionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value1 = 1;
		int value2 = 2;
		if((value1 ==1) && (value2 ==2))
		System.out.println("value1 is 1 AND value2 is 2");
		if((value1 == 1) || (value2 == 1))
			System.out.println("value1 is 1 AND value2 is 2");
		
		int result;
		boolean someCondition =true;
		result =(value1<value2)?value1 :value2;
		
		System.out.println(result);
	}

}
