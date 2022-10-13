package reduce;

import java.util.stream.IntStream;

public class ReduceExample {

	public static void main(String[] args) {
		//start o-[1,2,4,5,2,7]
		int result= IntStream.range(1, 5)//-[1,2,3,4]
		.reduce(23,(a,b)->a+b);
		System.out.println(result);
		
		int result1=IntStream.range(1, 5)
				.parallel()
				.reduce(23,(a,b)->a+b);
		System.out.println(result1);

				
	}

}
