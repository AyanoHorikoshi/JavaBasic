package practice06;
/*
 * PTra06_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_06 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		for(int i = 0; i < 5; i ++) {
			for(int j = 0; j < i; j ++) {
				System.out.print("■");
			}
			for(int k = i; k < 5; k++) {
				System.out.print("□");
			}
			System.out.println();
		}

		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 */

	}
}
