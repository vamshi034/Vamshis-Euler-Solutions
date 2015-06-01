
public class p10 {

	public static void main(String[] args) {
		
		long answer = 5; //Starting at 5 because 2 & 3 are already being included. 
		
		//This Algorithm skips over even numbers.
		for(int i = 5; i < 2000000; i += 2){
			double limit = Math.ceil(Math.sqrt(i)); //This algorithm only needs to check up to the sqrt of i. 
			l1: for(double x = 3; x <= limit; x += 1){
				if(i % x == 0.0){
					break l1;
				}else if(x == limit){
					answer += i;
				}
			}
		}
		
		System.out.println("Answer is: " + answer);
	}

}
