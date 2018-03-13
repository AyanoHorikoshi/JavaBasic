package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		for(int i = 1; i <= 50; i ++) {

		if(i%17 == 0){
		System.out.print("■");

		}else if(i%16 == 0 && i != 48) {
		System.out.print("■");

		}else if(i%6 == 0 && i != 48) {
		System.out.print("■");

		}else if(i%11 == 0 && i != 44) {
		System.out.print("■");

		}else if(i >= 21 && i <= 24) {
		System.out.print("■");

		}else if(i >= 26 && i <= 29) {
		System.out.print("■");

		}else if(i == 31) {
		System.out.print("■");

		}else if(i == 37) {
		System.out.print("■");

		}else if(i == 38) {
		System.out.print("■");

		}else if(i == 41) {
		System.out.print("■");

		}else if(i == 46) {
		System.out.print("■");

		}else {
		System.out.print("□");

		}
		if (i % 5 == 0) {
	    System.out.println();

			// ★ for文を使って、以下のような出力になるようにしてください
		}
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
}
