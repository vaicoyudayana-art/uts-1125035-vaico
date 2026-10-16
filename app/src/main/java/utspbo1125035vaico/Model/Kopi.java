package main.java.utspbo1125035vaico.Model;

import main.java.utspbo1125035vaico.MenuItem;

public class Kopi extends MenuItem implements Customizable{
    private int rum = 0, es = 0, gula = 0, karamel = 0;

    public Kopi(int ID, String Nama, double hargaBase, int stok) {
        super(ID, Nama, hargaBase, stok);
    }
    @Override
    public double hitungHargaTotal() {
        return hargaBase + (rum * 3000) + (karamel * 3000); 
    }

    @Override
    public String getOrderDetail() {
        return nama + " [Rum: " + rum + ", Es: " + es + ", Gula: " + gula + ", Karamel: " + karamel + "]";
    }

}
