package practice06;
/*
 * PTra06_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_06 {
	public static void main(String[] args) {

		for(int i = 1; i <= 25; i ++) {// ★ for文を使って、以下のような出力になるようにしてください

			if(i%6 == 0) {
			System.out.print("■");

			}else if(i%11 == 0) {
			System.out.print("■");

			}else if(i == 16) {
			System.out.print("■");

			}else if(i == 17) {
			System.out.print("■");

			}else if(i == 21) {
			System.out.print("■");

			}else if(i == 23) {
			System.out.print("■");

			}else {
			System.out.print("□");

	     if (i % 5 == 0) {
		        System.out.println();

	     }

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
}
