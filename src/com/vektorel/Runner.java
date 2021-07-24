package com.vektorel;

public class Runner {

	public static void main(String[] args) {
		// Method �a��rma i�lemi ya da kodu
		ekranaYazdir();
		
		double donen_deger = 23;
		System.out.println(donen_deger);
		System.out.println(piSayisiNedir());
		double alan = 5*5 * piSayisiNedir(); 
		System.out.println(alan);
		System.out.println(selamVer());

	}//Main Method sonu
	
	// Methodlar neden Gerekli?
	// 1- Kodlaman�n daha d�zenli ve kontrol edilebilir
	// olmas� i�in gereklidir.
	// 2- Kod tekrar�ndan ka��nmak ve daha kolay revize etmek i�in
	
	// Method Nas�l Tan�mlan�r?
	// 1-Gerekli ise, Eri�im Belirteci -> Access Modifier (OOP Konusudur).
	// 2-Return Type -> Geri D�n�� Tipi, (void ya da di�er)
	// 3-Gerekli ise -> static, final gibi key eklenbilir (OOP konusu)
	// 4-Method un ad� yaz�l�r.
	// 5-Parantezler gelir."()" i�i bo� ya da dolu olabilir.
	// 6-Gerekli ise parantes i�ine de�er eklenebilir.
	// 7-Method un s�n�rlar� s�sl� parantez "{}" ile belirtilir
	//   zorunludur. noktal� virg�l eklenmez.
	
	//  Acc.Modf.   	  return type  method ad�
		public     static   void        Toplama() {// method g�vdesi
			
		
	}
	
	void Cikart() {
		
	}
	// E�er geri d�n�� tipi void ise method yapt��� i�lemler, kodlamar
	// sonras�nda herhangi bir de�er d�nd�rmez
	
	static void ekranaYazdir() {
		System.out.println("ekrana yaz� yazd�ran method");
		System.err.println("fsdfsdfsfsdf");
	}
	
	// Burada geri d�n�� tipi double olarak belirlenmi�tir.
	// geri d�n� tipi olan methodlarda "return" ile de�er
	// d�n��� sa�lan�r.
	static double piSayisiNedir() {
		System.out.println("pi say�s� d�nen method");
		return 3.14;
	}
	
	Runner runnerdonenMethod() {
		return new Runner();
	}
	
	static String selamVer() {
		return "Selam Nas�ls�n ?";
	}
	
	
}// Class Sonu
