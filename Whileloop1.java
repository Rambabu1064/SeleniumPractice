import java.util.ArrayList;
import java.util.List;

public class Whileloop1 {

	public static void main(String[] args) {
		
	List<Long> names = new ArrayList<>();
		
		names.add((long) 123);
		names.add((long) 456);
		names.add((long) 789);
		names.add((long) 543);
		
		for(Long data :names) 
		{
			System.out.println(data);
			
		}
		
		
	}

}
