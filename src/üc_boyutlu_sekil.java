import java.util.Scanner;

public class �c_boyutlu_sekil {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("1-) K�re\n"
				+ "2-) Silindir\n"
				+ "3-) Koni\n"
				+ "4-) Kare Piramit\n");
		System.out.print("Alan�n� hesaplamak istedi�iniz 3 boyutlu cismi se�iniz : ");
		int x=scanner.nextInt();
		double pi=Math.PI;
		
		switch (x) {
		case 1:
			System.out.print("K�renin yar� �ap�n� giriniz : ");
			double r=scanner.nextDouble();
			double alanr=pi*Math.pow(r, 3)*4/3;
			System.out.println("K�renin alan� : " + alanr);
			break;
		case 2:
			System.out.println("Silindirim yar� �ap�n� giriniz : ");
			double s=scanner.nextDouble();
			System.out.println("Silindirin y�ksekli�ini giriniz : ");
			double h=scanner.nextDouble();
			double alans=pi*Math.pow(s, 2)*h;
			System.out.println("Silindirin alan� : " + alans);
			break;
		case 3:
			System.out.println("Koninin yar��ap�n� giriniz : ");
			double k=scanner.nextDouble();
			System.out.println("Koninin y�ksekli�ini giriniz : ");
			double hk=scanner.nextDouble();
			double alank=pi*Math.pow(k, 2)*hk/3;
			break;
		case 4:
			System.out.println("Kare piramitin taban�n�n kenar uzunlugunu giriniz : ");
			double u=scanner.nextDouble();
			System.out.println("Kare piramitin y�ksekli�ini giriniz :");
			double hu=scanner.nextDouble();
			double alan=Math.pow(u, 2)*hu/3;
			break;
		default:
			System.out.println("Hatal� giri� yapt�n�z. ");
			
		}

	}

}
