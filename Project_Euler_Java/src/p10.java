
public class p10 {

	public static void main(String[] args) {
		
		long answer = 5; //Starting at 5 because 2 & 3 are already being included. 
		
		//This Algorithm skips over even numbers.
		for(int i = 5; i < 2000000; i += 2){
			double limit = Math.ceil(Math.sqrt(i)); //This algorithm only needs to check up to the sqrt of i.
			if(limit % 2 == 0){
				limit++; //If it's even add one to make it odd so that my algorithm's limit can land on it.
			}
			l1: for(double x = 3; x <= limit; x += 2){ //I want to skip all even numbers because even numbers can never
				if(i % x == 0.0){					   // have odd multiples, and prime numbers have to be odd (except for 2).
					break l1;
				}else if(x == limit){
					answer += i;
				}
			}
		}
		
		System.out.println("Answer is: " + answer);
	}

}
