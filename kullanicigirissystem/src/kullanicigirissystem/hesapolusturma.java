package kullanicigirissystem;

import java.util.Scanner;

public class hesapolusturma extends giris {
	
	public hesapolusturma() {
		
	}
	
	static protected String tc;
	static protected String password;
	public boolean sistem;

	@Override
	public void tcal(){
		
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("TCKN giriniz.");
		tc=klavye.nextLine();
        
		if(tc.length()==11) {
			System.out.println("Basarili.");
			sistem=true;
		}
		else {
			System.out.println("Basarisiz tekrar deneyiniz.");
			sistem= false;
			tcal();
		}
		
	}
	
	@Override
	public void sifreal() {
		Scanner are= new Scanner(System.in);
		System.out.println("Sifre belirleyiniz.(Min 8 max 10 hane olmali)");
		password=are.nextLine();
		if(password.length()>=8 && password.length()<=10) {
			System.out.println("Sifre basariyla olusturuldu.");
			 }
		else {
			System.out.println("Sifre olusturma basarisiz.\n");
		    sifreal();
		}
		
	}
	
	public void goruntule() {
		System.out.println("TCKN: "+tc+"\nSifre: "+password);
	
	}

}
