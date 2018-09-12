package program.kasir;
import java.util.Scanner;
public class ProgramKasir {
    public static void main(String[] args) {
    System.out.println("Muhammad Ilham Setyo Wahyudi/ XR6/ 31");
     
    Scanner scan = new Scanner(System.in);

    String namaPembeli;
    String namaBarang;
    int ulangi;
    double diskon = 0.1; 
    double diskon2 = 0.2; 
    double diskon3 = 0.5; 
    double totalBayarAkhir;
    double
jumlahBarang,hargaBarang,kodeBarang,totalHarga,totalBayar;

do{
    System.out.println(" ## Program Kasir  ## ");
    System.out.print("Nama Pembeli : "); namaPembeli = scan.next();
    
    System.out.print("Jumlah Barang :"); jumlahBarang = scan.nextDouble();
   
    System.out.print("Harga Satu Barang : ");
    hargaBarang = scan.nextDouble();

    System.out.print("Kode Barang : ");
    kodeBarang = scan.nextDouble();
System.out.println("Total Harga = ");
totalHarga = jumlahBarang * hargaBarang;

System.out.println(jumlahBarang + " * " + hargaBarang + " = " + totalHarga );

if(totalHarga > 1000000){
if(totalHarga < 1000000){
   System.out.println(totalHarga);    
     }else
   System.out.println(totalHarga);
     }else


System.out.println(totalHarga);
System.out.println("Total Bayar = ");

totalBayar = totalHarga;
System.out.println(totalHarga);

System.out.println("Apakah lebih dari 100.000 ? ");
System.out.println("1. Ya");
System.out.println("2. Tidak");
System.out.print("Jawab : ");
totalHarga = scan.nextDouble();
            
if(totalHarga == 1){           
   if(totalHarga == 2){
System.out.println(totalBayar);{}
}else
System.out.println(totalBayarAkhir = totalBayar - (totalBayar * diskon));
}else
System.out.println(totalBayar);

System.out.println("Apakah lebih dari 200.000 ? ");
System.out.println("1. Ya");
System.out.println("2. Tidak");
System.out.print("Jawab : ");
totalHarga = scan.nextDouble();
            
if(totalHarga == 1){           
   if(totalHarga == 2){
 System.out.println(totalBayar);{}
}else
System.out.println(totalBayarAkhir = totalBayar - (totalBayar * diskon2));
}else
System.out.println(totalBayar);
                    
System.out.println("Apakah lebih dari 500.000 ? ");
System.out.println("1. Ya");
System.out.println("2. Tidak");
System.out.print("Jawab : ");
totalHarga = scan.nextDouble();
            
if(totalHarga == 1){           
   if(totalHarga == 2){
 System.out.println(totalBayar);{}
}else
System.out.println(totalBayarAkhir = totalBayar - (totalBayar * diskon3));
}else
System.out.println(totalBayar);
                    
totalBayarAkhir = scan.nextDouble();

System.out.println("Ulangi ?");
System.out.println("1=Ya");
System.out.println("2=Tidak");
System.out.print("Jawab : ");
ulangi = scan.nextInt();
}while(ulangi == 1);

System.out.println("Terima Kasih, Semoga anda puas dengan pelayanan kami");
    }
}

  
