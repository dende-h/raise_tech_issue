package issue.tech.raise;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

		public class Hello_world {

			public static void main(String[] args) {
				// TODO 自動生成されたメソッド・スタブ
				
				//課題1コード
				String greeting = "HelloWorld";
					System.out.println("課題1の出力");
					System.out.println("「世界よこんにちは」を英語で" + "“" + greeting + "”");
					System.out.println("******************************");//見やすいように
				//課題2コード
				int s = 0;
				for(int i = 1; i < 11 ; i++) {
					 s += i;
				}
					System.out.println("課題2の出力");
					System.out.println("1から10までの総和は" + s + "です");
					System.out.println("******************************");
				//課題３コード	
					System.out.println("課題3の出力");
				LocalDateTime local = LocalDateTime.now();
				DateTimeFormatter fomatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日(E)",Locale.JAPANESE);
				local = local.plusYears(3);
			    String format = local.format(fomatter);
			    	System.out.println("3年後の今日は" + format + "です");
			    	System.out.println("******************************");
			
			    //課題４コード
			    	System.out.println("課題4の出力");
			    Judgment.doIf(1);
			    Judgment.doIf(0);
					System.out.println("******************************");
				//課題５のコード
				List<String> list = new ArrayList<String> (Arrays.asList("T-REX","Spino saurus","Triceratops")) ;
					System.out.println("課題5の出力");
					for(int i = 0; i < list.size(); i++) {
						System.out.println(list.get(i));
					}
			}
		}
		class Judgment{	
			public static void doIf(int i) {
				if(i == 0) {
					System.out.println("引数が0の場合は偽");
				}else if(i == 1) {
					System.out.println("引数が1の場合は真");
				}
			}
		}


