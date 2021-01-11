package homework2;

import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {
        System.out.println("Žaidimo pasirinkimai:");
        System.out.println("1. Akmuo");
        System.out.println("2. Zirkles");
        System.out.println("3. Popierius");
        System.out.println("0. Pabaiga");

        System.out.println();

        int i;
        int zmogus_akmuo = 0;
        int kompas_akmuo = 0;
        int zmogus_zirkles = 0;
        int kompas_zirkles = 0;
        int zmogus_popierius = 0;
        int kompas_popierius = 0;
        int zmogus_pergales = 0;
        int kompas_pergales = 0;
        int lygiosios = 0;
        
//        System.out.println("Zaidimo numeris" + i);
        System.out.println();
  
        for ( i = 1; i <= 8; i++){
            System.out.println("Zaidejo pasirinkimas");
            Scanner sc = new Scanner(System.in);
            System.out.println("Irasykite pasirinkta skaiciu!");

            int zmogus_renkasi = sc.nextInt();
            if (zmogus_renkasi == 1) {
                zmogus_akmuo++;
            }
            if (zmogus_renkasi == 2) {
                zmogus_zirkles++;
            }
            if (zmogus_renkasi == 3) {
                zmogus_popierius++;
            }
            System.out.println();
            if (zmogus_renkasi == 0) {
                System.out.println("PABAIGA!");
                break;
            }
            if (zmogus_renkasi > 3) {
                System.out.println("Zmogau, NEGALIMA rasyti didesnio skaiciaus nei 3! ");
                i = i - 1; //kad neiskaiciuotu i statistika, kaip ivykusi losima
                continue;
            }
            System.out.println("Kompiuterio pasirinkimas");
            System.out.println("Kompiuteris iraso pasirinkta skaiciu!");

            int kompas_renkasi = (int) (Math.random() * 3) + 1;

            if (kompas_renkasi == 1) {
                kompas_akmuo++;
            }
            if (kompas_renkasi == 2) {
                kompas_zirkles++;
            }
            if (kompas_renkasi == 3) {
                kompas_popierius++;
            }
            System.out.println(kompas_renkasi);

            System.out.println();

// KURIS LAIMI?
            if (zmogus_renkasi == 1 && kompas_renkasi == 2) {
                System.out.println("ZMOGUS LAIMEJO");
                System.out.println();
                zmogus_pergales = zmogus_pergales + 1;
            }
            if (zmogus_renkasi == 2 && kompas_renkasi == 3) {
                System.out.println("ZMOGUS LAIMEJO");
                System.out.println();
                zmogus_pergales = zmogus_pergales + 1;
            }
            if (zmogus_renkasi == 3 && kompas_renkasi == 1) {
                System.out.println("ZMOGUS LAIMEJO");
                System.out.println();
                zmogus_pergales = zmogus_pergales + 1;
            }
            if (kompas_renkasi == 1 && zmogus_renkasi == 2) {
                System.out.println("KOMPAS LAIMEJO");
                System.out.println();
                kompas_pergales = kompas_pergales + 1;
            }
            if (kompas_renkasi == 2 && zmogus_renkasi == 3) {
                System.out.println("KOMPAS LAIMEJO");
                System.out.println();
                kompas_pergales = kompas_pergales + 1;
            }
            if (kompas_renkasi == 3 && zmogus_renkasi == 1) {
                System.out.println("KOMPAS LAIMEJO");
                System.out.println();
                kompas_pergales = kompas_pergales + 1;
            }
            if (kompas_renkasi == zmogus_renkasi) {
                System.out.println("LYGIOSIOS");
                System.out.println();
                lygiosios = lygiosios + 1;
            }
        }
        System.out.println("ZAIDIMO PABAIGA");
        System.out.println("******************");
        System.out.println("STATISTIKA:");
        System.out.println();
        
// STATISTIKOS SKAICIAVIMAS
        System.out.println("VISO BUVO SUZAISTA" + " " + (i - 1) + " " + "KARTUS");
        
        System.out.println("ZMOGUS LAIMEJO" + " " + zmogus_pergales);
        System.out.println("ZMOGUS LAIMEJO" + " " +  (float) (zmogus_pergales * 100) / (i - 1) + "%");
        System.out.println();

        System.out.println("KOMPAS LAIMEJO" + " " + kompas_pergales);
        System.out.println("KOMPAS LAIMEJO" + " " + (float) (kompas_pergales * 100) / (i - 1) + "%");
        System.out.println();
        System.out.println("LYGIOSIOS" + " " + lygiosios);
        System.out.println("LYGIOSIOS" + " " + (float) (lygiosios * 100) / (i - 1) + "%");
    }
}
