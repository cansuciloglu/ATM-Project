package atm;

import java.util.Scanner;

public class AtmProject {

	public static void main(String[] args) {
		
		int bakiye=1000;
		int islem,miktar;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Kodlama Bankamatiðe hoþgeldiniz ! ");
		System.out.println("Güncel bakiyeniz " + bakiye);
		
		
		while (bakiye>0) {
			System.out.println("Yapmak istediðiniz iþlemi seçiniz ");
			System.out.println("1- Para Yatýr ");
			System.out.println("2- Para Çek ");
			System.out.println("3- Bakiye Öðren ");
			System.out.println("4- Çýkýþ Yap ");
			islem=scan.nextInt();
			
				if(islem==1) {
					System.out.println("Para yatýrmak istediðiniz miktarý yazýn.");
					miktar=scan.nextInt();
					bakiye+=miktar;
				}else if(islem==2){
					System.out.println("Para çekmek istediðiniz miktarý yazýn.");
					miktar=scan.nextInt();
					if(miktar>bakiye) {
						System.out.println("Yetersiz bakiye");
					}else {
						bakiye-=miktar;
					}
				}else if(islem==3) {
					System.out.println("Güncel bakiyeniz: " + bakiye);
				}else if(islem==4) {
					System.out.println("Çýkýþ yaptýnýz. Tekrar bekleriz. Ýyi Günler..");
					break;
				}else {
					System.out.println("Yanlýþ bir tuþlama yaptýnýz!");
				}
		}
		
	}

}
