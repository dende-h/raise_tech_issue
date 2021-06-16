package issue.tech.raise;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class AfterThreeYears {
	static void afterThree() {
		/*LocalDateTimeクラス型のlocal変数にLocalDateTimeクラスのnowメソッドを代入
		  DateTimeFormatterクラス型のfomatter変数にDateTimeFormatterクラスのofPatternメソッドを代入
		  local変数にplusYearsのインスタンスメソッドを代入
		  String変数formatにfomatのインスタンスメソッドを代入
		*/
		LocalDateTime test = LocalDateTime.now();
		LocalDateTime local = LocalDateTime.now();
		local = local.plusYears(3);
		test = test.minusYears(5);
		DateTimeFormatter fomatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日(E)",Locale.JAPANESE);
		String format = local.format(fomatter);
	    String format2 = test.format(fomatter);
		System.out.println("3年後の今日は" + format + "です\n5年前の今日は" + format2 + "です");
	}
}
