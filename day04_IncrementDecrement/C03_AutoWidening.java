package day04_IncrementDecrement;

public class C03_AutoWidening {

	public static void main(String[] args) {

		
	byte sayi1=44; 
	
	short sayi2= sayi1;
	//-------------------------------------------------------------------
	
	//bunlar� dersten sonra benim yapt�klar�m
		byte sayi5=45;
		int sayi6=sayi5;
		
		System.out.println("sayi5 : " + sayi5);
		System.out.println("sayi6 : " + sayi6);
	
	//------------------------------------------------------------------------
	
	// esitligin sol tarafi short, sag tarafi byte
	// iki data turu farkli oldugu halde java itiraz etmiyor.
	// cunku atama yapilan variable'in data turu (short) 
	//	atanan degerin veri turunden(byte) buyuk oldugundan sorun olusmaz.
	
	
	
	System.out.println("sayi2 : " + sayi2);
	
	int sayi3 = 55;
	
	double sayi4=sayi3;
	
	System.out.println("sayi4 : " + sayi4);
	
	
	// atanan degerin data turu, deger atanan variable'in data turunden kucukse
	// Java casting'i otomatik yapar.
	// bu isleme auto widening denir.
	 

	
	
	}

}
