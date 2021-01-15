package fungsipengembaliannilai;
import java.util.Scanner;
public class FungsiPengembalianNilai {

    public static void main(String[] args) {
        //Input 
        Scanner Masukkan = new Scanner (System.in);
        int a,b,c;
        System.out.println("Program Menjumlahkan 2 Nilai");
        System.out.print("Masukkan Nilai a :");
        a = Masukkan.nextInt();
        System.out.print("Masukkan Nilai b :");
        b = Masukkan.nextInt();
        System.out.print("Masukkan Nilai c :");
        c = Masukkan.nextInt();
        System.out.println();
        System.out.println("Jumlah a+b :"+(jumlah(a,b)));
        System.out.println("Jumlah b+c :"+(jumlah(b,c)));
        System.out.println("Jumlah a+c :"+(jumlah(a,c)));
    }
    //konstruktor
    private static int jumlah(int a, int b){
        int hasil = a + b;
        return hasil;
    } 
}