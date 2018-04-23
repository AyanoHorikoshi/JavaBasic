package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		for(int i = 0; i < 5; i ++) {
			for(int j = 0; j < i; j ++) {
				System.out.print("■");
			}
			for(int k = i; k < 5; k++) {
				System.out.print("□");
			}
			System.out.println();
		}

		for(int a = 5; a > 0; a --) {
			for(int b = 0; b < a; b ++) {
				System.out.print("■");
			}
			for(int c = a; c < 5; c ++) {
				System.out.print("□");
			}
			System.out.println();
		}
			// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */

	}

}
