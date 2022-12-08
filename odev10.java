package oryantasyon;

import java.util.Scanner;

public class odev10 {

public static void main(String[]args) {

Scanner scan=new Scanner(System.in);
System.out.println("Karşılaştırmak istediğiniz iki sayıyı giriniz");
int a =scan.nextInt();

int b=scan.nextInt();

if(a>b) {
	System.out.println("Birinci sayı İkinci sayıdan büyüktür");
}
	else if(a==b) {
				System.out.println("Birinci sayı İkinci sayıya eşittir");
	}


	else 
	{


System.out.println("Birinci sayı İkinci sayıdan küçüktür");

	}


}

}


