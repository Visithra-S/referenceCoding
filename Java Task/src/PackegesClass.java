public class PackegesClass {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		/*ArrayList<String> obj = new ArrayList<>();
		obj.add("Hi");
		obj.add("Bye...");*/
		
		PackegesClass obj = new PackegesClass();
		PackegesClass obj1 = new PackegesClass();
		PackegesClass obj2 = new PackegesClass( );
		
		@SuppressWarnings("rawtypes")
		java.util.ArrayList instance = new java.util.ArrayList(); 
		instance.add(obj.getMessage());
		instance.add(obj1.getShotMessageService());
		instance.add(obj2.getShotMessageServiceOne());
		
		System.out.println("instance "+instance.toString());
	}
	
	public String getMessage() {
		return "Hi... Bye...";
	}
	
	public String getShotMessageService() {
		return "Hi... ";
	}
	
	public String getShotMessageServiceOne() {
		return "Bye... ";
	}
}
