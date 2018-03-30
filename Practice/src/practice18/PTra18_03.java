/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		Player player = new Player();
		String str = player.toString();
		ArrayList<String>array = new ArrayList<>();
		try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
                str = scanner.nextLine();
                array.add(str);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }
		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
		for (int i = array.size() - 1; i >= 0; i --) {

			String word = "レアル・マドリード";
			String team = "バルセロナ";

			int k = array.get(i).indexOf(word);
			int j = array.get(i).indexOf(team);

			if(k != -1 || j != -1) {
				array.remove(i);

			}
		// ★ 削除後のArrayListの中身を全件出力してください
		}
		for(String aaa : array) {
		System.out.println(aaa);
		}
	}
}
