import java.util.Scanner;
public class RumusFisika {
public static void main (String[] args) {

String ulangi = "y";
while (ulangi.equals("y")) {

Scanner input = new Scanner (System.in) ; 

double kecepatan ; 
int waktu ; 
double jarak ;

System.out.println("_______________________________________________");
System.out.println("Selamat Datang Di Program Fisika");
System.out.println("_______________________________________________");
System.out.println("Tekan 1 untuk mencari kecepatan (m/s)");
System.out.println("Tekan 2 untuk mencari waktu (s)");
System.out.println("Tekan 3 untuk mencari jarak (m)");
System.out.println("_______________________________________________");
System.out.println("Masukan pilihan : ") ; 
 Integer pilih = input.nextInt();

switch (pilih){
case 1 : {
System.out.println("_______________________________________________");
System.out.println("Anda ingin mencari Kecepatan ?");
System.out.println("Masukan Jarak (m)      : ") ; 
 Integer satu = input.nextInt();
System.out.println("Masukan Waktu (s)      : ") ;
 Integer dua = input.nextInt();

kecepatan = satu/dua ; 
System.out.println("Hasilnya "+kecepatan+" m/s");
break;}

case 2 : {
System.out.println("_______________________________________________");
System.out.println("Anda ingin mencari Waktu ?");
System.out.println("Masukan Jarak (m)       : ") ;
 Integer satu = input.nextInt();
System.out.println("Masukan Kecepatan (m/s) : ") ;
 Integer dua = input.nextInt();

waktu = satu/dua ; 
System.out.println("Hasilnya "+waktu+" s");
break;}
 
case 3 : {
System.out.println("_______________________________________________");
System.out.println("Anda ingin mencari Jarak ?");
System.out.println("Masukan Kecepatan (m/s) : ");
 Integer satu = input.nextInt();
System.out.println("Masukan waktu (s)	    : ");
 Integer dua = input.nextInt();

jarak = satu*dua;
System.out.println("Hasilnya "+jarak+" m");
break;}

default :{
System.out.println("Created by Nouval Isnin");}
}
		
System.out.println("Apakah anda ingin mengulangi ?");
System.out.print("y/n :");
 // ulangi = input.next();
//	if (ulangi == "n")
//	{
//System.out.println("Goodbye");
//}
}

}
}