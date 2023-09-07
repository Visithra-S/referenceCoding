
public class Bike2 {
	double run(){
		return 5.0;
		}  
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Bike2 obj = new Bike2();//creating object
		
		
		int output = v.run();
		double output1 = obj.run();
		
		System.out.println("first class : " + output);
		System.out.println("second class : " + output1);
		
		/*System.out.println("first class : " + v.run());
		System.out.println("second class : " + obj.run());//calling method 
		
*/
		/*
		 * methodname and argument same but different class name
		 * */
	}

}
