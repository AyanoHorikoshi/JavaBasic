/*
 * PTra18_04.java
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

public class PTra18_04 {
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
		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		int i = 0;
		int gk = 0;
		int df = 0;
		int mf = 0;
		int fw = 0;
		while(i < 11) {
		int index = new java.util.Random().nextInt(array.size());
		if(array.get(index).indexOf("GK") != -1) {
			gk ++;
			if(gk < 2) {
				System.out.println(array.get(index));
				i ++;
			}
		}
		if(array.get(index).indexOf("DF") != -1) {
			df ++;
			if(df < 5) {
				System.out.println(array.get(index));
				i ++;
			}
		}
		if(array.get(index).indexOf("MF") != -1) {
			mf ++;
			if(mf < 5) {
				System.out.println(array.get(index));
				i ++;
			}
		}
		if(array.get(index).indexOf("FW") != -1) {
			fw ++;
			if(fw < 3) {
				System.out.println(array.get(index));
				i ++;
			}
		}
		}
	}
}
