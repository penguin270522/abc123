package bai1;

import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Ngay ngay1 = new Ngay(25, 5, 2002);
		HangSanXuat hangSanXuat1 = new HangSanXuat("kingJong-Hung", "Korean");
		Movie movie1 = new Movie("Soudowman",2002, hangSanXuat1, 2000, ngay1);
		System.out.println(movie1);
		
	}

}
