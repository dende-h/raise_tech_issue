package issue.tech.raise;

		class Hello_world {
			public static void main(String[] args) {
				//課題1コード
				String greeting = "HelloWorld";
					System.out.println("課題1の出力");
					System.out.println("「世界よこんにちは」を英語で" + "“" + greeting + "”");
					System.out.println("******************************");//見やすいように
				//課題2コード
					System.out.println("課題2の出力");
					Roop.roop();
					System.out.println("******************************");
				//課題３コード	
					System.out.println("課題3の出力");
					AfterThreeYears.afterThree();
			    	System.out.println("******************************");
			    //課題４コード
			    	System.out.println("課題4の出力");
			    		try {
							Judgment.isOne(1);
							Judgment.isOne(0);
							Judgment.isOne(3);
						} catch (Exception e) {
						
							e.printStackTrace();
						} finally {
			    		System.out.println("引数は0か1ではありません");
			    		}
					System.out.println("******************************");
				//課題５のコード
					System.out.println("課題5の出力");
					Dinosaur.dinosaurList();
					
			}
		}
		 

