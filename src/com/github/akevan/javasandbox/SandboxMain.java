package com.github.akevan.javasandbox;

import java.util.Scanner;

public class SandboxMain 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello...\n");
		System.out.println("What's your name?");
		
		String name;
		Scanner inputScanner = new Scanner(System.in);
		name = inputScanner.nextLine();
		
		System.out.println("You said your name was " + name + "\n\n" + "see ya later " + name + "...");
	}

}
