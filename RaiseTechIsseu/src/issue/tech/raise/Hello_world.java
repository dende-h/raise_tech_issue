package issue.tech.raise;


import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

		public class Hello_world {

			public static void main(String[] args) {
				// TODO 自動生成されたメソッド・スタブ
				
				//課題1コード
				String greeting = "HelloWorld";
				System.out.println(greeting);
				//課題2コード
				int s = 0;
				for(int i = 1; i < 11 ; i++) {
					 s += i;
				}
				System.out.println(s);
			
			//課題３コード	
			LocalDateTime local = LocalDateTime.now();
				System.out.println(local.plusYears(3));
			DayOfWeek dayWeek = local.getDayOfWeek();
				System.out.println(dayWeek);
			
			//課題４コード
			Judgment.doIf(1);
			Judgment.doIf(0);
			
			//課題５のコード
			List<String> list = new ArrayList<String> (Arrays.asList("T-REX","Spino saurus","Triceratops")) ;
			
				for(int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}

			
			}

		}
		 class Judgment{	
			public static void doIf(int i) {
				if(i == 0) {
					System.out.println("偽");
				}else if(i == 1) {
					System.out.println("真");
				}
			}

		
		
			
	}


