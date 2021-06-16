package issue.tech.raise;

class Judgment {
	public static void isOne(int num) throws Exception {
		if(num == 1) {
			System.out.println("引数が1の場合は真");
		} else if (num == 0) {
			System.out.println("引数が0の場合は真");
		} else if (num > 1 || num < 0) {
			throw new Exception();
		}
	}

}
