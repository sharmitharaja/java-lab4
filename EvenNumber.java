package Even;
import java.util.ArrayList;
import java.util.Arrays;

public class EvenNumber {

	public static void main(String[] args) {
		ArrayList<Integer>number=new ArrayList<>();
		number.add(2);
		number.add(5);
		number.add(8);
		number.add(10);
		number.add(15);
		int evenSum=0;
		for(int num:number) {
			if(num % 2==0) {
				evenSum += num;
		}
	}
		System.out.println("Sum of the numbers:"+evenSum);

	}
}
