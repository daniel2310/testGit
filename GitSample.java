package com.cgm.git;
import java.util.Scanner;


public class GitSample {

	public static void main(String[] args) {
		System.out.println("Please enter your name: ");
		Scanner text = new Scanner(System.in);
		String name = text.nextLine();
		System.out.println("Hello " + name);
		text.close();
	}

}
