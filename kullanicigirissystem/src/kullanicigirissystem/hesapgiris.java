package kullanicigirissystem;

import java.util.Scanner;

public class hesapgiris  extends giris{
	
	
	public String girilentc;
	public String girilensifre;
	public int hak=3;
	public String isim;
	protected boolean giris;
	
	public hesapgiris() {
	}
	
	public hesapgiris(String isim) {
		this.isim=isim;
	}
	
	@Override
	public void tcal() {
		Scanner om = new Scanner(System.in);
		System.out.println("TC giriniz:");
		girilentc=om.nextLine();
		if(girilentc.equals(hesapolusturma.tc)) {
			System.out.println("Giris basarili.");
		}
		else {
			System.out.println("Hatali TCKN girdiniz.");
			tcal();
		}
	}
	
	@Override
	public void sifreal() {
		
		Scanner ome = new Scanner(System.in);
		System.out.println("Sifre giriniz:");
		girilensifre=ome.nextLine();
		if(girilensifre.equals(hesapolusturma.password)) {
			System.out.println("\n\tGiris basarili\n\tHosgeldiniz "+this.isim);
			giris=true;
		}
		else {
			--hak;
			if(hak==0) {
				System.out.println("Yanlis girme kotaniz dolmustur..");
				giris=false;
				System.exit(0);
			}
			System.out.println("Hatali sifre girdiniz."+hak+" hakkiniz kaldi");
			sifreal();
		}
		
		
	}

}
