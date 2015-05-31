
public class p09 {

	public static void main(String[] args) {
		// Substituting c = 1000-a-b into --> a^2 + b^2 = c^2 and knowing that a < b
		// After some Algebra, this problem can be solved using the equation (a+b) -(a*b)/1000 = 500
		double answer = 0;
		double answerPart1 = 0;
		double answerPart2 = 0;
		double one = 0; //a
		double two = 0; //b 
		double three = 0; //c
		double verify = 500.0;
		l1: for(int a = 1; a<=500; a++){
				for(int b = a+1; b <= 500; b++){
					answerPart1 = a+b;
					answerPart2 = (a*b)/1000.0;
					answer = answerPart1 - answerPart2;
					if(answer == verify){
						one = a;
						two = b;
						three = Math.sqrt((a*a)+(b*b));
						break l1;
					}
			}
			//To track the iterations, no actual purpose. 
			if(a%10 == 0){
				System.out.println(a);
			}
		}
		
		System.out.println("Final Product: " + (long)(one * two * three));
	}

}
