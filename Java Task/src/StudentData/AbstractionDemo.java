package StudentData;

public class AbstractionDemo {
	public static void main(String args[]) {
		
		Member s1 = new Student();
		InterfaceDemo t1 = new Teacher();
		
		System.out.println(s1.name = "Hai");
		System.out.println(t1.name);
		
	/*	Member[] m = new Member[4];
		m[0] = new Student();
		m[1] = new Student();
		m[2] = new Teacher();
		m[3] = new Teacher();
		
		for(Member m1 : m) {
			m1.welcomemessage();
		}*/
	}
}
