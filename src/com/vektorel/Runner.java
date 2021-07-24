package com.vektorel;

public class Runner {

	public static void main(String[] args) {
		// Method Çaðýrma iþlemi ya da kodu
		ekranaYazdir();
		
		double donen_deger = 23;
		System.out.println(donen_deger);
		System.out.println(piSayisiNedir());
		double alan = 5*5 * piSayisiNedir(); 
		System.out.println(alan);
		System.out.println(selamVer());

	}//Main Method sonu
	
	// Methodlar neden Gerekli?
	// 1- Kodlamanýn daha düzenli ve kontrol edilebilir
	// olmasý için gereklidir.
	// 2- Kod tekrarýndan kaçýnmak ve daha kolay revize etmek için
	
	// Method Nasýl Tanýmlanýr?
	// 1-Gerekli ise, Eriþim Belirteci -> Access Modifier (OOP Konusudur).
	// 2-Return Type -> Geri Dönüþ Tipi, (void ya da diðer)
	// 3-Gerekli ise -> static, final gibi key eklenbilir (OOP konusu)
	// 4-Method un adý yazýlýr.
	// 5-Parantezler gelir."()" içi boþ ya da dolu olabilir.
	// 6-Gerekli ise parantes içine deðer eklenebilir.
	// 7-Method un sýnýrlarý süslü parantez "{}" ile belirtilir
	//   zorunludur. noktalý virgül eklenmez.
	
	//  Acc.Modf.   	  return type  method adý
		public     static   void        Toplama() {// method gövdesi
			
		
	}
	
	void Cikart() {
		
	}
	// Eðer geri dönüþ tipi void ise method yaptýðý iþlemler, kodlamar
	// sonrasýnda herhangi bir deðer döndürmez
	
	static void ekranaYazdir() {
		System.out.println("ekrana yazý yazdýran method");
		System.err.println("fsdfsdfsfsdf");
	}
	
	// Burada geri dönüþ tipi double olarak belirlenmiþtir.
	// geri dönþ tipi olan methodlarda "return" ile deðer
	// dönüþü saðlanýr.
	static double piSayisiNedir() {
		System.out.println("pi sayýsý dönen method");
		return 3.14;
	}
	
	Runner runnerdonenMethod() {
		return new Runner();
	}
	
	static String selamVer() {
		return "Selam Nasýlsýn ?";
	}
	
	
}// Class Sonu
