package service;

import java.util.Scanner;

public class InputService {
	public static String inputString()
	{
		Scanner scanner = new Scanner(System.in); 
		System.out.print("������:");   
		return scanner.next();   
	}
}
