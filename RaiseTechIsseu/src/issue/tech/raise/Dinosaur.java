package issue.tech.raise;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Dinosaur {
	static void dinosaurList() {
		List<String> list = new ArrayList<String> (Arrays.asList("T-REX","Spino saurus","Triceratops")) ;
		
		for(int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
		}
	}
}