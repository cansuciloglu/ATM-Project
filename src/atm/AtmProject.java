package atm;

import java.util.Scanner;

public class AtmProject {

	public static void main(String[] args) {
		
		int bakiye=1000;
		int islem,miktar;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Kodlama Bankamati�e ho�geldiniz ! ");
		System.out.println("G�ncel bakiyeniz " + bakiye);
		
		
		while (bakiye>0) {
			System.out.println("Yapmak istedi�iniz i�lemi se�iniz ");
			System.out.println("1- Para Yat�r ");
			System.out.println("2- Para �ek ");
			System.out.println("3- Bakiye ��ren ");
			System.out.println("4- ��k�� Yap ");
			islem=scan.nextInt();
			
				if(islem==1) {
					System.out.println("Para yat�rmak istedi�iniz miktar� yaz�n.");
					miktar=scan.nextInt();
					bakiye+=miktar;
				}else if(islem==2){
					System.out.println("Para �ekmek istedi�iniz miktar� yaz�n.");
					miktar=scan.nextInt();
					if(miktar>bakiye) {
						System.out.println("Yetersiz bakiye");
					}else {
						bakiye-=miktar;
					}
				}else if(islem==3) {
					System.out.println("G�ncel bakiyeniz: " + bakiye);
				}else if(islem==4) {
					System.out.println("��k�� yapt�n�z. Tekrar bekleriz. �yi G�nler..");
					break;
				}else {
					System.out.println("Yanl�� bir tu�lama yapt�n�z!");
				}
		}
		
	}

}
