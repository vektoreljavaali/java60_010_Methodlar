package com.vektorel;

import java.util.Scanner;

public class Runner_4 {

	public static void main(String[] args) {
		
		System.out.println("*****************");
		System.out.println("***   ��LEM   ***");
		System.out.println("*****************");
		System.out.println("1-Toplama");
		System.out.println("2-�arpma");
		System.out.println("0-�IKI�");
		System.out.println();
		System.out.print("Se�iniz...: ");
		Scanner sc = new Scanner(System.in);
		int secim = sc.nextInt();
		System.out.print("Ka� Say� gireceksiniz? ");
		int sayiadedi = sc.nextInt();
		long[] nasilsin = new long[sayiadedi];
		long[] ahmet = new long[sayiadedi];
		
		for(int i=0;i<sayiadedi;i++) {
			System.out.print((i+1)+". Say�y� Gir...: ");
			ahmet[i]=sc.nextLong();
		}
		System.out.println(Islem(ahmet,secim));
		
		
	}//Main Sonu

	// secim=1 ise toplama, 2 ise �arpma yaps�n
	static long Islem(long[] sayilar,int secim) {
		long result=0;
		if(secim==1) {
			for(int i=0;i<sayilar.length;i++)
			 result += sayilar[i];
		}else if(secim==2) {
			result=1;
			for(int i=0;i<sayilar.length;i++)
				 result *= sayilar[i];
		}				
		return result;
	}
	
}//Class sonu
