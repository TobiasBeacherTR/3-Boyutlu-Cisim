import java.util.Scanner;

public class üc_boyutlu_sekil {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("1-) Küre\n"
				+ "2-) Silindir\n"
				+ "3-) Koni\n"
				+ "4-) Kare Piramit\n");
		System.out.print("Alanýný hesaplamak istediðiniz 3 boyutlu cismi seçiniz : ");
		int x=scanner.nextInt();
		double pi=Math.PI;
		
		switch (x) {
		case 1:
			System.out.print("Kürenin yarý çapýný giriniz : ");
			double r=scanner.nextDouble();
			double alanr=pi*Math.pow(r, 3)*4/3;
			System.out.println("Kürenin alaný : " + alanr);
			break;
		case 2:
			System.out.println("Silindirim yarý çapýný giriniz : ");
			double s=scanner.nextDouble();
			System.out.println("Silindirin yüksekliðini giriniz : ");
			double h=scanner.nextDouble();
			double alans=pi*Math.pow(s, 2)*h;
			System.out.println("Silindirin alaný : " + alans);
			break;
		case 3:
			System.out.println("Koninin yarýçapýný giriniz : ");
			double k=scanner.nextDouble();
			System.out.println("Koninin yüksekliðini giriniz : ");
			double hk=scanner.nextDouble();
			double alank=pi*Math.pow(k, 2)*hk/3;
			break;
		case 4:
			System.out.println("Kare piramitin tabanýnýn kenar uzunlugunu giriniz : ");
			double u=scanner.nextDouble();
			System.out.println("Kare piramitin yüksekliðini giriniz :");
			double hu=scanner.nextDouble();
			double alan=Math.pow(u, 2)*hu/3;
			break;
		default:
			System.out.println("Hatalý giriþ yaptýnýz. ");
			
		}

	}

}
