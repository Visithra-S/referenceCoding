
public class PrintMaxAnMinPrice {

	public static int maxAmount(int[] price) {
		
		if(price.length==0) {
			return 0;
		}

		int min = price[0];
		int max = 0;

		for(int i = 0; i <price.length; i++) {
			
			/*if(price[i] > min) {
				max = Math.max(max, price[i]- min);*/
			
			if(price[i] > max) {
	               max = price[i]; 
			}else if(price[i] < min){
				min = price[i];
			}
		}
		
		return max;
	}

	public static void main(String[] args) {

		int[] price = { 25, 56, 78, 97, 23, 56, 78};
		int outputPrice = 0;

		if(0 != maxAmount(price)) {
			outputPrice = maxAmount(price);

			System.out.println(outputPrice);
		}else System.out.println("Invalid(gmsk) Args...");
	}

}
