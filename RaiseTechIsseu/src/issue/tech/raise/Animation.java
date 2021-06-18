package issue.tech.raise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Animation {
	static void favoriteAnime(int someTime) throws Exception { 
		if(someTime == 1) {
			Scanner scan = new Scanner(System.in);
			System.out.println("好きなジャンルの番号を入力してください");
		
			Map<String,String> map = new TreeMap<>();
			map.put("①ミステリー好き", "氷菓");
			map.put("②サスペンス好き", "PSYCHO-PASS");
			map.put("③SF好き", "新世界より");
			map.put("④アクション好き", "戦姫絶唱シンフォギア");
			map.put("⑤青春もの好き", "風が強く吹いている");
		
			System.out.println(map.keySet());
			System.out.print("選択した数字を入力：");
			
			int num = scan.nextInt();
			String animeTitle = null;
			if(num == 1) {
				animeTitle = map.get("①ミステリー好き");
			} else if (num == 2){
				animeTitle = map.get("②サスペンス好き");
			} else if (num == 3){
				animeTitle = map.get("③SF好き");
			} else if (num == 4){
				animeTitle = map.get("④アクション好き");
			} else if (num == 5){
				animeTitle = map.get("⑤青春もの好き");
			} else {
				throw new Exception();
			}
			System.out.println("あなたにお勧めのアニメは" + "【" + animeTitle + "】" + "です");
		} else if (someTime == 2) {
			Map<String,String> map = new TreeMap<>();
			map.put("①ミステリー好き", "氷菓");
			map.put("②サスペンス好き", "PSYCHO-PASS");
			map.put("③SF好き", "新世界より");
			map.put("④アクション好き", "戦姫絶唱シンフォギア");
			map.put("⑤青春もの好き", "風が強く吹いている");
			System.out.println("\nどうしてもちゃんと答えてくれないのですね\nそんなひねくれ者のあなたは･･･");
			
			for (String val : map.values()) {
				System.out.println("【" + val + "】");
			}
		System.out.println("の全部を視聴してくださいね！");
		}
	}
}