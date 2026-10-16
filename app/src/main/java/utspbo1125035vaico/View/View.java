package main.java.utspbo1125035vaico.View;
import main.java.utspbo1125035vaico.MenuItem;
import java.util.List;
import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);
        public void tampilkanMenuAwal(List<MenuItem> daftarMenu) {
        System.out.println("Menu Coffee Shop");
        for (MenuItem menu : daftarMenu) {
            System.out.println(menu.getId() + ": " + menu.getNama() + " (Stok: " + menu.getStok() + ") - Rp" + menu.getHargaBase());
        }
        System.out.println("===============================");
    }

    String InputIdMenu () {
        System.out.print("Insert ID Menu");
        return scanner.nextLine();
    }

    int InputJumlahPesanan() {
        System.out.print("Insert Jumlah yang ingin dipesan");
        int jumlah = Integer.parseInt(scanner.nextLine());
        return jumlah;
    }

    public int[] inputPesananKopi() {
        System.out.println("Customizable Coffee");
        System.out.print("Jumlah Takaran Rum (0-1) [+Rp3000]: ");
        int rum = Integer.parseInt(scanner.nextLine());
        System.out.print("Jumlah Takaran Es (0-5) [Free]: ");
        int es = Integer.parseInt(scanner.nextLine());
        System.out.print("Jumlah Takaran Gula (0-5) [Free]: ");
        int gula = Integer.parseInt(scanner.nextLine());
        System.out.print("Jumlah Takaran Karamel (0-5) [+Rp3000]: ");
        int karamel = Integer.parseInt(scanner.nextLine());
        return new int[]{rum, es, gula, karamel};
    }

        public int[] inputPesananTeh() {
        System.out.println("Customizable Teh");
        System.out.print("Jumlah Takaran Boba (0-1) [+Rp3000]: ");
        int rum = Integer.parseInt(scanner.nextLine());
        System.out.print("Jumlah Takaran Es (0-5) [Free]: ");
        int es = Integer.parseInt(scanner.nextLine());
        System.out.print("Jumlah Takaran Gula (0-5) [Free]: ");
        int gula = Integer.parseInt(scanner.nextLine());
        System.out.print("Jumlah Takaran Karamel (0-5) [+Rp3000]: ");
        int karamel = Integer.parseInt(scanner.nextLine());
        return new int[]{rum, es, gula, karamel};
    }

        public int[] inputPesananRoti() {
        System.out.println("Customizable Roti");
        System.out.print("Jumlah Takaran Meses (0-1) [+Rp3000]: ");
        int rum = Integer.parseInt(scanner.nextLine());
        System.out.print("Jumlah Takaran Gula (0-5) [Free]: ");
        int gula = Integer.parseInt(scanner.nextLine());
        System.out.print("Jumlah Takaran Karamel (0-5) [+Rp3000]: ");
        int karamel = Integer.parseInt(scanner.nextLine());
        return new int[]{rum, es, gula, karamel};
    }

 public void cetakStruk(MenuItem item, int jumlah, double totalHarga) {
     System.out.println "Struk Pesanan";
 
    }
}



        

