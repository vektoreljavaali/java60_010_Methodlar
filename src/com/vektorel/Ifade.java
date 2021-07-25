package com.vektorel;


public class Ifade {

	/**
	 * Bu De�i�ken ifade s�n�f�n�n i�leyece�i de�eri i�erir.
	 */
	String ifade_value;
	
	/**
	 * Bu Method S�n�f i�ine tanan String de�erinin 
	 * karakter uzunlu�unu verir.
	 * @return int tipte uzunluk bilgisi.
	 */
	int uzunluk() {
		return ifade_value.length();		
	}
	
	//muhammet hoca -> Muhammet HOCA 
	
	String isim() {
		String[] isim = ifade_value.split(" ");
		String ad = isim[0];
		String soyad = isim[1];
		ad = ad.substring(0, 1).toUpperCase()+
				ad.substring(1, ad.length()).toLowerCase();
		soyad = soyad.toUpperCase();
		return ad + " "+ soyad;
	}
	
	
}
