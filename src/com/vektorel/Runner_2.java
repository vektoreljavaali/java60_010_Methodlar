package com.vektorel;

import java.util.Scanner;


public class Runner_2 {
	
	
	public static void main(String[] args) {		
			
		Calistir();
		
	}// Main Method Sonu


	static void Calistir() {
		switch (ekranaGetir()) {
		case 1:Toplam();break;
		case 2:Carpim();break;
		case 3:Kare();break;
		default:System.out.println("Geçersiz Seçim");
			break;
		}
	} 
	
	static int ekranaGetir() {
		System.out.println("********************");
		System.out.println("****  ÝÞLEMLER  ****");
		System.out.println("********************");
		System.out.println("1- Toplama");
		System.out.println("2- Çarpma");
		System.out.println("3- Karenin Alaný");
		System.out.print("Seçiniz....: ");	
		Scanner sc = new Scanner(System.in);
		int sec = sc.nextInt();
		return sec;
	}
	
	static void Toplam() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1. Sayýyý giriniz...: ");
		int s1 = sc.nextInt();
		System.out.print("2. Sayýyý giriniz...: ");
		int s2 = sc.nextInt();
		int toplam = s1+s2;
		System.out.println("Toplam...: "+toplam);
	}
	
	static void Carpim() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1. Sayýyý giriniz...: ");
		int s1 = sc.nextInt();
		System.out.print("2. Sayýyý giriniz...: ");
		int s2 = sc.nextInt();
		int carpim = s1*s2;
		System.out.println("Çarpým...: "+carpim);
	}
	
	static void Kare() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Karenin bir kenar uzunluðu...: ");
		int kenar = sc.nextInt();
		System.out.println("Karenin Alaný..: "+(kenar*kenar));		
	}
	
	
}// Class sonu
