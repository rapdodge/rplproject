/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rental1;
import java.util.Scanner;
/**
 *
 * @author Rifqi
 */
public class rental {

    int hari;
    int sewa;
    double mobil;
    
        public rental(int sewa){
            this.sewa=sewa;
            System.out.println("Sewa perhari : "+sewa);
        }
        public rental(int mobil, int hari){
            this.mobil=mobil;
            this.hari=hari;
            int byr = mobil*hari;
            System.out.println("Sewa perhari : "+byr);
        }
        public static void pilihan(){
            Scanner input = new Scanner(System.in);
            System.out.println("1. Roda 2 ");
            System.out.println("2. Roda 4 ");
            System.out.println("Silahkan Pilih kendaraan : ");
            int pilih = input.nextInt();
            switch(pilih){
                case 1 : rental.roda2();
                case 2 : rental.roda4();
            }
        }
        public static void roda2(){
            Scanner input = new Scanner(System.in);
            System.out.println("=====================");
            System.out.println("Pilih Jenis Motor");
            System.out.println("=====================");
            System.out.println("1. Honda Vario");
            System.out.println("2. Hoda Beat");
            System.out.println("3. Yamaha NMAX");
            System.out.println("4. Yamaha Mio");
            System.out.println("Masukkan Pilihan : ");
            int pilih1 = input.nextInt();
            switch(pilih1){
                case 1 : {
                    rental vario = new rental(80000);
                    vario.tampilroda2();
                }
                case 2 : {
                    rental beat = new rental(70000);
                    beat.tampilroda2();
                }
                case 3 : {
                    rental nmax = new rental(100000);
                    nmax.tampilroda2();
                }
                case 4 : {
                    rental mio = new rental(30000);
                    mio.tampilroda2();
                }
            }
        }
        public static void roda4(){
            Scanner input = new Scanner(System.in);
            System.out.println("=====================");
            System.out.println("Pilih Jenis Mobil");
            System.out.println("=====================");
            System.out.println("1. Avanza");
            System.out.println("2. Xenia");
            System.out.println("3. Jazz");
            System.out.println("4. Yaris");
            System.out.println("Masukkan Pilihan : ");
            int pilih2 = input.nextInt();
            switch(pilih2){
                case 1 : {
                    rental avanza = new rental(400000,1);
                    avanza.tampilroda4();
                }
                case 2 : {
                    rental xenia = new rental(300000,1);
                    xenia.tampilroda4();
                }
                case 3 : {
                    rental jazz = new rental(350000,1);
                    jazz.tampilroda4();
                }
                case 4 : {
                    rental yaris = new rental(250000,1);
                    yaris.tampilroda4();
                }
            }
        }
        void tampilroda2(){
            int jumlahhariR2;
            Scanner input = new Scanner(System.in);
            System.out.print("Lama Sewa : ");
            int jmhari=input.nextInt();
            jumlahhariR2=jmhari*sewa;
            System.out.println("Anda memilih motor");
            System.out.println("Dengan harga sewa : "+jumlahhariR2);
        }
        void tampilroda4(){
            int jumlahhari;
            Scanner input = new Scanner(System.in);
            System.out.print("Lama Sewa : ");
            int jmhari=input.nextInt();
            jumlahhari=(int)(jmhari*mobil*hari);
            System.out.println("Anda memilih mobil");
            System.out.println("Dengan harga sewa : "+jumlahhari);
        }
}