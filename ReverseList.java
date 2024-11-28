package List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {

	public static void main(String[] args) {
		List<String>words=new ArrayList<>(Arrays.asList("Sharmitha","Reshma","Vaeshini","Rahul"));
		System.out.println("Original List:"+words);
		Collections.reverse(words);
		System.out.println("Reversed List:"+words);

	}

}
