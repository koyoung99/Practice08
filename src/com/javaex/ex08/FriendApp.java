package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Friend[] friendArray = new Friend[3];

		Scanner sc = new Scanner(System.in);

		System.out.println("친구를 3명 등록해 주세요");

		for (int i = 0; i < friendArray.length; i++) {
			String name = sc.next();
			String hp = sc.next();
			String school = sc.next();
			friendArray[i] = new Friend(name, hp, school);
		}

		for (int i = 0; i < friendArray.length; i++) {
			System.out.println(friendArray[i].showInfo());

		}

		sc.close();
	}

}