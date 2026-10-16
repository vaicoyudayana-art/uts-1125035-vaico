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


    

        public int inputJumlahPesanan() {
        System.out.print("Masukkan Jumlah Pesanan: ");
            int jumlah = Integer.parseInt(scanner.nextLine());
            return jumlah;
        }
}
